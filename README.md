## Labs!

### Lab 1
Main.java
```java
package com.netlight.lab1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.");

        int[] arr = {34, 53, 63, 4190, 93};
        int x;
        int sum = 0;
        int len = arr.length - 1;
        for (x = 0; x < len; x++)
            sum += arr[x];
        while (x < len)
            sum += arr[x];
        do sum += arr[x];
        while (x < len);

        System.out.println(sum / 3);

        System.out.println("2.");

        System.out.println("args length " + args.length);
        for (x = 0; x < args.length - 1; x++)
            System.out.println(args[x]);

        System.out.println("3.");

        System.out.print("1/1");
        for (x = 2; x < 11; x++) {
            System.out.print(" + 1/" + x);
        }
        System.out.println();
        System.out.println("4.");

        int[] randarr = new int[10];

        // can relate
        Random R = new Random();
        R.nextInt();

        for (x = 0; x < randarr.length; x++)
            randarr[x] = 0 + (int) (Math.random() * 100);
        for (int y : randarr)
            System.out.print(y + " ");
        System.out.println();
        Arrays.sort(randarr);

        for (int y : randarr)
            System.out.print(y + " ");

        System.out.println();
        System.out.println("5.");

        System.out.println(fact(10));

    }

    public static int fact(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++)
            result = result * x;
        return result;
    }
}


```

### Lab 2
Main.java
```java
package com.netlight.lab2;


class Shape {
    int field1;
    String name;
    boolean is_done;
    int age;

    @Override
    public String toString() {
        System.out.println("why!");
        return "Shape{" +
                "field1=" + field1 +
                ", name='" + name + '\'' +
                ", is_done=" + is_done +
                ", age=" + age +
                '}';
    }
}

class Dog {
    String name;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int humanize() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DogNursery {
    Dog[] beds = new Dog[10];
    int last_bed;

    public DogNursery() {
        int last_bed = 0;
    }

    public void add(Dog dog) {
        beds[last_bed] = dog;
        last_bed++;
        System.out.println("success");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog Sparky = new Dog("Sparky");
        Sparky.setAge(5);
        System.out.println(Sparky.humanize());

        DogNursery nurs = new DogNursery();
        nurs.add(Sparky);
    }
}
```

### Lab 3
Main.java
```java
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
```

### Lab 4
Circle.java
```java
package com.netlight.lab4;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    Circle(double radius_) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", is filled: " + isFilled() +
                ", color = " + getColor() +
                '}';
    }
}
```

Rectangle.java
```java
package com.netlight.lab4;

public class Rectangle extends Shape {
    protected double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", is filled: " + isFilled() +
                ", color = " + getColor() +
                '}';
    }
}
```

Main.java
```java
package com.netlight.lab4;

public class Main {

    public static void main(String[] args) {
        Square sq = new Square(15, "red", true);
        Square sq1 = new Square(20, "green", true);
        System.out.println(sq);
        System.out.println(sq1);
    }
}
```

Square.java
```java
package com.netlight.lab4;

class Square extends Rectangle {
    double side;

    Square() {
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.width = super.height = side;
    }

    public void setHeight(double side) {
        super.width = super.height = side;
    }
}
```

Shape.java
```java
package com.netlight.lab4;

abstract class Shape {
    String color;
    boolean filled;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
```

### Lab 5
Movable.java
```java
package com.netlight.lab5;

public interface Movable {
    void move(int x, int y);
}
```

MovableCircle.java
```java
package com.netlight.lab5;

import com.netlight.lab4.Circle;

public class MovableCircle extends Circle implements Movable {

    private final MovablePoint center = new MovablePoint();

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public void move(int x, int y) {
        center.move(x, y);
        System.out.println(" for center");
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
```

MovableRectangle.java
```java
package com.netlight.lab5;


import com.netlight.lab4.Rectangle;

public class MovableRectangle extends Rectangle implements Movable {

    private final MovablePoint topLeft = new MovablePoint();
    private final MovablePoint bottomRight = new MovablePoint();


    public MovableRectangle(int x1, int y1, int x2, int y2) {
        if (x1 > x2) {
            topLeft.setX(x2);
            bottomRight.setX(x1);
        } else if (x2 < x1) {
            topLeft.setX(x1);
            bottomRight.setX(x2);
        }
        if (y1 > y2) {
            topLeft.setY(y1);
            bottomRight.setY(y2);
        } else if (y2 > y1) {
            topLeft.setY(y2);
            bottomRight.setY(y1);
        }

        width = bottomRight.getX() - topLeft.getX();
        height = topLeft.getY() - bottomRight.getY();
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    @Override
    public void setHeight(double h) {
        bottomRight.move(0, (int) (h - height));
        System.out.println(" for bottom right");
        height = h;
    }

    @Override
    public void setWidth(double w) {
        bottomRight.move((int) (w - width), 0);
        System.out.println(" for bottom right");
        width = w;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void move(int x, int y) {
        topLeft.move(x, y);
        System.out.println(" for top left");
        bottomRight.move(x, y);
        System.out.println(" for bottom right");
    }
}
```

Main.java
```java
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
```

MovablePoint.java
```java
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
```

### Lab 6
Main.java
```java
package com.netlight.lab6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int win = 0;

    static void justPrint(int[][] p) {
        for (int[] x : p) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void path(int[][] sum, int[][] orig, int x, int y) {

        if (x == 0 && y == 0) {
            System.out.println("Sum is " + win);
            System.out.println();
            System.out.println("Path is:");
            return;
        }
        if (x == 0) {
            win += orig[x][y - 1];
            path(sum, orig, x, y - 1);
            System.out.println(x + " " + y);
        } else if (y == 0) {
            win += orig[x - 1][y];
            path(sum, orig, x - 1, y);
            System.out.println(x + " " + y);
        } else if (sum[x - 1][y] > sum[x][y - 1]) {
            win += orig[x - 1][y];
            path(sum, orig, x - 1, y);
            System.out.println(x + " " + y);
        } else if (sum[x - 1][y] < sum[x][y - 1]) {
            win += orig[x][y - 1];
            path(sum, orig, x, y - 1);
            System.out.println(x + " " + y);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int size = sc.nextInt();

        int[][] original = new int[size][size];
        int[][] summed = new int[size][size];

        Random r = new Random();
        System.out.println("Generating " + size * size + " values...\n");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                original[i][j] = (int) (Math.random() * ((100 - (-100)) + 1) + (-100));
            }
        }
        System.out.println("Array is:");
        justPrint(original);

        int opa = summed.length;

        for (int x = 0; x < opa; x++) {
            for (int y = 0; y < opa; y++) {
                if (x == 0 && y == 0) summed[x][y] = original[x][y];
                else if (x == 0) summed[x][y] = original[x][y - 1] + original[x][y];
                else if (y == 0) summed[x][y] = original[x - 1][y] + original[x][y];
                else summed[x][y] = Math.max(original[x - 1][y], original[x][y - 1]) + original[x][y];
            }
        }
        win = original[opa - 1][opa - 1];

        System.out.println("Summed array:");
        justPrint(summed);
        path(summed, original, opa - 1, opa - 1);


    }

}
```

### Lab 7_8
Manager.java
```java
package com.netlight.lab7_8;

public class Manager implements EmployeePosition {
    private double income;

    @Override
    public String getJobTitle() {
        return "Manager";
    }


    double generateIncome() {
        this.income = 115000 + Math.random() * 25000;
        return this.income;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (income * 0.05);
    }
}
```

Operator.java
```java
package com.netlight.lab7_8;

public class Operator implements EmployeePosition {
    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
```

EmployeePosition.java
```java
package com.netlight.lab7_8;

public interface EmployeePosition {
    Company com = null;

    String getJobTitle();

    double calcSalary(double baseSalary);
}
```

