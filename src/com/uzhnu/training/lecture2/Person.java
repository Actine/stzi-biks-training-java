package com.uzhnu.training.lecture2;

/**
 * Code for lecture 2
 *
 * @author Paul Danyliuk
 * @date 21:15 @ 17.09.2015.
 */
public class Person {

    int age;
    String name;

    String returnMyName() {
        return name;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void sayMyName() {
        System.out.println(name);
    }

}
