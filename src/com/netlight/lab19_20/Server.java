package com.netlight.lab19_20;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Server {

    static int offset = 0;
    static DatagramSocket dgSocket;
    static DatagramPacket packet;
    static DatagramPacket toPacket;
    static StringBuilder historyStr = new StringBuilder();
    static HashMap<String, String> nickIPMap = new HashMap<>();
    static ArrayList<InetAddress> IPList = new ArrayList<>();
    static ArrayList<Integer> portList = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[2048];
        String packetAddr;
        StringBuilder msgStr = new StringBuilder();
        String msg;
        dgSocket = new DatagramSocket(1337);
        packet = new DatagramPacket(buffer, offset, buffer.length);


        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy [HH:mm]");
        Date date;
        File f = new File("src/com/netlight/lab19_20/history.txt");
        f.createNewFile();

        while (true) {
            dgSocket.receive(packet);
            msg = new String(buffer, offset, packet.getLength());
            date = new Date();
            msgStr.append(dateFormat.format(date) + " ");
            packetAddr = packet.getAddress().getHostAddress() + ":" + packet.getPort();

            if (nickIPMap.get(packetAddr) == null || !portList.contains(packet.getPort())) {
                nickIPMap.put(packetAddr, msg);
                System.out.println(packetAddr + " connected!");
                msgStr.append("<Server> Hello, " + msg);

                IPList.add(packet.getAddress());
                portList.add(packet.getPort());

            } else
                msgStr.append("<" + nickIPMap.get(packetAddr) + "> " + msg);

            for (int i = 0; i < IPList.size(); i++) {
                toPacket = new DatagramPacket(
                        msgStr.toString().getBytes(),
                        offset,
                        msgStr.length(),
                        IPList.get(i),
                        portList.get(i));
                dgSocket.send(toPacket);
            }

            System.out.println(msgStr);
            historyStr.append(msgStr.toString() + "\n");
            msgStr = new StringBuilder();
            try (PrintWriter wf = new PrintWriter(f)) {
                wf.write(historyStr.toString());
            } catch (IOException e) {
                e.getStackTrace();
            }

        }
    }
}

