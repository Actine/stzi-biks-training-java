package com.uzhnu.training.lecture6;

import java.util.*;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:04 @ 18.11.2015.
 */
public class CollectionsApp {

    public static void main(String[] args) {

        String[] namesArray = {"Володимир", "Сергій", "Дмитро", "Володимир", "Іван"};

        Set<String> strings = new TreeSet<>(Arrays.asList(namesArray));
        strings.add("Павло");

        for (String name : strings) {
            System.out.println(name);
        }

        String[] backToArray = new String[strings.size()];
        strings.toArray(backToArray);
        for (String name : backToArray) {
            System.out.println(name);
        }

//        int[] numbers = new int[]{1, 4, 8, 12, 10, 4, 2, 9};
        Arrays.sort(namesArray);
        System.out.println(Arrays.toString(namesArray));


        System.exit(0);



        // Списки - List
        List<String> namesList = new ArrayList<>();
        namesList.add("Володимир");
        namesList.add("Сергій");
        namesList.add("Дмитро");
        namesList.add("Володимир");
        namesList.add("Іван");

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        List<String> filteredNames = new ArrayList<>();
        for (String name : namesList) {
            if (name.contains("о")) {
                filteredNames.add(name);
            }
        }

        Set<String> uniqueNames = new TreeSet<>(filteredNames);
        for (String name : uniqueNames) {
            System.out.println(name);
        }

//        System.out.println(namesList.contains(new String("Іван")));

        System.out.println("--------");

        // Множини - Set
//        Set<String> namesSet = new HashSet<>(namesList);
        Set<String> namesSet = new LinkedHashSet<>(namesList);
        for (String name : namesSet) {
            System.out.println(name);
        }

        System.out.println("--------");

        //  - Map
//        Map<String, Integer> namesWithPhones = new HashMap<>();
        Map<String, Integer> namesWithPhones = new LinkedHashMap<>();
        namesWithPhones.put("Володимир", 53647);
        namesWithPhones.put("Сергій", 93352);
        namesWithPhones.put("Сергій", 12346);
        namesWithPhones.put("Іван", 87345);

        Set<Map.Entry<String, Integer>> entries = namesWithPhones.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