Names.java
```java
package com.netlight.lab7_8;

public class Names {
    public String[] lastname = {
            "Abbott",
            "Acevedo",
            "Acosta",
            "Adams",
            "Adkins",
            "Aguilar",
            "Aguirre",
            "Albert",
            "Alexander",
            "Alford",
            "Allen",
            "Allison",
            "Alston",
            "Alvarado",
            "Alvarez",
            "Anderson",
            "Andrews",
            "Anthony",
            "Armstrong",
            "Arnold",
            "Ashley",
            "Atkins",
            "Atkinson",
            "Austin",
            "Avery",
            "Avila",
            "Ayala",
            "Ayers",
            "Bailey",
            "Baird",
            "Baker",
            "Baldwin",
            "Ball",
            "Ballard",
            "Banks",
            "Barber",
            "Barker",
            "Barlow",
            "Barnes",
            "Barnett",
            "Barr",
            "Barrera",
            "Barrett",
            "Barron",
            "Barry",
            "Bartlett",
            "Barton",
            "Bass",
            "Bates",
            "Battle",
            "Bauer",
            "Baxter",
            "Beach",
            "Bean",
            "Beard",
            "Beasley",
            "Beck",
            "Becker",
            "Bell",
            "Bender",
            "Benjamin",
            "Bennett",
            "Benson",
            "Bentley",
            "Benton",
            "Berg",
            "Berger",
            "Bernard",
            "Berry",
            "Best",
            "Bird",
            "Bishop",
            "Black",
            "Blackburn",
            "Blackwell",
            "Blair",
            "Blake",
            "Blanchard",
            "Blankenship",
            "Blevins",
            "Bolton",
            "Bond",
            "Bonner",
            "Booker",
            "Boone",
            "Booth",
            "Bowen",
            "Bowers",
            "Bowman",
            "Boyd",
            "Boyer",
            "Boyle",
            "Bradford",
            "Bradley",
            "Bradshaw",
            "Brady",
            "Branch",
            "Bray",
            "Brennan",
            "Brewer",
            "Bridges",
            "Briggs",
            "Bright",
            "Britt",
            "Brock",
            "Brooks",
            "Brown",
            "Browning",
            "Bruce",
            "Bryan",
            "Bryant",
            "Buchanan",
            "Buck",
            "Buckley",
            "Buckner",
            "Bullock",
            "Burch",
            "Burgess",
            "Burke",
            "Burks",
            "Burnett",
            "Burns",
            "Burris",
            "Burt",
            "Burton",
            "Bush",
            "Butler",
            "Byers",
            "Byrd",
            "Cabrera",
            "Cain",
            "Calderon",
            "Caldwell",
            "Calhoun",
            "Callahan",
            "Camacho",
            "Cameron",
            "Campbell",
            "Campos",
            "Cannon",
            "Cantrell",
            "Cantu",
            "Cardenas",
            "Carey",
            "Carlson",
            "Carney",
            "Carpenter",
            "Carr",
            "Carrillo",
            "Carroll",
            "Carson",
            "Carter",
            "Carver",
            "Case",
            "Casey",
            "Cash",
            "Castaneda",
            "Castillo",
            "Castro",
            "Cervantes",
            "Chambers",
            "Chan",
            "Chandler",
            "Chaney",
            "Chang",
            "Chapman",
            "Charles",
            "Chase",
            "Chavez",
            "Chen",
            "Cherry",
            "Christensen",
            "Christian",
            "Church",
            "Clark",
            "Clarke",
            "Clay",
            "Clayton",
            "Clements",
            "Clemons",
            "Cleveland",
            "Cline",
            "Cobb",
            "Cochran",
            "Coffey",
            "Cohen",
            "Cole",
            "Coleman",
            "Collier",
            "Collins",
            "Colon",
            "Combs",
            "Compton",
            "Conley",
            "Conner",
            "Conrad",
            "Contreras",
            "Conway",
            "Cook",
            "Cooke",
            "Cooley",
            "Cooper",
            "Copeland",
            "Cortez",
            "Cote",
            "Cotton",
            "Cox",
            "Craft",
            "Craig",
            "Crane",
            "Crawford",
            "Crosby",
            "Cross",
            "Cruz",
            "Cummings",
            "Cunningham",
            "Curry",
            "Curtis",
            "Dale",
            "Dalton",
            "Daniel",
            "Daniels",
            "Daugherty",
            "Davenport",
            "David",
            "Davidson",
            "Davis",
            "Dawson",
            "Day",
            "Dean",
            "Decker",
            "Dejesus",
            "Delacruz",
            "Delaney",
            "Deleon",
            "Delgado",
            "Dennis",
            "Diaz",
            "Dickerson",
            "Dickson",
            "Dillard",
            "Dillon",
            "Dixon",
            "Dodson",
            "Dominguez",
            "Donaldson",
            "Donovan",
            "Dorsey",
            "Dotson",
            "Douglas",
            "Downs",
            "Doyle",
            "Drake",
            "Dudley",
            "Duffy",
            "Duke",
            "Duncan",
            "Dunlap",
            "Dunn",
            "Duran",
            "Durham",
            "Dyer",
            "Eaton",
            "Edwards",
            "Elliott",
            "Ellis",
            "Ellison",
            "Emerson",
            "England",
            "English",
            "Erickson",
            "Espinoza",
            "Estes",
            "Estrada",
            "Evans",
            "Everett",
            "Ewing",
            "Farley",
            "Farmer",
            "Farrell",
            "Faulkner",
            "Ferguson",
            "Fernandez",
            "Ferrell",
            "Fields",
            "Figueroa",
            "Finch",
            "Finley",
            "Fischer",
            "Fisher",
            "Fitzgerald",
            "Fitzpatrick",
            "Fleming",
            "Fletcher",
            "Flores",
            "Flowers",
            "Floyd",
            "Flynn",
            "Foley",
            "Forbes",
            "Ford",
            "Foreman",
            "Foster",
            "Fowler",
            "Fox",
            "Francis",
            "Franco",
            "Frank",
            "Franklin",
            "Franks",
            "Frazier",
            "Frederick",
            "Freeman",
            "French",
            "Frost",
            "Fry",
            "Frye",
            "Fuentes",
            "Fuller",
            "Fulton",
            "Gaines",
            "Gallagher",
            "Gallegos",
            "Galloway",
            "Gamble",
            "Garcia",
            "Gardner",
            "Garner",
            "Garrett",
            "Garrison",
            "Garza",
            "Gates",
            "Gay",
            "Gentry",
            "George",
            "Gibbs",
            "Gibson",
            "Gilbert",
            "Giles",
            "Gill",
            "Gillespie",
            "Gilliam",
            "Gilmore",
            "Glass",
            "Glenn",
            "Glover",
            "Goff",
            "Golden",
            "Gomez",
            "Gonzales",
            "Gonzalez",
            "Good",
            "Goodman",
            "Goodwin",
            "Gordon",
            "Gould",
            "Graham",
            "Grant",
            "Graves",
            "Gray",
            "Green",
            "Greene",
            "Greer",
            "Gregory",
            "Griffin",
            "Griffith",
            "Grimes",
            "Gross",
            "Guerra",
            "Guerrero",
            "Guthrie",
            "Gutierrez",
            "Guy",
            "Guzman",
            "Hahn",
            "Hale",
            "Haley",
            "Hall",
            "Hamilton",
            "Hammond",
            "Hampton",
            "Hancock",
            "Haney",
            "Hansen",
            "Hanson",
            "Hardin",
            "Harding",
            "Hardy",
            "Harmon",
            "Harper",
            "Harrell",
            "Harrington",
            "Harris",
            "Harrison",
            "Hart",
            "Hartman",
            "Harvey",
            "Hatfield",
            "Hawkins",
            "Hayden",
            "Hayes",
            "Haynes",
            "Hays",
            "Head",
            "Heath",
            "Hebert",
            "Henderson",
            "Hendricks",
            "Hendrix",
            "Henry",
            "Hensley",
            "Henson",
            "Herman",
            "Hernandez",
            "Herrera",
            "Herring",
            "Hess",
            "Hester",
            "Hewitt",
            "Hickman",
            "Hicks",
            "Higgins",
            "Hill",
            "Hines",
            "Hinton",
            "Hobbs",
            "Hodge",
            "Hodges",
            "Hoffman",
            "Hogan",
            "Holcomb",
            "Holden",
            "Holder",
            "Holland",
            "Holloway",
            "Holman",
            "Holmes",
            "Holt",
            "Hood",
            "Hooper",
            "Hoover",
            "Hopkins",
            "Hopper",
            "Horn",
            "Horne",
            "Horton",
            "House",
            "Houston",
            "Howard",
            "Howe",
            "Howell",
            "Hubbard",
            "Huber",
            "Hudson",
            "Huff",
            "Huffman",
            "Hughes",
            "Hull",
            "Humphrey",
            "Hunt",
            "Hunter",
            "Hurley",
            "Hurst",
            "Hutchinson",
            "Hyde",
            "Ingram",
            "Irwin",
            "Jackson",
            "Jacobs",
            "Jacobson",
            "James",
            "Jarvis",
            "Jefferson",
            "Jenkins",
            "Jennings",
            "Jensen",
            "Jimenez",
            "Johns",
            "Johnson",
            "Johnston",
            "Jones",
            "Jordan",
            "Joseph",
            "Joyce",
            "Joyner",
            "Juarez",
            "Justice",
            "Kane",
            "Kaufman",
            "Keith",
            "Keller",
            "Kelley",
            "Kelly",
            "Kemp",
            "Kennedy",
            "Kent",
            "Kerr",
            "Key",
            "Kidd",
            "Kim",
            "King",
            "Kinney",
            "Kirby",
            "Kirk",
            "Kirkland",
            "Klein",
            "Kline",
            "Knapp",
            "Knight",
            "Knowles",
            "Knox",
            "Koch",
            "Kramer",
            "Lamb",
            "Lambert",
            "Lancaster",
            "Landry",
            "Lane",
            "Lang",
            "Langley",
            "Lara",
            "Larsen",
            "Larson",
            "Lawrence",
            "Lawson",
            "Le",
            "Leach",
            "Leblanc",
            "Lee",
            "Leon",
            "Leonard",
            "Lester",
            "Levine",
            "Levy",
            "Lewis",
            "Lindsay",
            "Lindsey",
            "Little",
            "Livingston",
            "Lloyd",
            "Logan",
            "Long",
            "Lopez",
            "Lott",
            "Love",
            "Lowe",
            "Lowery",
            "Lucas",
            "Luna",
            "Lynch",
            "Lynn",
            "Lyons",
            "Macdonald",
            "Macias",
            "Mack",
            "Madden",
            "Maddox",
            "Maldonado",
            "Malone",
            "Mann",
            "Manning",
            "Marks",
            "Marquez",
            "Marsh",
            "Marshall",
            "Martin",
            "Martinez",
            "Mason",
            "Massey",
            "Mathews",
            "Mathis",
            "Matthews",
            "Maxwell",
            "May",
            "Mayer",
            "Maynard",
            "Mayo",
            "Mays",
            "Mcbride",
            "Mccall",
            "Mccarthy",
            "Mccarty",
            "Mcclain",
            "Mcclure",
            "Mcconnell",
            "Mccormick",
            "Mccoy",
            "Mccray",
            "Mccullough",
            "Mcdaniel",
            "Mcdonald",
            "Mcdowell",
            "Mcfadden",
            "Mcfarland",
            "Mcgee",
            "Mcgowan",
            "Mcguire",
            "Mcintosh",
            "Mcintyre",
            "Mckay",
            "Mckee",
            "Mckenzie",
            "Mckinney",
            "Mcknight",
            "Mclaughlin",
            "Mclean",
            "Mcleod",
            "Mcmahon",
            "Mcmillan",
            "Mcneil",
            "Mcpherson",
            "Meadows",
            "Medina",
            "Mejia",
            "Melendez",
            "Melton",
            "Mendez",
            "Mendoza",
            "Mercado",
            "Mercer",
            "Merrill",
            "Merritt",
            "Meyer",
            "Meyers",
            "Michael",
            "Middleton",
            "Miles",
            "Miller",
            "Mills",
            "Miranda",
            "Mitchell",
            "Molina",
            "Monroe",
            "Montgomery",
            "Montoya",
            "Moody",
            "Moon",
            "Mooney",
            "Moore",
            "Morales",
            "Moran",
            "Moreno",
            "Morgan",
            "Morin",
            "Morris",
            "Morrison",
            "Morrow",
            "Morse",
            "Morton",
            "Moses",
            "Mosley",
            "Moss",
            "Mueller",
            "Mullen",
            "Mullins",
            "Munoz",
            "Murphy",
            "Murray",
            "Myers",
            "Nash",
            "Navarro",
            "Neal",
            "Nelson",
            "Newman",
            "Newton",
            "Nguyen",
            "Nichols",
            "Nicholson",
            "Nielsen",
            "Nieves",
            "Nixon",
            "Noble",
            "Noel",
            "Nolan",
            "Norman",
            "Norris",
            "Norton",
            "Nunez",
            "Obrien",
            "Ochoa",
            "Oconnor",
            "Odom",
            "Odonnell",
            "Oliver",
            "Olsen",
            "Olson",
            "Oneal",
            "Oneil",
            "Oneill",
            "Orr",
            "Ortega",
            "Ortiz",
            "Osborn",
            "Osborne",
            "Owen",
            "Owens",
            "Pace",
            "Pacheco",
            "Padilla",
            "Page",
            "Palmer",
            "Park",
            "Parker",
            "Parks",
            "Parrish",
            "Parsons",
            "Pate",
            "Patel",
            "Patrick",
            "Patterson",
            "Patton",
            "Paul",
            "Payne",
            "Pearson",
            "Peck",
            "Pena",
            "Pennington",
            "Perez",
            "Perkins",
            "Perry",
            "Peters",
            "Petersen",
            "Peterson",
            "Petty",
            "Phelps",
            "Phillips",
            "Pickett",
            "Pierce",
            "Pittman",
            "Pitts",
            "Pollard",
            "Poole",
            "Pope",
            "Porter",
            "Potter",
            "Potts",
            "Powell",
            "Powers",
            "Pratt",
            "Preston",
            "Price",
            "Prince",
            "Pruitt",
            "Puckett",
            "Pugh",
            "Quinn",
            "Ramirez",
            "Ramos",
            "Ramsey",
            "Randall",
            "Randolph",
            "Rasmussen",
            "Ratliff",
            "Ray",
            "Raymond",
            "Reed",
            "Reese",
            "Reeves",
            "Reid",
            "Reilly",
            "Reyes",
            "Reynolds",
            "Rhodes",
            "Rice",
            "Rich",
            "Richard",
            "Richards",
            "Richardson",
            "Richmond",
            "Riddle",
            "Riggs",
            "Riley",
            "Rios",
            "Rivas",
            "Rivera",
            "Rivers",
            "Roach",
            "Robbins",
            "Roberson",
            "Roberts",
            "Robertson",
            "Robinson",
            "Robles",
            "Rocha",
            "Rodgers",
            "Rodriguez",
            "Rodriquez",
            "Rogers",
            "Rojas",
            "Rollins",
            "Roman",
            "Romero",
            "Rosa",
            "Rosales",
            "Rosario",
            "Rose",
            "Ross",
            "Roth",
            "Rowe",
            "Rowland",
            "Roy",
            "Ruiz",
            "Rush",
            "Russell",
            "Russo",
            "Rutledge",
            "Ryan",
            "Salas",
            "Salazar",
            "Salinas",
            "Sampson",
            "Sanchez",
            "Sanders",
            "Sandoval",
            "Sanford",
            "Santana",
            "Santiago",
            "Santos",
            "Sargent",
            "Saunders",
            "Savage",
            "Sawyer",
            "Schmidt",
            "Schneider",
            "Schroeder",
            "Schultz",
            "Schwartz",
            "Scott",
            "Sears",
            "Sellers",
            "Serrano",
            "Sexton",
            "Shaffer",
            "Shannon",
            "Sharp",
            "Sharpe",
            "Shaw",
            "Shelton",
            "Shepard",
            "Shepherd",
            "Sheppard",
            "Sherman",
            "Shields",
            "Short",
            "Silva",
            "Simmons",
            "Simon",
            "Simpson",
            "Sims",
            "Singleton",
            "Skinner",
            "Slater",
            "Sloan",
            "Small",
            "Smith",
            "Snider",
            "Snow",
            "Snyder",
            "Solis",
            "Solomon",
            "Sosa",
            "Soto",
            "Sparks",
            "Spears",
            "Spence",
            "Spencer",
            "Stafford",
            "Stanley",
            "Stanton",
            "Stark",
            "Steele",
            "Stein",
            "Stephens",
            "Stephenson",
            "Stevens",
            "Stevenson",
            "Stewart",
            "Stokes",
            "Stone",
            "Stout",
            "Strickland",
            "Strong",
            "Stuart",
            "Suarez",
            "Sullivan",
            "Summers",
            "Sutton",
            "Swanson",
            "Sweeney",
            "Sweet",
            "Sykes",
            "Talley",
            "Tanner",
            "Tate",
            "Taylor",
            "Terrell",
            "Terry",
            "Thomas",
            "Thompson",
            "Thornton",
            "Tillman",
            "Todd",
            "Torres",
            "Townsend",
            "Tran",
            "Travis",
            "Trevino",
            "Trujillo",
            "Tucker",
            "Turner",
            "Tyler",
            "Tyson",
            "Underwood",
            "Valdez",
            "Valencia",
            "Valentine",
            "Valenzuela",
            "Vance",
            "Vang",
            "Vargas",
            "Vasquez",
            "Vaughan",
            "Vaughn",
            "Vazquez",
            "Vega",
            "Velasquez",
            "Velazquez",
            "Velez",
            "Villarreal",
            "Vincent",
            "Vinson",
            "Wade",
            "Wagner",
            "Walker",
            "Wall",
            "Wallace",
            "Waller",
            "Walls",
            "Walsh",
            "Walter",
            "Walters",
            "Walton",
            "Ward",
            "Ware",
            "Warner",
            "Warren",
            "Washington",
            "Waters",
            "Watkins",
            "Watson",
            "Watts",
            "Weaver",
            "Webb",
            "Weber",
            "Webster",
            "Weeks",
            "Weiss",
            "Welch",
            "Wells",
            "West",
            "Wheeler",
            "Whitaker",
            "White",
            "Whitehead",
            "Whitfield",
            "Whitley",
            "Whitney",
            "Wiggins",
            "Wilcox",
            "Wilder",
            "Wiley",
            "Wilkerson",
            "Wilkins",
            "Wilkinson",
            "William",
            "Williams",
            "Williamson",
            "Willis",
            "Wilson",
            "Winters",
            "Wise",
            "Witt",
            "Wolf",
            "Wolfe",
            "Wong",
            "Wood",
            "Woodard",
            "Woods",
            "Woodward",
            "Wooten",
            "Workman",
            "Wright",
            "Wyatt",
            "Wynn",
            "Yang",
            "Yates",
            "York",
            "Young",
            "Zamora",
            "Zimmerman"};

    String[] names = {"Aaran", "Aaren", "Aarez", "Aarman", "Aaron", "Aaron-James", "Aarron", "Aaryan", "Aaryn", "Aayan", "Aazaan", "Abaan", "Abbas", "Abdallah", "Abdalroof", "Abdihakim", "Abdirahman", "Abdisalam", "Abdul", "Abdul-Aziz", "Abdulbasir", "Abdulkadir", "Abdulkarem", "Abdulkhader", "Abdullah", "Abdul-Majeed", "Abdulmalik", "Abdul-Rehman", "Abdur", "Abdurraheem", "Abdur-Rahman", "Abdur-Rehmaan", "Abel", "Abhinav", "Abhisumant", "Abid", "Abir", "Abraham", "Abu", "Abubakar", "Ace", "Adain", "Adam", "Adam-James", "Addison", "Addisson", "Adegbola", "Adegbolahan", "Aden", "Adenn", "Adie", "Adil", "Aditya", "Adnan", "Adrian", "Adrien", "Aedan", "Aedin", "Aedyn", "Aeron", "Afonso", "Ahmad", "Ahmed", "Ahmed-Aziz", "Ahoua", "Ahtasham", "Aiadan", "Aidan", "Aiden", "Aiden-Jack", "Aiden-Vee", "Aidian", "Aidy", "Ailin", "Aiman", "Ainsley", "Ainslie", "Airen", "Airidas", "Airlie", "AJ", "Ajay", "A-Jay", "Ajayraj", "Akan", "Akram", "Al", "Ala", "Alan", "Alanas", "Alasdair", "Alastair", "Alber", "Albert", "Albie", "Aldred", "Alec", "Aled", "Aleem", "Aleksandar", "Aleksander", "Aleksandr", "Aleksandrs", "Alekzander", "Alessandro", "Alessio", "Alex", "Alexander", "Alexei", "Alexx", "Alexzander", "Alf", "Alfee", "Alfie", "Alfred", "Alfy", "Alhaji", "Al-Hassan", "Ali", "Aliekber", "Alieu", "Alihaider", "Alisdair", "Alishan", "Alistair", "Alistar", "Alister", "Aliyaan", "Allan", "Allan-Laiton", "Allen", "Allesandro", "Allister", "Ally", "Alphonse", "Altyiab", "Alum", "Alvern", "Alvin", "Alyas", "Amaan", "Aman", "Amani", "Ambanimoh", "Ameer", "Amgad", "Ami", "Amin", "Amir", "Ammaar", "Ammar", "Ammer", "Amolpreet", "Amos", "Amrinder", "Amrit", "Amro", "Anay", "Andrea", "Andreas", "Andrei", "Andrejs", "Andrew", "Andy", "Anees", "Anesu", "Angel", "Angelo", "Angus", "Anir", "Anis", "Anish", "Anmolpreet", "Annan", "Anndra", "Anselm", "Anthony", "Anthony-John", "Antoine", "Anton", "Antoni", "Antonio", "Antony", "Antonyo", "Anubhav", "Aodhan", "Aon", "Aonghus", "Apisai", "Arafat", "Aran", "Arandeep", "Arann", "Aray", "Arayan", "Archibald", "Archie", "Arda", "Ardal", "Ardeshir", "Areeb", "Areez", "Aref", "Arfin", "Argyle", "Argyll", "Ari", "Aria", "Arian", "Arihant", "Aristomenis", "Aristotelis", "Arjuna", "Arlo", "Armaan", "Arman", "Armen", "Arnab", "Arnav", "Arnold", "Aron", "Aronas", "Arran", "Arrham", "Arron", "Arryn", "Arsalan", "Artem", "Arthur", "Artur", "Arturo", "Arun", "Arunas", "Arved", "Arya", "Aryan", "Aryankhan", "Aryian", "Aryn", "Asa", "Asfhan", "Ash", "Ashlee-jay", "Ashley", "Ashton", "Ashton-Lloyd", "Ashtyn", "Ashwin", "Asif", "Asim", "Aslam", "Asrar", "Ata", "Atal", "Atapattu", "Ateeq", "Athol", "Athon", "Athos-Carlos", "Atli", "Atom", "Attila", "Aulay", "Aun", "Austen", "Austin", "Avani", "Averon", "Avi", "Avinash", "Avraham", "Awais", "Awwal", "Axel", "Ayaan", "Ayan", "Aydan", "Ayden", "Aydin", "Aydon", "Ayman", "Ayomide", "Ayren", "Ayrton", "Aytug", "Ayub", "Ayyub", "Azaan", "Azedine", "Azeem", "Azim", "Aziz", "Azlan", "Azzam", "Azzedine", "Babatunmise", "Babur", "Bader", "Badr", "Badsha", "Bailee", "Bailey", "Bailie", "Bailley", "Baillie", "Baley", "Balian", "Banan", "Barath", "Barkley", "Barney", "Baron", "Barrie", "Barry", "Bartlomiej", "Bartosz", "Basher", "Basile", "Baxter", "Baye", "Bayley", "Beau", "Beinn", "Bekim", "Believe", "Ben", "Bendeguz", "Benedict", "Benjamin", "Benjamyn", "Benji", "Benn", "Bennett", "Benny", "Benoit", "Bentley", "Berkay", "Bernard", "Bertie", "Bevin", "Bezalel", "Bhaaldeen", "Bharath", "Bilal", "Bill", "Billy", "Binod", "Bjorn", "Blaike", "Blaine", "Blair", "Blaire", "Blake", "Blazej", "Blazey", "Blessing", "Blue", "Blyth", "Bo", "Boab", "Bob", "Bobby", "Bobby-Lee", "Bodhan", "Boedyn", "Bogdan", "Bohbi", "Bony", "Bowen", "Bowie", "Boyd", "Bracken", "Brad", "Bradan", "Braden", "Bradley", "Bradlie", "Bradly", "Brady", "Bradyn", "Braeden", "Braiden", "Brajan", "Brandan", "Branden", "Brandon", "Brandonlee", "Brandon-Lee", "Brandyn", "Brannan", "Brayden", "Braydon", "Braydyn", "Breandan", "Brehme", "Brendan", "Brendon", "Brendyn", "Breogan", "Bret", "Brett", "Briaddon", "Brian", "Brodi", "Brodie", "Brody", "Brogan", "Broghan", "Brooke", "Brooklin", "Brooklyn", "Bruce", "Bruin", "Bruno", "Brunon", "Bryan", "Bryce", "Bryden", "Brydon", "Brydon-Craig", "Bryn", "Brynmor", "Bryson", "Buddy", "Bully", "Burak", "Burhan", "Butali", "Butchi", "Byron", "Cabhan", "Cadan", "Cade", "Caden", "Cadon", "Cadyn", "Caedan", "Caedyn", "Cael", "Caelan", "Caelen", "Caethan", "Cahl", "Cahlum", "Cai", "Caidan", "Caiden", "Caiden-Paul", "Caidyn", "Caie", "Cailaen", "Cailean", "Caileb-John", "Cailin", "Cain", "Caine", "Cairn", "Cal", "Calan", "Calder", "Cale", "Calean", "Caleb", "Calen", "Caley", "Calib", "Calin", "Callahan", "Callan", "Callan-Adam", "Calley", "Callie", "Callin", "Callum", "Callun", "Callyn", "Calum", "Calum-James", "Calvin", "Cambell", "Camerin", "Cameron", "Campbel", "Campbell", "Camron", "Caolain", "Caolan", "Carl", "Carlo", "Carlos", "Carrich", "Carrick", "Carson", "Carter", "Carwyn", "Casey", "Casper", "Cassy", "Cathal", "Cator", "Cavan", "Cayden", "Cayden-Robert", "Cayden-Tiamo", "Ceejay", "Ceilan", "Ceiran", "Ceirin", "Ceiron", "Cejay", "Celik", "Cephas", "Cesar", "Cesare", "Chad", "Chaitanya", "Chang-Ha", "Charles", "Charley", "Charlie", "Charly", "Chase", "Che", "Chester", "Chevy", "Chi", "Chibudom", "Chidera", "Chimsom", "Chin", "Chintu", "Chiqal", "Chiron", "Chris", "Chris-Daniel", "Chrismedi", "Christian", "Christie", "Christoph", "Christopher", "Christopher-Lee", "Christy", "Chu", "Chukwuemeka", "Cian", "Ciann", "Ciar", "Ciaran", "Ciarian", "Cieran", "Cillian", "Cillin", "Cinar", "CJ", "C-Jay", "Clark", "Clarke", "Clayton", "Clement", "Clifford", "Clyde", "Cobain", "Coban", "Coben", "Cobi", "Cobie", "Coby", "Codey", "Codi", "Codie", "Cody", "Cody-Lee", "Coel", "Cohan", "Cohen", "Colby", "Cole", "Colin", "Coll", "Colm", "Colt", "Colton", "Colum", "Colvin", "Comghan", "Conal", "Conall", "Conan", "Conar", "Conghaile", "Conlan", "Conley", "Conli", "Conlin", "Conlly", "Conlon", "Conlyn", "Connal", "Connall", "Connan", "Connar", "Connel", "Connell", "Conner", "Connolly", "Connor", "Connor-David", "Conor", "Conrad", "Cooper", "Copeland", "Coray", "Corben", "Corbin", "Corey", "Corey-James", "Corey-Jay", "Cori", "Corie", "Corin", "Cormac", "Cormack", "Cormak", "Corran", "Corrie", "Cory", "Cosmo", "Coupar", "Craig", "Craig-James", "Crawford", "Creag", "Crispin", "Cristian", "Crombie", "Cruiz", "Cruz", "Cuillin", "Cullen", "Cullin", "Curtis", "Cyrus", "Daanyaal", "Daegan", "Daegyu", "Dafydd", "Dagon", "Dailey", "Daimhin", "Daithi", "Dakota", "Daksh", "Dale", "Dalong", "Dalton", "Damian", "Damien", "Damon", "Dan", "Danar", "Dane", "Danial", "Daniel", "Daniele", "Daniel-James", "Daniels", "Daniil", "Danish", "Daniyal", "Danniel", "Danny", "Dante", "Danyal", "Danyil", "Danys", "Daood", "Dara", "Darach", "Daragh", "Darcy", "D'arcy", "Dareh", "Daren", "Darien", "Darius", "Darl", "Darn", "Darrach", "Darragh", "Darrel", "Darrell", "Darren", "Darrie", "Darrius", "Darroch", "Darryl", "Darryn", "Darwyn", "Daryl", "Daryn", "Daud", "Daumantas", "Davi", "David", "David-Jay", "David-Lee", "Davie", "Davis", "Davy", "Dawid", "Dawson", "Dawud", "Dayem", "Daymian", "Deacon", "Deagan", "Dean", "Deano", "Decklan", "Declain", "Declan", "Declyan", "Declyn", "Dedeniseoluwa", "Deecan", "Deegan", "Deelan", "Deklain-Jaimes", "Del", "Demetrius", "Denis", "Deniss", "Dennan", "Dennin", "Dennis", "Denny", "Dennys", "Denon", "Denton", "Denver", "Denzel", "Deon", "Derek", "Derick", "Derin", "Dermot", "Derren", "Derrie", "Derrin", "Derron", "Derry", "Derryn", "Deryn", "Deshawn", "Desmond", "Dev", "Devan", "Devin", "Devlin", "Devlyn", "Devon", "Devrin", "Devyn", "Dex", "Dexter", "Dhani", "Dharam", "Dhavid", "Dhyia", "Diarmaid", "Diarmid", "Diarmuid", "Didier", "Diego", "Diesel", "Diesil", "Digby", "Dilan", "Dilano", "Dillan", "Dillon", "Dilraj", "Dimitri", "Dinaras", "Dion", "Dissanayake", "Dmitri", "Doire", "Dolan", "Domanic", "Domenico", "Domhnall", "Dominic", "Dominick", "Dominik", "Donald", "Donnacha", "Donnie", "Dorian", "Dougal", "Douglas", "Dougray", "Drakeo", "Dre", "Dregan", "Drew", "Dugald", "Duncan", "Duriel", "Dustin", "Dylan", "Dylan-Jack", "Dylan-James", "Dylan-John", "Dylan-Patrick", "Dylin", "Dyllan", "Dyllan-James", "Dyllon", "Eadie", "Eagann", "Eamon", "Eamonn", "Eason", "Eassan", "Easton", "Ebow", "Ed", "Eddie", "Eden", "Ediomi", "Edison", "Eduardo", "Eduards", "Edward", "Edwin", "Edwyn", "Eesa", "Efan", "Efe", "Ege", "Ehsan", "Ehsen", "Eiddon", "Eidhan", "Eihli", "Eimantas", "Eisa", "Eli", "Elias", "Elijah", "Eliot", "Elisau", "Eljay", "Eljon", "Elliot", "Elliott", "Ellis", "Ellisandro", "Elshan", "Elvin", "Elyan", "Emanuel", "Emerson", "Emil", "Emile", "Emir", "Emlyn", "Emmanuel", "Emmet", "Eng", "Eniola", "Enis", "Ennis", "Enrico", "Enrique", "Enzo", "Eoghain", "Eoghan", "Eoin", "Eonan", "Erdehan", "Eren", "Erencem", "Eric", "Ericlee", "Erik", "Eriz", "Ernie-Jacks", "Eroni", "Eryk", "Eshan", "Essa", "Esteban", "Ethan", "Etienne", "Etinosa", "Euan", "Eugene", "Evan", "Evann", "Ewan", "Ewen", "Ewing", "Exodi", "Ezekiel", "Ezra", "Fabian", "Fahad", "Faheem", "Faisal", "Faizaan", "Famara", "Fares", "Farhaan", "Farhan", "Farren", "Farzad", "Fauzaan", "Favour", "Fawaz", "Fawkes", "Faysal", "Fearghus", "Feden", "Felix", "Fergal", "Fergie", "Fergus", "Ferre", "Fezaan", "Fiachra", "Fikret", "Filip", "Filippo", "Finan", "Findlay", "Findlay-James", "Findlie", "Finlay", "Finley", "Finn", "Finnan", "Finnean", "Finnen", "Finnlay", "Finnley", "Fintan", "Fionn", "Firaaz", "Fletcher", "Flint", "Florin", "Flyn", "Flynn", "Fodeba", "Folarinwa", "Forbes", "Forgan", "Forrest", "Fox", "Francesco", "Francis", "Francisco", "Franciszek", "Franco", "Frank", "Frankie", "Franklin", "Franko", "Fraser", "Frazer", "Fred", "Freddie", "Frederick", "Fruin", "Fyfe", "Fyn", "Fynlay", "Fynn", "Gabriel", "Gallagher", "Gareth", "Garren", "Garrett", "Garry", "Gary", "Gavin", "Gavin-Lee", "Gene", "Geoff", "Geoffrey", "Geomer", "Geordan", "Geordie", "George", "Georgia", "Georgy", "Gerard", "Ghyll", "Giacomo", "Gian", "Giancarlo", "Gianluca", "Gianmarco", "Gideon", "Gil", "Gio", "Girijan", "Girius", "Gjan", "Glascott", "Glen", "Glenn", "Gordon", "Grady", "Graeme", "Graham", "Grahame", "Grant", "Grayson", "Greg", "Gregor", "Gregory", "Greig", "Griffin", "Griffyn", "Grzegorz", "Guang", "Guerin", "Guillaume", "Gurardass", "Gurdeep", "Gursees", "Gurthar", "Gurveer", "Gurwinder", "Gus", "Gustav", "Guthrie", "Guy", "Gytis", "Habeeb", "Hadji", "Hadyn", "Hagun", "Haiden", "Haider", "Hamad", "Hamid", "Hamish", "Hamza", "Hamzah", "Han", "Hansen", "Hao", "Hareem", "Hari", "Harikrishna", "Haris", "Harish", "Harjeevan", "Harjyot", "Harlee", "Harleigh", "Harley", "Harman", "Harnek", "Harold", "Haroon", "Harper", "Harri", "Harrington", "Harris", "Harrison", "Harry", "Harvey", "Harvie", "Harvinder", "Hasan", "Haseeb", "Hashem", "Hashim", "Hassan", "Hassanali", "Hately", "Havila", "Hayden", "Haydn", "Haydon", "Haydyn", "Hcen", "Hector", "Heddle", "Heidar", "Heini", "Hendri", "Henri", "Henry", "Herbert", "Heyden", "Hiro", "Hirvaansh", "Hishaam", "Hogan", "Honey", "Hong", "Hope", "Hopkin", "Hosea", "Howard", "Howie", "Hristomir", "Hubert", "Hugh", "Hugo", "Humza", "Hunter", "Husnain", "Hussain", "Hussan", "Hussnain", "Hussnan", "Hyden", "I", "Iagan", "Iain", "Ian", "Ibraheem", "Ibrahim", "Idahosa", "Idrees", "Idris", "Iestyn", "Ieuan", "Igor", "Ihtisham", "Ijay", "Ikechukwu", "Ikemsinachukwu", "Ilyaas", "Ilyas", "Iman", "Immanuel", "Inan", "Indy", "Ines", "Innes", "Ioannis", "Ireayomide", "Ireoluwa", "Irvin", "Irvine", "Isa", "Isaa", "Isaac", "Isaiah", "Isak", "Isher", "Ishwar", "Isimeli", "Isira", "Ismaeel", "Ismail", "Israel", "Issiaka", "Ivan", "Ivar", "Izaak", "J", "Jaay", "Jac", "Jace", "Jack", "Jacki", "Jackie", "Jack-James", "Jackson", "Jacky", "Jacob", "Jacques", "Jad", "Jaden", "Jadon", "Jadyn", "Jae", "Jagat", "Jago", "Jaheim", "Jahid", "Jahy", "Jai", "Jaida", "Jaiden", "Jaidyn", "Jaii", "Jaime", "Jai-Rajaram", "Jaise", "Jak", "Jake", "Jakey", "Jakob", "Jaksyn", "Jakub", "Jamaal", "Jamal", "Jameel", "Jameil", "James", "James-Paul", "Jamey", "Jamie", "Jan", "Jaosha", "Jardine", "Jared", "Jarell", "Jarl", "Jarno", "Jarred", "Jarvi", "Jasey-Jay", "Jasim", "Jaskaran", "Jason", "Jasper", "Jaxon", "Jaxson", "Jay", "Jaydan", "Jayden", "Jayden-James", "Jayden-Lee", "Jayden-Paul", "Jayden-Thomas", "Jaydn", "Jaydon", "Jaydyn", "Jayhan", "Jay-Jay", "Jayke", "Jaymie", "Jayse", "Jayson", "Jaz", "Jazeb", "Jazib", "Jazz", "Jean", "Jean-Lewis", "Jean-Pierre", "Jebadiah", "Jed", "Jedd", "Jedidiah", "Jeemie", "Jeevan", "Jeffrey", "Jensen", "Jenson", "Jensyn", "Jeremy", "Jerome", "Jeronimo", "Jerrick", "Jerry", "Jesse", "Jesuseun", "Jeswin", "Jevan", "Jeyun", "Jez", "Jia", "Jian", "Jiao", "Jimmy", "Jincheng", "JJ", "Joaquin", "Joash", "Jock", "Jody", "Joe", "Joeddy", "Joel", "Joey", "Joey-Jack", "Johann", "Johannes", "Johansson", "John", "Johnathan", "Johndean", "Johnjay", "John-Michael", "Johnnie", "Johnny", "Johnpaul", "John-Paul", "John-Scott", "Johnson", "Jole", "Jomuel", "Jon", "Jonah", "Jonatan", "Jonathan", "Jonathon", "Jonny", "Jonothan", "Jon-Paul", "Jonson", "Joojo", "Jordan", "Jordi", "Jordon", "Jordy", "Jordyn", "Jorge", "Joris", "Jorryn", "Josan", "Josef", "Joseph", "Josese", "Josh", "Joshiah", "Joshua", "Josiah", "Joss", "Jostelle", "Joynul", "Juan", "Jubin", "Judah", "Jude", "Jules", "Julian", "Julien", "Jun", "Junior", "Jura", "Justan", "Justin", "Justinas", "Kaan", "Kabeer", "Kabir", "Kacey", "Kacper", "Kade", "Kaden", "Kadin", "Kadyn", "Kaeden", "Kael", "Kaelan", "Kaelin", "Kaelum", "Kai", "Kaid", "Kaidan", "Kaiden", "Kaidinn", "Kaidyn", "Kaileb", "Kailin", "Kain", "Kaine", "Kainin", "Kainui", "Kairn", "Kaison", "Kaiwen", "Kajally", "Kajetan", "Kalani", "Kale", "Kaleb", "Kaleem", "Kal-el", "Kalen", "Kalin", "Kallan", "Kallin", "Kalum", "Kalvin", "Kalvyn", "Kameron", "Kames", "Kamil", "Kamran", "Kamron", "Kane", "Karam", "Karamvir", "Karandeep", "Kareem", "Karim", "Karimas", "Karl", "Karol", "Karson", "Karsyn", "Karthikeya", "Kasey", "Kash", "Kashif", "Kasim", "Kasper", "Kasra", "Kavin", "Kayam", "Kaydan", "Kayden", "Kaydin", "Kaydn", "Kaydyn", "Kaydyne", "Kayleb", "Kaylem", "Kaylum", "Kayne", "Kaywan", "Kealan", "Kealon", "Kean", "Keane", "Kearney", "Keatin", "Keaton", "Keavan", "Keayn", "Kedrick", "Keegan", "Keelan", "Keelin", "Keeman", "Keenan", "Keenan-Lee", "Keeton", "Kehinde", "Keigan", "Keilan", "Keir", "Keiran", "Keiren", "Keiron", "Keiryn", "Keison", "Keith", "Keivlin", "Kelam", "Kelan", "Kellan", "Kellen", "Kelso", "Kelum", "Kelvan", "Kelvin", "Ken", "Kenan", "Kendall", "Kendyn", "Kenlin", "Kenneth", "Kensey", "Kenton", "Kenyon", "Kenzeigh", "Kenzi", "Kenzie", "Kenzo", "Kenzy", "Keo", "Ker", "Kern", "Kerr", "Kevan", "Kevin", "Kevyn", "Kez", "Khai", "Khalan", "Khaleel", "Khaya", "Khevien", "Khizar", "Khizer", "Kia", "Kian", "Kian-James", "Kiaran", "Kiarash", "Kie", "Kiefer", "Kiegan", "Kienan", "Kier", "Kieran", "Kieran-Scott", "Kieren", "Kierin", "Kiern", "Kieron", "Kieryn", "Kile", "Killian", "Kimi", "Kingston", "Kinneil", "Kinnon", "Kinsey", "Kiran", "Kirk", "Kirwin", "Kit", "Kiya", "Kiyonari", "Kjae", "Klein", "Klevis", "Kobe", "Kobi", "Koby", "Koddi", "Koden", "Kodi", "Kodie", "Kody", "Kofi", "Kogan", "Kohen", "Kole", "Konan", "Konar", "Konnor", "Konrad", "Koray", "Korben", "Korbyn", "Korey", "Kori", "Korrin", "Kory", "Koushik", "Kris", "Krish", "Krishan", "Kriss", "Kristian", "Kristin", "Kristofer", "Kristoffer", "Kristopher", "Kruz", "Krzysiek", "Krzysztof", "Ksawery", "Ksawier", "Kuba", "Kurt", "Kurtis", "Kurtis-Jae", "Kyaan", "Kyan", "Kyde", "Kyden", "Kye", "Kyel", "Kyhran", "Kyie", "Kylan", "Kylar", "Kyle", "Kyle-Derek", "Kylian", "Kym", "Kynan", "Kyral", "Kyran", "Kyren", "Kyrillos", "Kyro", "Kyron", "Kyrran", "Lachlainn", "Lachlan", "Lachlann", "Lael", "Lagan", "Laird", "Laison", "Lakshya", "Lance", "Lancelot", "Landon", "Lang", "Lasse", "Latif", "Lauchlan", "Lauchlin", "Laughlan", "Lauren", "Laurence", "Laurie", "Lawlyn", "Lawrence", "Lawrie", "Lawson", "Layne", "Layton", "Lee", "Leigh", "Leigham", "Leighton", "Leilan", "Leiten", "Leithen", "Leland", "Lenin", "Lennan", "Lennen", "Lennex", "Lennon", "Lennox", "Lenny", "Leno", "Lenon", "Lenyn", "Leo", "Leon", "Leonard", "Leonardas", "Leonardo", "Lepeng", "Leroy", "Leven", "Levi", "Levon", "Levy", "Lewie", "Lewin", "Lewis", "Lex", "Leydon", "Leyland", "Leylann", "Leyton", "Liall", "Liam", "Liam-Stephen", "Limo", "Lincoln", "Lincoln-John", "Lincon", "Linden", "Linton", "Lionel", "Lisandro", "Litrell", "Liyonela-Elam", "LLeyton", "Lliam", "Lloyd", "Lloyde", "Loche", "Lochlan", "Lochlann", "Lochlan-Oliver", "Lock", "Lockey", "Logan", "Logann", "Logan-Rhys", "Loghan", "Lokesh", "Loki", "Lomond", "Lorcan", "Lorenz", "Lorenzo", "Lorne", "Loudon", "Loui", "Louie", "Louis", "Loukas", "Lovell", "Luc", "Luca", "Lucais", "Lucas", "Lucca", "Lucian", "Luciano", "Lucien", "Lucus", "Luic", "Luis", "Luk", "Luka", "Lukas", "Lukasz", "Luke", "Lukmaan", "Luqman", "Lyall", "Lyle", "Lyndsay", "Lysander", "Maanav", "Maaz", "Mac", "Macallum", "Macaulay", "Macauley", "Macaully", "Machlan", "Maciej", "Mack", "Mackenzie", "Mackenzy", "Mackie", "Macsen", "Macy", "Madaki", "Maddison", "Maddox", "Madison", "Madison-Jake", "Madox", "Mael", "Magnus", "Mahan", "Mahdi", "Mahmoud", "Maias", "Maison", "Maisum", "Maitlind", "Majid", "Makensie", "Makenzie", "Makin", "Maksim", "Maksymilian", "Malachai", "Malachi", "Malachy", "Malakai", "Malakhy", "Malcolm", "Malik", "Malikye", "Malo", "Ma'moon", "Manas", "Maneet", "Manmohan", "Manolo", "Manson", "Mantej", "Manuel", "Manus", "Marc", "Marc-Anthony", "Marcel", "Marcello", "Marcin", "Marco", "Marcos", "Marcous", "Marcquis", "Marcus", "Mario", "Marios", "Marius", "Mark", "Marko", "Markus", "Marley", "Marlin", "Marlon", "Maros", "Marshall", "Martin", "Marty", "Martyn", "Marvellous", "Marvin", "Marwan", "Maryk", "Marzuq", "Mashhood", "Mason", "Mason-Jay", "Masood", "Masson", "Matas", "Matej", "Mateusz", "Mathew", "Mathias", "Mathu", "Mathuyan", "Mati", "Matt", "Matteo", "Matthew", "Matthew-William", "Matthias", "Max", "Maxim", "Maximilian", "Maximillian", "Maximus", "Maxwell", "Maxx", "Mayeul", "Mayson", "Mazin", "Mcbride", "McCaulley", "McKade", "McKauley", "McKay", "McKenzie", "McLay", "Meftah", "Mehmet", "Mehraz", "Meko", "Melville", "Meshach", "Meyzhward", "Micah", "Michael", "Michael-Alexander", "Michael-James", "Michal", "Michat", "Micheal", "Michee", "Mickey", "Miguel", "Mika", "Mikael", "Mikee", "Mikey", "Mikhail", "Mikolaj", "Miles", "Millar", "Miller", "Milo", "Milos", "Milosz", "Mir", "Mirza", "Mitch", "Mitchel", "Mitchell", "Moad", "Moayd", "Mobeen", "Modoulamin", "Modu", "Mohamad", "Mohamed", "Mohammad", "Mohammad-Bilal", "Mohammed", "Mohanad", "Mohd", "Momin", "Momooreoluwa", "Montague", "Montgomery", "Monty", "Moore", "Moosa", "Moray", "Morgan", "Morgyn", "Morris", "Morton", "Moshy", "Motade", "Moyes", "Msughter", "Mueez", "Muhamadjavad", "Muhammad", "Muhammed", "Muhsin", "Muir", "Munachi", "Muneeb", "Mungo", "Munir", "Munmair", "Munro", "Murdo", "Murray", "Murrough", "Murry", "Musa", "Musse", "Mustafa", "Mustapha", "Muzammil", "Muzzammil", "Mykie", "Myles", "Mylo", "Nabeel", "Nadeem", "Nader", "Nagib", "Naif", "Nairn", "Narvic", "Nash", "Nasser", "Nassir", "Natan", "Nate", "Nathan", "Nathanael", "Nathanial", "Nathaniel", "Nathan-Rae", "Nawfal", "Nayan", "Neco", "Neil", "Nelson", "Neo", "Neshawn", "Nevan", "Nevin", "Ngonidzashe", "Nial", "Niall", "Nicholas", "Nick", "Nickhill", "Nicki", "Nickson", "Nicky", "Nico", "Nicodemus", "Nicol", "Nicolae", "Nicolas", "Nidhish", "Nihaal", "Nihal", "Nikash", "Nikhil", "Niki", "Nikita", "Nikodem", "Nikolai", "Nikos", "Nilav", "Niraj", "Niro", "Niven", "Noah", "Noel", "Nolan", "Noor", "Norman", "Norrie", "Nuada", "Nyah", "Oakley", "Oban", "Obieluem", "Obosa", "Odhran", "Odin", "Odynn", "Ogheneochuko", "Ogheneruno", "Ohran", "Oilibhear", "Oisin", "Ojima-Ojo", "Okeoghene", "Olaf", "Ola-Oluwa", "Olaoluwapolorimi", "Ole", "Olie", "Oliver", "Olivier", "Oliwier", "Ollie", "Olurotimi", "Oluwadamilare", "Oluwadamiloju", "Oluwafemi", "Oluwafikunayomi", "Oluwalayomi", "Oluwatobiloba", "Oluwatoni", "Omar", "Omri", "Oran", "Orin", "Orlando", "Orley", "Orran", "Orrick", "Orrin", "Orson", "Oryn", "Oscar", "Osesenagha", "Oskar", "Ossian", "Oswald", "Otto", "Owain", "Owais", "Owen", "Owyn", "Oz", "Ozzy", "Pablo", "Pacey", "Padraig", "Paolo", "Pardeepraj", "Parkash", "Parker", "Pascoe", "Pasquale", "Patrick", "Patrick-John", "Patrikas", "Patryk", "Paul", "Pavit", "Pawel", "Pawlo", "Pearce", "Pearse", "Pearsen", "Pedram", "Pedro", "Peirce", "Peiyan", "Pele", "Peni", "Peregrine", "Peter", "Phani", "Philip", "Philippos", "Phinehas", "Phoenix", "Phoevos", "Pierce", "Pierre-Antoine", "Pieter", "Pietro", "Piotr", "Porter", "Prabhjoit", "Prabodhan", "Praise", "Pranav", "Pravin", "Precious", "Prentice", "Presley", "Preston", "Preston-Jay", "Prinay", "Prince", "Prithvi", "Promise", "Puneetpaul", "Pushkar", "Qasim", "Qirui", "Quinlan", "Quinn", "Radmiras", "Raees", "Raegan", "Rafael", "Rafal", "Rafferty", "Rafi", "Raheem", "Rahil", "Rahim", "Rahman", "Raith", "Raithin", "Raja", "Rajab-Ali", "Rajan", "Ralfs", "Ralph", "Ramanas", "Ramit", "Ramone", "Ramsay", "Ramsey", "Rana", "Ranolph", "Raphael", "Rasmus", "Rasul", "Raul", "Raunaq", "Ravin", "Ray", "Rayaan", "Rayan", "Rayane", "Rayden", "Rayhan", "Raymond", "Rayne", "Rayyan", "Raza", "Reace", "Reagan", "Reean", "Reece", "Reed", "Reegan", "Rees", "Reese", "Reeve", "Regan", "Regean", "Reggie", "Rehaan", "Rehan", "Reice", "Reid", "Reigan", "Reilly", "Reily", "Reis", "Reiss", "Remigiusz", "Remo", "Remy", "Ren", "Renars", "Reng", "Rennie", "Reno", "Reo", "Reuben", "Rexford", "Reynold", "Rhein", "Rheo", "Rhett", "Rheyden", "Rhian", "Rhoan", "Rholmark", "Rhoridh", "Rhuairidh", "Rhuan", "Rhuaridh", "Rhudi", "Rhy", "Rhyan", "Rhyley", "Rhyon", "Rhys", "Rhys-Bernard", "Rhyse", "Riach", "Rian", "Ricards", "Riccardo", "Ricco", "Rice", "Richard", "Richey", "Richie", "Ricky", "Rico", "Ridley", "Ridwan", "Rihab", "Rihan", "Rihards", "Rihonn", "Rikki", "Riley", "Rio", "Rioden", "Rishi", "Ritchie", "Rivan", "Riyadh", "Riyaj", "Roan", "Roark", "Roary", "Rob", "Robbi", "Robbie", "Robbie-lee", "Robby", "Robert", "Robert-Gordon", "Robertjohn", "Robi", "Robin", "Rocco", "Roddy", "Roderick", "Rodrigo", "Roen", "Rogan", "Roger", "Rohaan", "Rohan", "Rohin", "Rohit", "Rokas", "Roman", "Ronald", "Ronan", "Ronan-Benedict", "Ronin", "Ronnie", "Rooke", "Roray", "Rori", "Rorie", "Rory", "Roshan", "Ross", "Ross-Andrew", "Rossi", "Rowan", "Rowen", "Roy", "Ruadhan", "Ruaidhri", "Ruairi", "Ruairidh", "Ruan", "Ruaraidh", "Ruari", "Ruaridh", "Ruben", "Rubhan", "Rubin", "Rubyn", "Rudi", "Rudy", "Rufus", "Rui", "Ruo", "Rupert", "Ruslan", "Russel", "Russell", "Ryaan", "Ryan", "Ryan-Lee", "Ryden", "Ryder", "Ryese", "Ryhs", "Rylan", "Rylay", "Rylee", "Ryleigh", "Ryley", "Rylie", "Ryo", "Ryszard", "Saad", "Sabeen", "Sachkirat", "Saffi", "Saghun", "Sahaib", "Sahbian", "Sahil", "Saif", "Saifaddine", "Saim", "Sajid", "Sajjad", "Salahudin", "Salman", "Salter", "Salvador", "Sam", "Saman", "Samar", "Samarjit", "Samatar", "Sambrid", "Sameer", "Sami", "Samir", "Sami-Ullah", "Samual", "Samuel", "Samuela", "Samy", "Sanaullah", "Sandro", "Sandy", "Sanfur", "Sanjay", "Santiago", "Santino", "Satveer", "Saul", "Saunders", "Savin", "Sayad", "Sayeed", "Sayf", "Scot", "Scott", "Scott-Alexander", "Seaan", "Seamas", "Seamus", "Sean", "Seane", "Sean-James", "Sean-Paul", "Sean-Ray", "Seb", "Sebastian", "Sebastien", "Selasi", "Seonaidh", "Sephiroth", "Sergei", "Sergio", "Seth", "Sethu", "Seumas", "Shaarvin", "Shadow", "Shae", "Shahmir", "Shai", "Shane", "Shannon", "Sharland", "Sharoz", "Shaughn", "Shaun", "Shaunpaul", "Shaun-Paul", "Shaun-Thomas", "Shaurya", "Shaw", "Shawn", "Shawnpaul", "Shay", "Shayaan", "Shayan", "Shaye", "Shayne", "Shazil", "Shea", "Sheafan", "Sheigh", "Shenuk", "Sher", "Shergo", "Sheriff", "Sherwyn", "Shiloh", "Shiraz", "Shreeram", "Shreyas", "Shyam", "Siddhant", "Siddharth", "Sidharth", "Sidney", "Siergiej", "Silas", "Simon", "Sinai", "Skye", "Sofian", "Sohaib", "Sohail", "Soham", "Sohan", "Sol", "Solomon", "Sonneey", "Sonni", "Sonny", "Sorley", "Soul", "Spencer", "Spondon", "Stanislaw", "Stanley", "Stefan", "Stefano", "Stefin", "Stephen", "Stephenjunior", "Steve", "Steven", "Steven-lee", "Stevie", "Stewart", "Stewarty", "Strachan", "Struan", "Stuart", "Su", "Subhaan", "Sudais", "Suheyb", "Suilven", "Sukhi", "Sukhpal", "Sukhvir", "Sulayman", "Sullivan", "Sultan", "Sung", "Sunny", "Suraj", "Surien", "Sweyn", "Syed", "Sylvain", "Symon", "Szymon", "Tadd", "Taddy", "Tadhg", "Taegan", "Taegen", "Tai", "Tait", "Taiwo", "Talha", "Taliesin", "Talon", "Talorcan", "Tamar", "Tamiem", "Tammam", "Tanay", "Tane", "Tanner", "Tanvir", "Tanzeel", "Taonga", "Tarik", "Tariq-Jay", "Tate", "Taylan", "Taylar", "Tayler", "Taylor", "Taylor-Jay", "Taylor-Lee", "Tayo", "Tayyab", "Tayye", "Tayyib", "Teagan", "Tee", "Teejay", "Tee-jay", "Tegan", "Teighen", "Teiyib", "Te-Jay", "Temba", "Teo", "Teodor", "Teos", "Terry", "Teydren", "Theo", "Theodore", "Thiago", "Thierry", "Thom", "Thomas", "Thomas-Jay", "Thomson", "Thorben", "Thorfinn", "Thrinei", "Thumbiko", "Tiago", "Tian", "Tiarnan", "Tibet", "Tieran", "Tiernan", "Timothy", "Timucin", "Tiree", "Tisloh", "Titi", "Titus", "Tiylar", "TJ", "Tjay", "T-Jay", "Tobey", "Tobi", "Tobias", "Tobie", "Toby", "Todd", "Tokinaga", "Toluwalase", "Tom", "Tomas", "Tomasz", "Tommi-Lee", "Tommy", "Tomson", "Tony", "Torin", "Torquil", "Torran", "Torrin", "Torsten", "Trafford", "Trai", "Travis", "Tre", "Trent", "Trey", "Tristain", "Tristan", "Troy", "Tubagus", "Turki", "Turner", "Ty", "Ty-Alexander", "Tye", "Tyelor", "Tylar", "Tyler", "Tyler-James", "Tyler-Jay", "Tyllor", "Tylor", "Tymom", "Tymon", "Tymoteusz", "Tyra", "Tyree", "Tyrnan", "Tyrone", "Tyson", "Ubaid", "Ubayd", "Uchenna", "Uilleam", "Umair", "Umar", "Umer", "Umut", "Urban", "Uri", "Usman", "Uzair", "Uzayr", "Valen", "Valentin", "Valentino", "Valery", "Valo", "Vasyl", "Vedantsinh", "Veeran", "Victor", "Victory", "Vinay", "Vince", "Vincent", "Vincenzo", "Vinh", "Vinnie", "Vithujan", "Vladimir", "Vladislav", "Vrishin", "Vuyolwethu", "Wabuya", "Wai", "Walid", "Wallace", "Walter", "Waqaas", "Warkhas", "Warren", "Warrick", "Wasif", "Wayde", "Wayne", "Wei", "Wen", "Wesley", "Wesley-Scott", "Wiktor", "Wilkie", "Will", "William", "William-John", "Willum", "Wilson", "Windsor", "Wojciech", "Woyenbrakemi", "Wyatt", "Wylie", "Wynn", "Xabier", "Xander", "Xavier", "Xiao", "Xida", "Xin", "Xue", "Yadgor", "Yago", "Yahya", "Yakup", "Yang", "Yanick", "Yann", "Yannick", "Yaseen", "Yasin", "Yasir", "Yassin", "Yoji", "Yong", "Yoolgeun", "Yorgos", "Youcef", "Yousif", "Youssef", "Yu", "Yuanyu", "Yuri", "Yusef", "Yusuf", "Yves", "Zaaine", "Zaak", "Zac", "Zach", "Zachariah", "Zacharias", "Zacharie", "Zacharius", "Zachariya", "Zachary", "Zachary-Marc", "Zachery", "Zack", "Zackary", "Zaid", "Zain", "Zaine", "Zaineddine", "Zainedin", "Zak", "Zakaria", "Zakariya", "Zakary", "Zaki", "Zakir", "Zakk", "Zamaar", "Zander", "Zane", "Zarran", "Zayd", "Zayn", "Zayne", "Ze", "Zechariah", "Zeek", "Zeeshan", "Zeid", "Zein", "Zen", "Zendel", "Zenith", "Zennon", "Zeph", "Zerah", "Zhen", "Zhi", "Zhong", "Zhuo", "Zi", "Zidane", "Zijie", "Zinedine", "Zion", "Zishan", "Ziya", "Ziyaan", "Zohaib", "Zohair", "Zoubaeir", "Zubair", "Zubayr", "Zuriel"};

    public String[] getLastname() {
        return lastname;
    }

    public String[] getNames() {
        return names;
    }
}
```

