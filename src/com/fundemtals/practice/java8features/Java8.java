package com.fundemtals.practice.java8features;

import java.util.function.BiFunction;

// 17 latest LTS version
// java 8 was released 2014
// What were added in java 8:
// 1. Lambda expressions ( u can now "easily" use function as an argument in method, or any other
// 2. Function interfaces ( lead to "functional" style of programming
//     you can find functional interfaces in java.util.function
//      The most used functional interfaces are: Function, Consumer, Predicate, Supplier
// 3. Defaults methods ( method that are implemented in interfaces )
//     default marks method in interface that it has implementation
// 4. Optional class ( Class helps to avoid NPE (NullPointerExceptions)
// 5. Stream API ( additional method/functionality to collections)
public class Java8 {

    public static void main(String[] args) {
        // I want to have a funtion that will be implemented easily and do a simple stuff
        // fun (fun2(a,b ) ) ->

//        Object funtion1 = { a + b };
//        Object funtion2 = { a * b };
//
//        funtion1(4, 5) => 9;
//        funtion2(4, 5) => 20;
//        calculate( funtion1 )


        // 1 and 2 arguments type is Double and Result of this function is Double
        BiFunction<Double, Double, Double> functionSumJava8Way = (a, b) -> a + b; // <- here it is exact implementation of abstract method in BiFunction Interface
        BiFunction<Double, Double, Double> functionSumLegacyWay = new FunctionSum(); // <- here it is exact implementation
        BiFunction<Double, Double, Double> functionMultiply = (a, b) -> a * b; // <- it is inline interface implementation
        System.out.println(functionSumJava8Way.apply(4d, 5d));
        System.out.println(functionSumLegacyWay.apply(4d, 5d));
        System.out.println(functionMultiply.apply(10d, 5d));

        CustomFunctionalInterface myFunction = (q, w, e) -> q + w + String.valueOf(e);
        CustomFunctionalInterface myFunction2 = (q, w, e) -> q / w + String.valueOf(e);
        String result = myFunction.apply(5.5d, 44, false);
        System.out.println("My custom function result: " + myFunction.apply(5.5d, 44, false));
        System.out.println("My custom function result: " + myFunction2.apply(5.5d, 44, false));
        System.out.println("My custom function call default method: " + myFunction2.anotherM());
        MyCustomFInterface2 myCustomFInterface2 = (b, n) -> System.out.println(b - n);

        // Implementation that print every number between a and b
        MyCustomFInterface2 myCustomFInterfacePrinting = (a, b) -> { // multi line lambda
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        };

        myCustomFInterface2.doMagic(3, 10);
        myCustomFInterfacePrinting.doMagic( 3, 10);

//        System.out.println("My custom function result: " + myFunction2.call(5.5d, 44, false));


    }

    private static Number calculate( Object function) {
        return null;
    }




}
