package com.netlight.lab25_26;

public class Main {
    public static void main(String[] args) {
        BetterMap test = new BetterMap();

        test.add(1337, "leet");
        test.add(1, "first");
        test.add(222, "hello!!!");

        System.out.println("try to get 1: " + test.get(1));
        System.out.println("try to get 222: " + test.get(222));
        System.out.println("when get 13: " + test.get(13));
        System.out.println("or get 1337: " + test.get(1337));
        System.out.println("remove 1: " + test.remove(1));
        System.out.println("anybody there?");

        for (Object obj : test) {
            System.out.println(obj);
        }
    }
}