Main.java
```java
package com.netlight.lab7_8;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("BruhDev");

        String[] ln = new Names().lastname;
        String[] n = new Names().names;

        for (int i = 0; i < 80; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 100000, new Manager()));
        }
        for (int i = 0; i < 180; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 40000, new Operator()));
        }
        for (int i = 0; i < 10; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 140000, new TopManager(company)));
        }

        company.checkIncome();

        System.out.println("Top 15 salary:");
        for (Employee x :
                company.getTopSalaryStaff(15)) {
            System.out.println((int) x.getSalary() + " rub " +
                    x.name + " " + x.lastname +
                    " (" + x.position.getJobTitle() + ")");
        }
        System.out.println("\nLowest 30 salary:");
        for (Employee x :
                company.getLowestSalaryStaff(30)) {
            System.out.println((int) x.getSalary() + " rub " +
                    x.name + " " + x.lastname +
                    " (" + x.position.getJobTitle() + ")");
        }

        System.out.println("\n" + company.empar.size() + " emps before fire");
        for (int i = 0; i < company.empar.size() / 2; i++) {
            company.fire(company.empar.get((int) Math.random() * company.empar.size() / 2));
        }
        System.out.println(company.empar.size() + " emps after fire\n");

        company.checkIncome();

        System.out.println("Top 15 salary:");
        for (Employee x :
                company.getTopSalaryStaff(15)) {
            System.out.println((int) x.getSalary() + " rub " +
                    x.name + " " + x.lastname +
                    " (" + x.position.getJobTitle() + ")");
        }
        System.out.println("\nLowest 30 salary:");
        for (Employee x :
                company.getLowestSalaryStaff(30)) {
            System.out.println((int) x.getSalary() + " rub " +
                    x.name + " " + x.lastname +
                    " (" + x.position.getJobTitle() + ")");
        }


    }
}
```

