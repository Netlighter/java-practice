package com.netlight.lab4;

abstract class Shape{
    String color;
    boolean filled;
    Shape(){};
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
    public void setFilled( boolean filled) { this.filled = filled; }
    public boolean isFilled() { return filled; }

    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends Shape{
    double radius;
    Circle(){};
    Circle(double radius_){
        this.radius = radius;
    }
    Circle(double radius, String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    double getArea() { return Math.PI*Math.pow(getRadius(),2); }

    @Override
    double getPerimeter() { return Math.PI*radius*2; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}

class Rectangle extends Shape{
    double width,height;
    Rectangle(){};
    Rectangle(double width_, double height_){
        this.width = width;
        this.height = height;
    }
    Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    @Override
    double getArea() { return width*height; }

    @Override
    double getPerimeter() { return 2*(width+height); }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", is filled: "+isFilled()+
                ", color = " + getColor()+
                '}';
    }
}

class Square extends Rectangle{
    double side;
    Square(){};
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    @Override
    public void setWidth(double side) {
        super.width = super.height = side;
    }
    public void setHeight(double side) {
        super.width = super.height = side;
    }
}

public class Main {

    public static void main(String[] args){
        Square sq = new Square(15,"red",true);
        Square sq1 = new Square(20,"green",true);
        System.out.println(sq);
        System.out.println(sq1);
    }
}
