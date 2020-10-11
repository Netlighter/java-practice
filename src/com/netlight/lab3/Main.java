package com.netlight.lab3;

class Circle3 {
    int x, y, rad;

    Circle3(int x, int y, int rad) {
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

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
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + rad +
                '}';
    }
}

class Human {

    RightHand rhand;
    RightHand lhand;
    RightLeg rleg;
    LeftLeg lleg;

    public Human() {
        Head head = new Head();
        rhand = new RightHand(20);
        lhand = new RightHand(20);
        rleg = new RightLeg(20);
        lleg = new LeftLeg(20);
    }

    @Override
    public String toString() {
        return "Human{" +
                "rhand=" + rhand.length +
                ", lhand=" + lhand.length +
                ", rleg=" + rleg.length +
                ", lleg=" + lleg.length +
                ", head=default" +
                '}';
    }

    static class LeftHand {
        int length;

        LeftHand(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }

    class RightLeg {
        int length;

        RightLeg(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }

    class LeftLeg {
        int length;

        LeftLeg(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }

    class RightHand {
        int length;

        RightHand(int length) {
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

    }

    class Head {
    }
}

class Book {
    String author;
    String name;
    int year;

    Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.rhand.setLength(30);
        Circle3 cr = new Circle3(20, 20, 10);
        Book book = new Book("Author", "Title", 2020);
        System.out.println(cr);
        System.out.println(human);
        System.out.println(book);
    }
}