TopManager.java
```java
package com.netlight.lab7_8;

public class TopManager implements EmployeePosition {

    Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.income > 10000000) {
            return baseSalary + (company.income * 1.5);
        } else return baseSalary;
    }
}
```

Company.java
```java
package com.netlight.lab7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    String name;
    ArrayList<Employee> empar = new ArrayList<Employee>();
    double income;

    public Company(String name) {
        this.name = name;
    }

    void hire(Employee emp) {
        empar.add(emp);
    }

    void hireAll(Employee... emps) {
        for (Employee emp :
                emps) {
            empar.add(emp);

        }
    }

    void checkIncome() {
        income = 0;
        for (Employee emp :
                empar) {
            if (emp.position.getClass() == Manager.class) {
                income += ((Manager) emp.position).generateIncome();
            }
        }
        System.out.println("Income is " + (int) income / 1000 + "k rub");
    }

    void fire(Employee emp) {
        empar.remove(emp);
    }

    List<Employee> getTopSalaryStaff(int count) {
        empar.sort(Comparator.comparing(Employee::getSalary).reversed());
        return empar.subList(0, count);
    }

    List<Employee> getLowestSalaryStaff(int count) {
        empar.sort(Comparator.comparing(Employee::getSalary));
        return empar.subList(0, count);
    }
}
```

