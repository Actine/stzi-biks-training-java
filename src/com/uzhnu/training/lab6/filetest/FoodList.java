package com.uzhnu.training.lab6.filetest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:38 @ 03.12.2015.
 */
public class FoodList {

//    private Map<String, FoodEntry> foodMap = new LinkedHashMap<>();
    private List<FoodEntry> foodList = new ArrayList<>();

    public static final File FILE = new File("food.txt");

//    public FoodEntry findFromMap(String title) {
//        return foodMap.get(title);
//    }

    public FoodEntry findFromList(String title) {
        for (FoodEntry entry : foodList) {
            if (entry.getTitle().equals(title)) {
                return entry;
            }
        }
        return null;
    }

    public void addFoodEntry(FoodEntry entry) {
//        foodMap.put(entry.getTitle(), entry);
        foodList.add(entry);
    }

    public void loadFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(FILE);

//        int mapSize = Integer.parseInt(scanner.nextLine());
//        foodMap.clear();
//        for (int i = 0; i < mapSize; i++) {
//            String title = scanner.nextLine();
//            int caloriesPer100g = Integer.parseInt(scanner.nextLine());
//            FoodEntry entry = new FoodEntry(title, caloriesPer100g);
//            foodMap.put(title, entry);
//        }

        int listSize = Integer.parseInt(scanner.nextLine());
        foodList.clear();
        for (int i = 0; i < listSize; i++) {
            String title = scanner.nextLine();
            int caloriesPer100g = Integer.parseInt(scanner.nextLine());
            FoodEntry entry = new FoodEntry(title, caloriesPer100g);

            String nextLine;

            nextLine = scanner.nextLine();
            if (!"null".equals(nextLine)) {
                entry.setProteins(Integer.parseInt(nextLine));
            }

            nextLine = scanner.nextLine();
            if (!"null".equals(nextLine)) {
                entry.setFats(Integer.parseInt(nextLine));
            }

            nextLine = scanner.nextLine();
            if (!"null".equals(nextLine)) {
                entry.setCarbs(Integer.parseInt(nextLine));
            }

            foodList.add(entry);
        }
    }

    public void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(FILE);
//
//        writer.println(foodMap.size());
//        for (Map.Entry<String, FoodEntry> entry : foodMap.entrySet()) {
//            writer.println(entry.getValue().getTitle());
//            writer.println(entry.getValue().getCaloriesPer100g());
//        }

        writer.println(foodList.size());
        for (FoodEntry entry : foodList) {
            writer.println(entry.getTitle());
            writer.println(entry.getCaloriesPer100g());
            writer.println(entry.getProteins());
            writer.println(entry.getFats());
            writer.println(entry.getCarbs());
        }

        writer.close();
    }

}
