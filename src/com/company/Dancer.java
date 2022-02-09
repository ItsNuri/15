package com.company;

import org.w3c.dom.ls.LSOutput;

public class Dancer extends Person {
    String nameOfGroup;

    public Dancer(String nameOfPerson, String designation, String nameOfGroup) {
        super(nameOfPerson, designation);
        this.nameOfGroup = nameOfGroup;
    }
    @Override
    public void learn() {
        System.out.println(nameOfPerson+" learn to play piano");
    }

    @Override
    public void walking() {
        System.out.println(nameOfPerson+" walking per day 10 km");
    }

    @Override
    public void eating() {
        System.out.println(nameOfPerson+"s favorite Food is rice");
    }

    public void dancing() {
        System.out.println(nameOfPerson + " dancing in Group " + nameOfGroup);
    }




    @Override
    public String toString() {
        return "Dancer " +
                "NameOfGroup: '" + nameOfGroup + '\'' +
                ", NameOfPerson: '" + nameOfPerson + '\'' +
                ", Designation: '" + designation + '\'';
    }
}
