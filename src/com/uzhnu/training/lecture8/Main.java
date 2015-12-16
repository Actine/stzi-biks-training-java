package com.uzhnu.training.lecture8;

import com.uzhnu.training.lab5.Animal;
import com.uzhnu.training.lab5.Pig;
import com.uzhnu.training.lab6.eshop.Tovar;

import java.util.*;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:25 @ 09.12.2015.
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("something");
        String temp = strings.get(0);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        int tempInt = integers.get(0);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Pig(10));
        Animal t = animals.get(0);


        ArrayList<String> names = new ArrayList<>();
        names.add("Artem");
        String name1 = names.get(0);


        Box<Integer> box1 = new Box<>();
        box1.setItem(10);

//        Receiver<Integer> receiver = new Receiver<>();
//        receiver.receiveBox(box1, Integer.class);
//
//        Receiver<Double> receiver1 = new Receiver<>();
//        Box<Double> box3 = new Box<>();
//        box3.setItem(1.23);
//        receiver1.receiveBox(box3, Double.class);

        Receiver<Tovar> receiver = new Receiver<>();
        Box<Tovar> box = new Box<>();
        box.setItem(new Tovar("abc", 123));
        receiver.receiveBox(box, Tovar.class);

        Map<List<List<List<Animal>>>, Set<Map<String, Animal>>> epicMap = new HashMap<>();


//        Receiver<String> receiver1 = new Receiver<>();
//        Box<String> box2 = new Box<>();
//        receiver1.receiveBox(box2);

        System.out.println(box1.getItem());

        System.out.println(Util.repeat("123").getClass().getSimpleName());
        System.out.println(Util.repeat(123).getClass().getSimpleName());
        System.out.println(Util.repeat(new Pig(12)).getClass().getSimpleName());

    }

}
