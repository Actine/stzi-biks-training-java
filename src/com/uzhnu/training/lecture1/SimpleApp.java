package com.uzhnu.training.lecture1;

/**
 * Created by Actine on 16.09.2015.
 */
public class SimpleApp {

    static int returnOne() {
        return 1;
    }

    static void myMethod(String a, int b) {
        System.out.println(a + returnOne() + b);
    }

    public static void main(String[] args) {
        myMethod("Hello", 3);
    }

}
