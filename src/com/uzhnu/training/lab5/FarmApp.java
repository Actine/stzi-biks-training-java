package com.uzhnu.training.lab5;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:01 @ 03.11.2015.
 */
public class FarmApp {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Pig();
        animals[1] = new Sheep();
        animals[2] = new Cow();
        animals[3] = new Hare();
        animals[4] = new Goat();

        for (int i = 0; i < animals.length; i++) {
            animals[i].feed();
            if (animals[i] instanceof Cow) {
                System.out.println("animals[" + i + "] is a Cow");
            }
            if (animals[i] instanceof Animal) {
                System.out.println("animals[" + i + "] is a Animal");
            }
            if (animals[i] instanceof Object) {
                System.out.println("animals[" + i + "] is an Object");
            }
        }

    }

}
