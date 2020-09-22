package com.netlight.lab5;

public class Main {
    public static void main(String[] args) {
        MovableCircle mc = new MovableCircle();
        mc.setCenter(10, 20);

        MovableRectangle mr = new MovableRectangle(30, 30, 50, 60);


        System.out.println("Circle:");
        System.out.println(mc.toString());
        mc.move(40, 50);
        System.out.println(mc.toString());

        System.out.println("Rectangle:");
        System.out.println(mr.toString());
        mr.setHeight(20);
        mr.setWidth(530);
        System.out.println(mr.toString());
        mr.move(30, 30);
        System.out.println(mr.toString());

    }
}
