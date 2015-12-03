package com.uzhnu.training.lab6.filetest;

import java.io.FileNotFoundException;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:37 @ 03.12.2015.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        FoodList foodList = new FoodList();
        foodList.addFoodEntry(new FoodEntry("Яйце", 100));
        foodList.addFoodEntry(new FoodEntry("Яблуко", 50));
        foodList.addFoodEntry(new FoodEntry("Банан", 300));
        foodList.addFoodEntry(new FoodEntry("Бургер", 800));
        foodList.addFoodEntry(new FoodEntry("Картопля фрі", 1200));

        foodList.saveToFile();

        foodList.loadFromFile();

    }

}
