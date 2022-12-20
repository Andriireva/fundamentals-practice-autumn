package com.fundemtals.practice.assigment3;

public class Person {
    private String name;

    private Double age;

    private Gender gender;


    public static void main(String[] args) {
        Person[] person = new Person[2];

        person[0] = new Person("Lara", 1.5, Gender.FEMALE);
        person[1] = new Person("Ahmad", -4.5, Gender.MALE);

        AgeComparator AgeComparator = new AgeComparator();

        int compareByAge = AgeComparator.compare(person[0], person[1]);
        System.out.println(compareByAge);


        NameComparator NameComparator = new NameComparator();
        int compareByName = NameComparator.compare(person[0], person[1]);
        System.out.println(compareByName);

        if (compareByAge >= 1) {
            System.out.println(person[0].getName() + " " + person[0].getAge() + " " + person[0].gender +
                    " " + person[1].getName() + " " + person[1].getAge() + " " + person[1].gender);
        } else if (compareByAge < 0) {
            System.out.println(person[1].getName() + " " + person[1].getAge() + " " + person[1].gender + " " +
                    (person[0].getName() + " " + person[0].getAge()) + " " + person[0].gender);
        } else {
            System.out.println(person[0].getName() + " " + person[0].gender + " " + person[1].getName() +
                    " " + person[1].gender + " same Age");
        }

    }

    public Person() {
    }

    public Person(String name, Double age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return this.age;
    }

    public void setAge(Double age) {
        if(age <= 0) {
            throw new NegativeAgeException("Age must be positive number");
        }
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
