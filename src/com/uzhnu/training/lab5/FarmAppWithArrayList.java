package com.uzhnu.training.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:01 @ 03.11.2015.
 */
public class FarmAppWithArrayList {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println(animals.size());

        animals.add(new Pig(10));
        animals.add(new Sheep(12));
        animals.add(new Cow(30));
        animals.add(new Hare(2));
        animals.add(new Goat(6));

        Collections.sort(animals);

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.exit(0);

        System.out.println(animals.size());

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.feed();
            if (animal instanceof Cow) {
                System.out.println("animals[" + i + "] is a Cow");
            }
            if (animal instanceof Animal) {
                System.out.println("animals[" + i + "] is a Animal");
            }
            if (animal instanceof Object) {
                System.out.println("animals[" + i + "] is an Object");
            }

//            System.out.println("Щоби прогодувати цю тварину, потрібно " + animals[i].getFeedingPrice());
        }

        for (int i = 0; i < 10; i++) {
            new Cow(1);
            System.out.println(Cow.getPopulation());
        }

        Hare hareForSale = new Hare(2);
        animals.add(hareForSale);
        animals.add(new Goat(6));

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.feed();
            if (animal instanceof Cow) {
                System.out.println("animals[" + i + "] is a Cow");
            }
            if (animal instanceof Animal) {
                System.out.println("animals[" + i + "] is a Animal");
            }
            if (animal instanceof Object) {
                System.out.println("animals[" + i + "] is an Object");
            }

            System.out.println("Щоби прогодувати цю тварину, потрібно " + animal.getFeedingPrice());
        }


        System.out.println(animals.size());

        animals.remove(2);
        animals.remove(hareForSale);

        System.out.println(animals.size());
    }

}
