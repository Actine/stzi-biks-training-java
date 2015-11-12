package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:11 @ 03.11.2015.
 */
public class Goat extends Animal {

    public static final int FEEDING_COST_PER_MONTH_OF_AGE;

    static {
        FEEDING_COST_PER_MONTH_OF_AGE = 3;
    }

    public Goat(int age) {
        super(age);
    }

    @Override
    int getFeedingConstant() {
        return FEEDING_COST_PER_MONTH_OF_AGE;
    }
}
