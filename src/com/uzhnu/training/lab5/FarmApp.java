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
        System.out.println(Goat.FEEDING_COST_PER_MONTH_OF_AGE);
        animals[0] = new Pig(10);
        animals[1] = new Sheep(12);
        animals[2] = new Cow(30);
        animals[3] = new Hare(2);
        animals[4] = new Goat(6);
        int animalCount = 5;

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

//            System.out.println("Щоби прогодувати цю тварину, потрібно " + animals[i].getFeedingPrice());
        }

        for (int i = 0; i < 10; i++) {
            new Cow(1);
            System.out.println(Cow.getPopulation());
        }

        Animal[] newAnimals = new Animal[10];
        System.arraycopy(animals, 0, newAnimals, 0, animals.length);
        animals = newAnimals;
        animals[5] = new Hare(2);
        animals[6] = new Goat(6);
        animalCount = 7;

        for (int i = 0; i < animalCount; i++) {
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

            System.out.println("Щоби прогодувати цю тварину, потрібно " + animals[i].getFeedingPrice());
        }

    }

}
