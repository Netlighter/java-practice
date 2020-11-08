package com.netlight.lab17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static String labNum;
    static HashMap filesMap = new HashMap();
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter("README.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getContents(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] contents = file.list();
            for (String s : contents) {
                if (path.contains("lab"))
                    labNum = path.split("lab")[1];
                else if (path.contains("extra"))
                    labNum = "extra";
                getContents(path + "/" + s);
            }
        }

        ArrayList labFiles = new ArrayList();
        if (file.isFile()) {
            StringBuilder sb = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                sb.append(file.getName());
                sb.append("\n```java\n");
                String line = reader.readLine();
                while (line != null) {
                    sb.append(line + "\n");
                    line = reader.readLine();
                }
                sb.append("```\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            labFiles.add(sb);

            System.out.println("Checking " + labNum + " on " + file.getName());
            if (filesMap.get(labNum) != null) {
                ArrayList newFiles = (ArrayList) filesMap.get(labNum);
                newFiles.add(sb);
                filesMap.put(labNum, newFiles);
            } else
                filesMap.put(labNum, labFiles);
        }
    }

    public static void main(String[] args) {
        Path filePath = Paths.get("").toAbsolutePath();
        getContents(filePath.toString() + "/src");
        System.out.println("Labs to generate: ");
        int labsCount = new Scanner(System.in).nextInt();
        filesMap.remove(null);

        pw.write("## Labs!\n\n");

        for (int i = 1; i < labsCount; i++) {

            if (filesMap.get(String.valueOf(i)) != null) {
                pw.write("### Lab " + i + "\n");
                for (StringBuilder code :
                        (ArrayList<StringBuilder>) filesMap.get(String.valueOf(i))) {
                    pw.write(code + "\n");
                }
            } else if (filesMap.get(i + "_" + (i + 1)) != null) {
                pw.write("### Lab " + i + "_" + (i + 1) + "\n");
                for (StringBuilder code :
                        (ArrayList<StringBuilder>) filesMap.get(i + "_" + (i + 1))) {
                    pw.write(code + "\n");
                }
            } else {
                continue;
            }
            System.out.println("Done " + i);
        }
        pw.write("###Lab Extra\n");
        for (StringBuilder code :
                (ArrayList<StringBuilder>) filesMap.get("extra"))
            pw.write(code + "\n");

        pw.close();
    }
}