Employee.java
```java
package com.netlight.lab7_8;

public class Employee {
    String lastname;
    String name;
    int baseSalary;
    EmployeePosition position;


    public Employee(String lastname,
                    String name,
                    int baseSalary,
                    EmployeePosition emposition) {
        this.lastname = lastname;
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = emposition;
    }

    public double getSalary() {
        return position.calcSalary(baseSalary);
    }
}
```

### Lab 9
UniqueClass.java
```java
package com.netlight.lab9;

public class UniqueClass implements NewEmployeeSelector {

    private final int number;

    public UniqueClass(int number) {
        this.number = number;
    }

    @Override
    public boolean isNeedNewEmployee(NewEmployee employee) {
        return employee.getSalary() >= number;
    }
}
```

EmployeeSelector.java
```java
package com.netlight.lab9;

interface NewEmployeeSelector {
    boolean isNeedNewEmployee(NewEmployee employee);

}
```

EmployeeHandler.java
```java
package com.netlight.lab9;

interface NewEmployeeHandler {
    void handleNewEmployees(NewEmployee employee, int index);
}
```

Main.java
```java
package com.netlight.lab9;

import com.netlight.lab7_8.Names;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        String[] ln = new Names().getLastname();
        String[] n = new Names().getNames();

        for (int i = 0; i < 100; i++) {
            company.hire(new NewEmployee(
                    n[(int) (Math.random() * n.length)],
                    ln[(int) (Math.random() * ln.length)],
                    "Moscow",
                    (int) (Math.random() * 1000000 + 10000000),
                    new Dates(
                            (int) (Math.random() * 27 + 1),
                            (int) (Math.random() * 12 + 1),
                            (int) (Math.random() * 30 + 2000))));
        }
//interface
//        checking salary "if more than 10600000"
        company.doSomethingWithNewEmployee(
                new UniqueClass(10600000),
                (employee, i) -> System.out.println(
                        "Employee #" +
                                (i + 1) +
                                ": " + " " +
                                employee.getFirstName() + " " +
                                employee.getLastName() + " " +
                                employee.getSalary() + " " +
                                employee.getDates()));
//anon class
//        checking salary "if more than 10700000"
        company.doSomethingWithNewEmployee(new NewEmployeeSelector() {
            @Override
            public boolean isNeedNewEmployee(NewEmployee employee) {
                return employee.getSalary() > 10700000;
            }
        }, new NewEmployeeHandler() {
            @Override
            public void handleNewEmployees(NewEmployee employee, int index) {
                System.out.println(
                        "Employee #" +
                                (index + 1) +
                                ": " + " " +
                                employee.getFirstName() + " " +
                                employee.getLastName() + " " +
                                employee.getSalary() + " " +
                                employee.getDates());

            }
        });

//lambda
//        checking salary "if more than 10800000"
        ArrayList<NewEmployee> empar = new ArrayList<>();
        company.doSomethingWithNewEmployee(
                employee -> employee.getSalary() > 10800000,
                (employee, i) -> empar.add(employee));
        for (int i = 0; i < empar.size(); i++) {
            System.out.println(
                    "Employee #" +
                            (i + 1) +
                            ": " + " " +
                            empar.get(i).getFirstName() + " " +
                            empar.get(i).getLastName() + " " +
                            empar.get(i).getSalary() + " " +
                            empar.get(i).getDates());
        }

    }

}
```

