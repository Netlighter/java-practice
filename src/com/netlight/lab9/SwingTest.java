package com.netlight.lab9;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SwingTest extends JFrame {

    public SwingTest() {
        AtomicInteger count = new AtomicInteger();
        setTitle("Bruh");
        setSize(500, 500);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Bruh Zone"));
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(10);
        add(panel);
        JButton btn = new JButton("Bruh!");
        btn.addActionListener((action) -> {
            System.out.println("Bruh!");
        });

        panel.add(btn);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
