package com.fundemtals.practice.assigment4;

public class Main2 {
    public static void main(String[] args) {
        Interface functionInterface = (name, age) -> name + " " + age;
        Interface functionInterface2 = (name, age) -> age + " " + name;
        System.out.println("FunctionInterface working " + functionInterface.nameAndAge("mohamd",23));
        System.out.println("FunctionInterface working " + functionInterface2.nameAndAge("mohamd",23));
        System.out.println("FunctionInterface working " + functionInterface2.nameAndAge(55,new Person("Name", Gender.FEMALE, 18)));

        System.out.println("FunctionInterface NameCaptilized " + functionInterface.nameCapitalized("mohamd"));

    }
}