NewEmployee.java
```java
package com.netlight.lab9;

public class NewEmployee {
    private String firstName, lastName, place;
    private long salary;
    private Dates dates;

    public NewEmployee(String firstName, String lastName, String place, int salary, Dates dates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
        // replace phone with salary for more clear example
        this.salary = salary;
        this.dates = dates;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", place='" + place + '\'' +
                ", salary='" + salary + '\'' +
                ", dates=" + dates +
                '}';
    }
}
```

Company.java
```java
package com.netlight.lab9;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<NewEmployee> employeeList = new ArrayList<>();

    public List<NewEmployee> getNewEmployeeList() {
        return employeeList;
    }

    public void setNewEmployeeList(List<NewEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    public void hire(NewEmployee employee) {
        employeeList.add(employee);
    }

    public void hireAll(List<NewEmployee> allNewEmployees) {
        employeeList.addAll(allNewEmployees);
    }

    public void fire(double percent) {
        int numFire = (int) (employeeList.size() * percent / 100);
        for (int i = 0; i < numFire; i++) {
            employeeList.remove((int) (Math.random() * (employeeList.size() - 1)));
        }
    }

    public void doSomethingWithNewEmployee(
            NewEmployeeSelector selector,
            NewEmployeeHandler handler
    ) {
        int count = 0;
        for (NewEmployee employee : employeeList) {
            if (selector.isNeedNewEmployee(employee)) {
                handler.handleNewEmployees(employee, count);
                count++;
            }
        }
        System.out.println(count + " of employees have a good salary");
    }
}
```

