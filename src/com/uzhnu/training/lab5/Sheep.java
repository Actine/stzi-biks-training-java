package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:10 @ 03.11.2015.
 */
public class Sheep extends Animal {
    public Sheep(int age) {
        super(age);
    }

    @Override
    int getFeedingConstant() {
        return 2;
    }
}
