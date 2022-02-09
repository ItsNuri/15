package com.company;

public class Person {
    String nameOfPerson;
    String designation;

    public Person(String nameOfPerson, String designation) {
        this.nameOfPerson = nameOfPerson;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(nameOfPerson + " is learning right now");
    }

    public void walking() {
        System.out.println(nameOfPerson + " is very fond of walking!");
    }

    public void eating() {
        System.out.println(nameOfPerson + " enjoys eating pizza!");
    }

}
