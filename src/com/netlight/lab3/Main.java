package com.netlight.lab3;

class Circle3{
    int x,y,rad;
    Circle3(int x, int y, int rad){
        this.x=x;
        this.y=y;
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{"+
                "x=" + x +
                ", y=" + y +
                ", radius=" + rad +
                '}';
    }
}

class Human{
    Head head = new Head();
    Hand hand = new Hand(20);
    Leg leg = new Leg(20);

    @Override
    public String toString() {
        return "Human{" +
                "hands_length=" + hand.length +
                ", legs_length=" + leg.length +
                '}';
    }

    class Leg{
        int length;
        Leg(int length){
            this.length = length;
        }
    }
    class Hand{
        int length;
        Hand(int length){
            this.length = length;
        }
    }
    class Head{

    }
}

class Book{
    String author;
    String name;
    int year;
    Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

public class Main{
    public static void main(String[] args) {
        Human human = new Human();
        Circle3 cr = new Circle3(20, 20, 10);
        Book book = new Book("Author","Title",2020);
        System.out.println(cr);
        System.out.println(human);
        System.out.println(book);
    }
}