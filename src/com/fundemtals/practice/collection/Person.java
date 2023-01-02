package com.fundemtals.practice.collection;

import java.util.Objects;

public class Person
//        implements Comparable<Person>
{
    private String name;
    private Integer age;

    public static int hashCodeMethodCalledNumbers;
    public static int equalsMethodCalledNumbers;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Equals is used for "hard" compare
    @Override
    public boolean equals(Object o) {
        equalsMethodCalledNumbers++;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && Objects.equals(getAge(), person.getAge());
    }

    // Hash code is used for "Soft" compare
    @Override
    public int hashCode() {
        hashCodeMethodCalledNumbers++;
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name) + this.age.compareTo(o.age);
//    }
}
