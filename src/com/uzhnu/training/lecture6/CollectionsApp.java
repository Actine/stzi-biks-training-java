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

        System.out.println(namesList.contains(new String("Іван")));

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

        for (Map.Entry<String, Integer> entry : namesWithPhones.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
