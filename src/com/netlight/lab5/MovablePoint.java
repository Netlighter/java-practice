package com.netlight.lab5;

public class MovablePoint implements Movable {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.print("Moved on " + x + " by x and " + y + " by y");
    }
}
