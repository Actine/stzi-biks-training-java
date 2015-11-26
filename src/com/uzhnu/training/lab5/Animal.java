package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:10 @ 03.11.2015.
 */
abstract public class Animal implements Comparable<Animal> {

    public static final int FEEDING_COST_PER_MONTH_OF_AGE = 0;

    private boolean isHungry = true;
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return this.isHungry;
    }

    public void feed() {
        this.isHungry = false;
    }

    public int getFeedingPrice() {
        return getFeedingConstant() * age;
    }

    abstract int getFeedingConstant();

    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(" + age + ")";
    }
}