Dates.java
```java
package com.netlight.lab9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
    LocalDate ld;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Dates(int day, int month, int year) {
        ld = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return f.format(ld);
    }
}
```

### Lab 10
Main.java
```java
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
```

### Lab 11
Main.java
```java
package com.netlight.lab11;

import java.util.ArrayList;

// ушел с пар, вы обещали зачесть посещение
// если сдам 11 лабу до 15/10/2020 00:00
public class Main {

    static int totalSum;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        System.out.println("10 operations");
        for (int i = 0; i < 10; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            System.out.println(t.getState());
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
        // result mul by 10 because of 10 threads
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 3, (int) Math.pow(9, 8));
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime - startTime));
    }

    private synchronized static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start - i) * 0.3;
            totalSum++;
        }
        return a;
    }
}
```

### Lab 12
EnumEx.java
```java
package com.netlight.lab12;

public enum EnumEx {
    GREEN(32),
    YELLOW(93),
    RED(31);

    private final int key;

    EnumEx(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
```

Main.java
```java
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
```

### Lab 13
OutOfInventoryException.java
```java
package com.netlight.lab13;

public class OutOfInventoryException extends Exception {
}
```

FinalNameException.java
```java
package com.netlight.lab13;

public class FinalNameException extends RuntimeException {
}
```

Steve.java
```java
package com.netlight.lab13;

public class Steve {
    int diamonds;
    String name = "Steve";

    public void setDiamonds(int diamonds) throws Exception {
        if (diamonds > 256) {
            throw new OutOfInventoryException();
        }
        if (diamonds < 1) {
            throw new Exception();
        }
        this.diamonds = diamonds;
    }

    //weird flex but ok
    public void setName(String name) {
        throw new FinalNameException();
    }

    @Override
    public String toString() {
        return "Steve{" +
                "diamonds=" + diamonds +
                '}';
    }
}
```

Main.java
```java
package com.netlight.lab13;

import java.util.Scanner;

public class Main {

    static void addDiamonds(Steve i) throws Exception {
        try {
            int items = Integer.parseInt(new Scanner(System.in).nextLine());
            i.setDiamonds(items);
        } catch (OutOfInventoryException ex) {
            System.out.println("Out of inventory!");
        } catch (Exception ex) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        Steve inventory = new Steve();
        addDiamonds(inventory);

        // name for inventory? illegal
        inventory.setName("Shpeck");

    }
}
```

