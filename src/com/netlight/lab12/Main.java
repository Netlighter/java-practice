package com.netlight.lab12;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";

    public static void printc(String text, EnumEx code) {
        String ANSI_COLOR = "\u001B[" + code.getKey() + "m";
        System.out.println(ANSI_COLOR + text + ANSI_RESET);
    }

    public static void main(String[] args) {
        printc("It's yellow!", EnumEx.YELLOW);
        printc("wait, red?", EnumEx.RED);
        printc("YES.", EnumEx.GREEN);
    }
}
