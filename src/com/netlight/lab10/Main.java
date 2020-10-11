package com.netlight.lab10;

import javax.swing.*;

public class Main {

    static double first;
    static double second;

    public static void main(String[] args) {

        JFrame root = new JFrame("Bruh Calculator");
        root.setResizable(false);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel comment = new JLabel(
                "<html><b>Калькулятор</b>, на дизайн" + "<br>" +
                        "которого не было времени" + "<br>" +
                        "потому что кое-кто узнаёт" + "<br>" +
                        "о дедлайне за 3 часа " + "<br>" +
                        "<i><b>до сдачи!</b></i></html>");
        comment.setBounds(20, 170, 300, 100);
        root.add(comment);

        JTextField fnum = new JTextField("First?");
        JTextField snum = new JTextField("Second?");
        JLabel output = new JLabel("There is an output!");

        fnum.setBounds(20, 10, 120, 40);
        snum.setBounds(20, 100, 120, 40);
        output.setBounds(20, 140, 160, 40);

        root.add(fnum);
        root.add(snum);
        root.add(output);

        JButton sumbtn = new JButton("+");
        JButton subbtn = new JButton("-");
        JButton mulbtn = new JButton("*");
        JButton divbtn = new JButton("/");

        sumbtn.addActionListener(action -> {
            try {
                first = Double.parseDouble(fnum.getText());
                second = Double.parseDouble(snum.getText());
                output.setText(String.valueOf(first + second));
            } catch (NumberFormatException e) {
                output.setText("Input is not Number!");
            }
        });

        subbtn.addActionListener(action -> {
            try {
                first = Double.parseDouble(fnum.getText());
                second = Double.parseDouble(snum.getText());
                output.setText(String.valueOf(first - second));
            } catch (NumberFormatException e) {
                output.setText("Input is not Number!");
            }

        });

        mulbtn.addActionListener(action -> {
            try {
                first = Double.parseDouble(fnum.getText());
                second = Double.parseDouble(snum.getText());
                output.setText(String.valueOf(first * second));
            } catch (NumberFormatException e) {
                output.setText("Input is not Number!");
            }

        });

        divbtn.addActionListener(action -> {
            try {
                first = Double.parseDouble(fnum.getText());
                second = Double.parseDouble(snum.getText());
                output.setText(String.format("%.4f", first / second));
            } catch (NumberFormatException e) {
                output.setText("Input is not Number!");
            }

        });

        sumbtn.setBounds(0, 60, 40, 40);
        subbtn.setBounds(40, 60, 40, 40);
        mulbtn.setBounds(80, 60, 40, 40);
        divbtn.setBounds(120, 60, 40, 40);

        root.add(sumbtn);
        root.add(subbtn);
        root.add(mulbtn);
        root.add(divbtn);

        root.setSize(200, 300);
        root.setLayout(null);
        root.setVisible(true);

    }
}
