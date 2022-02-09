package com.company;

public class Singer extends Person {
    String nameOfBand;

    public Singer(String nameOfPerson, String designation, String nameOfBand) {
        super(nameOfPerson, designation);
        this.nameOfBand = nameOfBand;
    }

    public void singing() {
        System.out.println(nameOfPerson + "  is singing very well!");
    }

    @Override
    public void walking() {
        System.out.println(nameOfPerson+ " like to walk");
    }

    @Override
    public void eating() {
        System.out.println(nameOfPerson+ "s favorite Food is Burger ");
    }

    public void playGitar() {
        System.out.println(nameOfPerson + " can play Gitar. ");
    }

    @Override
    public void learn() {
        System.out.println(nameOfPerson+" learns to speak Russian");
    }

    @Override
    public String toString() {
        return "Singer " +
                "Name of person:'" + nameOfPerson + '\'' +
                ", Designation:'" + designation + '\'' +
                ", NameOfBand:'" + nameOfBand + '\'';
    }
}
