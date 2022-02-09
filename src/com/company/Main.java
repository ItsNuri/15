package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Programmer programmer = new Programmer("Nurzhan", "Student", "'Peaksoft'");
        Dancer dancer = new Dancer("Alisha", "Dancer", "Asia Mix");
        Singer singer = new Singer("Zayn Malik", "Singer", "One Direction");

        System.out.println(programmer.toString());
        programmer.learn();
        programmer.walking();
        programmer.eating();
        programmer.coding();
        System.out.println("--------------------------");
        System.out.println(dancer.toString());
        dancer.learn();
        dancer.walking();
        dancer.eating();
        dancer.dancing();
        System.out.println("--------------------------");
        System.out.println(singer.toString());
        singer.learn();
        singer.walking();
        singer.eating();
        singer.singing();
        singer.playGitar();
    }
}
