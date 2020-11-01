package com.netlight.lab15_16;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int exitCode = 0;

        while (exitCode != -1) {
            exitCode = sc.nextInt();
            if (exitCode != -1) input.add(exitCode);
        }
        graph.emulate(input);
    }
}
