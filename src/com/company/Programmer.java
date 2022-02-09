package com.company;

public class Programmer extends Person {
    String nameOfCompany;

    public Programmer(String nameOfPerson, String designation, String nameOfCompany) {
        super(nameOfPerson, designation);
        this.nameOfCompany = nameOfCompany;
    }

    public void coding() {
        System.out.println(nameOfPerson + " love to coding ");
    }

    @Override
    public String toString() {
        return "Programmer " +
                "NameOfPerson is: '" + nameOfPerson + '\'' +
                ", Designation is: '" + designation + '\'' +
                ", NameOfCompany: '" + nameOfCompany + '\'';
    }
}
