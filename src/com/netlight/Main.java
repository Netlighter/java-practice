package com.netlight;

class Shape {
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

    int field1;
    String name;
    boolean is_done;
    int age;
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
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DogNursery{
    Dog[] beds = new Dog[10];
    int last_bed;

    public DogNursery(){
        int last_bed = 0;
    }

    public void add(Dog dog){
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


