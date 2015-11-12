package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:10 @ 03.11.2015.
 */
public class Cow extends Animal {

    public static final int FEEDING_COST_PER_MONTH_OF_AGE = 3;

    private static int population = 0;

    public Cow(int age) {
        super(age);
        population++;
    }

    @Override
    int getFeedingConstant() {
        return FEEDING_COST_PER_MONTH_OF_AGE;
    }

    public void milk() {

    }

    public static int getPopulation() {
        return population;
    }
}
