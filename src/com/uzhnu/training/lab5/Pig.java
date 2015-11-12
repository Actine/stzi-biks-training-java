package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:10 @ 03.11.2015.
 */
public class Pig extends Animal {
    public Pig(int age) {
        super(age);
    }

    @Override
    int getFeedingConstant() {
        return 3;
    }
}