### Lab 14
Main.java
```java
package com.netlight.lab14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] rules = new String[Integer.parseInt(s.nextLine())];
        int rlen = rules.length;

        for (int i = 0; i < rlen; i++) {
            rules[i] = s.nextLine();
        }
        String text = s.nextLine();
        String textPiece;
        String textCopy;
        String[] src = new String[rlen];
        String[] ptr = new String[rlen];

        // w/o regex
        textPiece = "";
        textCopy = text;

        for (int i = 0; i < rlen; i++) {
            src[i] = rules[i].split(" ")[0];
            ptr[i] = rules[i].split(" ")[1];
        }
        for (int j = 0; j < text.length(); j++) {
            textPiece += text.charAt(j);

            for (int i = 0; i < src.length; i++) {
                if (src[i].contains(textPiece) && textCopy.contains(src[i]))
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");

                else if (textPiece.contains(src[i])) {
                    textCopy = textCopy.replaceAll(src[i], " " + ptr[i] + " ");
                    textPiece = "";
                    break;
                }
            }
        }
        System.out.println(textCopy.replace(" ", ""));

        // w/ regex
        String srcStr = "";

        for (int i = 0; i < rlen; i++) {
            srcStr += rules[i].split(" ")[0];
            if (i != rlen - 1) srcStr += "|";
        }

        HashMap<String, String> replaceMap = new HashMap<>();

        for (String t : rules) replaceMap.put(t.split(" ")[0], t.split(" ")[1]);

        Pattern pattern = Pattern.compile(srcStr);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(x -> replaceMap.get(x.group())));
    }
}


```

### Lab 15_16
Node.java
```java
package com.netlight.lab15_16;

import java.util.HashMap;

public class Node {
    private final HashMap<Integer, Integer> transitionMap = new HashMap<>();
    private final HashMap<Integer, Integer> actionMap = new HashMap<>();

    public Node(int trans0, int state0, int action0, int trans1, int state1, int action1) {
        transitionMap.put(trans0, state0);
        transitionMap.put(trans1, state1);
        actionMap.put(trans0, action0);
        actionMap.put(trans1, action1);
    }

    public HashMap<Integer, Integer> getTransitionMap() {
        return transitionMap;
    }

    public HashMap<Integer, Integer> getActionMap() {
        return actionMap;
    }
}
```

Graph.java
```java
package com.netlight.lab15_16;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private final ArrayList<Node> nodeList = new ArrayList<>();
    private final HashMap<Integer, String> actionMap = new HashMap<>();

    public Graph() {
        actionMap.put(0, "create_project");
        actionMap.put(1, "add_library");
        actionMap.put(2, "restart");
        actionMap.put(3, "test");
        actionMap.put(4, "deploy");
        actionMap.put(5, "drop_db");

        nodeList.add(new Node(0, 1, 0, 1, 4, 1));
        nodeList.add(new Node(0, 2, 3, 1, 3, 5));
        nodeList.add(new Node(0, 3, 5, 1, 4, 1));
        nodeList.add(new Node(0, 2, 2, 1, 4, 4));
        nodeList.add(new Node(0, 0, 4, 1, 2, 2));
    }

    public void emulate(ArrayList<Integer> transList) {
        int initState = 0;
        for (int i = 0; i < transList.size(); i++) {
            System.out.println(actionMap.get(nodeList
                    .get(initState)
                    .getActionMap()
                    .get(transList.get(i))));
            initState = nodeList
                    .get(initState)
                    .getTransitionMap()
                    .get(transList.get(i));
        }
    }
}
```

Main.java
```java
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
```

.DS_Store
```java
   Bud1           
                                                           aIlocblob                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             e x t r aIlocblob      ;   (������      l a b 1Ilocblob      �   (������      l a b 1dsclbool     l a b 1 0Ilocblob     �   �������      l a b 1 1Ilocblob      ;  ������      l a b 1 2Ilocblob      �  ������      l a b 1 3Ilocblob       ������      l a b 1 4Ilocblob     �  ������      l a b 1 4bwspblob   �bplist00�


]ShowStatusBar[ShowPathbar[ShowToolbar[ShowTabView_ContainerShowSidebar\WindowBounds[ShowSidebar		_{{619, 97}, {770, 436}}	%1=I`myz{|}~�                            �    l a b 1 4vSrnlong       l a b 1 5 _ 1 6vSrnlong       l a b 2Ilocblob        (������      l a b 2dsclbool     l a b 3Ilocblob     �   (������      l a b 3dsclbool    l a b 4Ilocblob     �   (������      l a b 4dsclbool    l a b 5Ilocblob      ;   �������      l a b 6Ilocblob      �   �������      l a b 7 _ 8Ilocblob        �������      l a b 9Ilocblob     �   �������                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    @      �                                        @      �                                          @      �                                          @                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   E  
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       DSDB                                 `          �                                         @      �                                          @      �                                          @                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
```

### Lab 17_18
Main.java
```java
package com.netlight.lab17_18;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static String labNum;
    static HashMap filesMap = new HashMap();
    static PrintWriter pw;

    static {
        try {
            pw = new PrintWriter("README.md");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getContents(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] contents = file.list();
            for (String s : contents) {
                if (path.contains("lab"))
                    labNum = path.split("lab")[1];
                else if (path.contains("extra"))
                    labNum = "extra";
                getContents(path + "/" + s);
            }
        }

        ArrayList labFiles = new ArrayList();
        if (file.isFile()) {
            StringBuilder sb = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                sb.append(file.getName());
                sb.append("\n```java\n");
                String line = reader.readLine();
                while (line != null) {
                    sb.append(line + "\n");
                    line = reader.readLine();
                }
                sb.append("```\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

            labFiles.add(sb);

            System.out.println("Checking " + labNum + " on " + file.getName());
            if (filesMap.get(labNum) != null) {
                ArrayList newFiles = (ArrayList) filesMap.get(labNum);
                newFiles.add(sb);
                filesMap.put(labNum, newFiles);
            } else
                filesMap.put(labNum, labFiles);
        }
    }

    public static void main(String[] args) {
        Path filePath = Paths.get("").toAbsolutePath();
        getContents(filePath.toString() + "/src");
        System.out.println("Labs to generate: ");
        int labsCount = new Scanner(System.in).nextInt();
        filesMap.remove(null);

        pw.write("## Labs!\n\n");

        for (int i = 1; i < labsCount; i++) {

            if (filesMap.get(String.valueOf(i)) != null) {
                pw.write("### Lab " + i + "\n");
                for (StringBuilder code :
                        (ArrayList<StringBuilder>) filesMap.get(String.valueOf(i))) {
                    pw.write(code + "\n");
                }
            } else if (filesMap.get(i + "_" + (i + 1)) != null) {
                pw.write("### Lab " + i + "_" + (i + 1) + "\n");
                for (StringBuilder code :
                        (ArrayList<StringBuilder>) filesMap.get(i + "_" + (i + 1))) {
                    pw.write(code + "\n");
                }
            } else {
                continue;
            }
            System.out.println("Done " + i);
        }
        pw.write("###Lab Extra\n");
        for (StringBuilder code :
                (ArrayList<StringBuilder>) filesMap.get("extra"))
            pw.write(code + "\n");

        pw.close();
    }
}
```

### Lab 19_20
Client.java
```java
package com.netlight.lab19_20;


import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {

    static String ip = "127.0.0.1";
    static int port = 1337;
    static int offset = 0;


    public static void sendMessage(DatagramSocket s) {
        while (true) {
            byte[] buff = new byte[2048];
            String msg;
            DatagramPacket packet = new DatagramPacket(buff, offset, buff.length);

            try {
                s.receive(packet);
                msg = new String(buff, offset, packet.getLength());
                System.out.println(msg);
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static void getMessage(DatagramSocket socket) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            DatagramPacket toPacket;
            byte[] toSendBuffer = scanner.nextLine().getBytes();
            try {
                toPacket = new DatagramPacket(
                        toSendBuffer,
                        offset,
                        toSendBuffer.length,
                        InetAddress.getByName(ip),
                        port);
                socket.send(toPacket);
            } catch (UnknownHostException e) {
                e.getStackTrace();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the port (can't be the same): ");
        int clientPort = new Scanner(System.in).nextInt();
        try {
            DatagramSocket socket = new DatagramSocket(clientPort);
            System.out.print("Enter your name: ");
            Thread thread = new Thread(() -> getMessage(socket));
            thread.start();
            thread = new Thread(() -> sendMessage(socket));
            thread.start();
        }catch(SocketException e){
            e.getStackTrace();
        }
    }
}
```

history.txt
```java
15/11/20 [18:23] <Server> Hello, megaman
15/11/20 [18:23] <megaman> hello guys
15/11/20 [18:23] <Server> Hello, satan
15/11/20 [18:23] <satan> yep guys
15/11/20 [18:24] <megaman> oh god...
15/11/20 [18:24] <Server> Hello, chicks
15/11/20 [18:24] <chicks> what r u doing guys 
15/11/20 [18:24] <megaman> notihjfdf
15/11/20 [18:24] <megaman> sorry
15/11/20 [18:24] <satan> bruh
15/11/20 [18:24] <chicks> bruh
```

Server.java
```java
package com.netlight.lab19_20;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import java.io.File;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Server {

    static int offset = 0;
    static DatagramSocket dgSocket;
    static DatagramPacket packet;
    static DatagramPacket toPacket;
    static StringBuilder historyStr = new StringBuilder();
    static HashMap<String, String> nickIPMap = new HashMap<>();
    static ArrayList<InetAddress> IPList = new ArrayList<>();
    static ArrayList<Integer> portList = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[2048];
        String packetAddr;
        StringBuilder msgStr = new StringBuilder();
        String msg;
        dgSocket = new DatagramSocket(1337);
        packet = new DatagramPacket(buffer, offset, buffer.length);


        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy [HH:mm]");
        Date date;
        File f = new File("src/com/netlight/lab19_20/history.txt");
        f.createNewFile();

        while (true) {
            dgSocket.receive(packet);
            msg = new String(buffer, offset, packet.getLength());
            date = new Date();
            msgStr.append(dateFormat.format(date) + " ");
            packetAddr = packet.getAddress().getHostAddress() +":"+ packet.getPort();

            if (nickIPMap.get(packetAddr) == null || !portList.contains(packet.getPort())) {
                nickIPMap.put(packetAddr, msg);
                System.out.println(packetAddr+" connected!");
                msgStr.append("<Server> Hello, " + msg);

                IPList.add(packet.getAddress());
                portList.add(packet.getPort());

            } else
                msgStr.append("<"+nickIPMap.get(packetAddr)+"> " + msg);

            for (int i = 0; i < IPList.size(); i++) {
                toPacket = new DatagramPacket(
                        msgStr.toString().getBytes(),
                        offset,
                        msgStr.length(),
                        IPList.get(i),
                        portList.get(i));
                dgSocket.send(toPacket);
            }

            System.out.println(msgStr);
            historyStr.append(msgStr.toString() + "\n");
            msgStr = new StringBuilder();
            try (PrintWriter wf = new PrintWriter(f)) {
                wf.write(historyStr.toString());
            } catch (IOException e) {
                e.getStackTrace();
            }

        }
    }
}

```

###Lab Extra
Main.java
```java
package com.netlight.extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = new Scanner(System.in).nextInt();
        int a = 0;

        for (int i = sum / 5; i >= 0; i--) {
            for (int j = (sum - i * 5) / 3; j >= 0; j--) {
                for (int k = sum - j * 3 - i * 5; k >= 0; k--) {
                    if (i * 5 + j * 3 + k == sum)
                        a++;
                }
            }
        }

        System.out.print(a);
    }

}
```

