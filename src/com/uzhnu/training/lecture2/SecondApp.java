package com.uzhnu.training.lecture2;

/**
 * Code for lecture 2
 *
 * @author Paul Danyliuk
 * @date 21:16 @ 17.09.2015.
 */
public class SecondApp {

    public static void main(String[] args) {

        int a = 13;
        int b = 5;
        double c = 2.5;

        Integer d = 13;
        Double e = 2.5;

        int myAge = 23;

        String hello = "Hello";

//        System.out.println(hello);
//        System.out.println();

        hello = "Hello again";

        Person volodymyr = new Person();
        volodymyr.age = 17;
        volodymyr.name = "Volodymyr";

        volodymyr.sayMyName();

        System.out.println(volodymyr.returnMyName());

        volodymyr.setAge(18);

        System.out.println(volodymyr.age);

//        System.out.println(hello);
//
//
        final String constant = "Hello 2";
        System.out.println(constant);
//        System.out.println("Hello 3");
//
    }

}
