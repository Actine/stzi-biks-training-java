package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:10 @ 03.11.2015.
 */
public class Animal {

    private boolean isHungry = true;

    public boolean isHungry() {
        return this.isHungry;
    }

    public void feed() {
        this.isHungry = false;
    }

}
