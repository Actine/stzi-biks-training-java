package com.uzhnu.training.lecture2;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:26 @ 23.09.2015.
 */
public class ArraysAndFlowsLectureApp {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println(!x);
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(x && y);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        int i = 0;

        System.out.println((i++ < 10) && (i++ > 2) || (i++ > 1));

        System.out.println(i);

        System.out.println(x || y);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        int age = 15;

        if (age >= 18) {
            System.out.println("Вітаю на сайті");
        } else if (age < 18) {
            System.out.println("Іди учи уроки");
        } else if (age == 15) {
            System.out.println("Ніколи не виконається");
        } else {

        }

        System.out.println("123");


        while (true) {
            System.out.println("Вам " + age + " років");
            age++;
            if (age == 21) {
                break;
            }
        }

        do {
            System.out.println("Вам " + age + " років");
            age++;
        } while (age < 28);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }


        int[] numbers = new int[5];
        String[] names = new String[]{"Паша", "Влад", "Сергій"};

        String[] strings = new String[3];

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        for (int element : numbers) {
            System.out.println(element);
        }

        int[][] matrix = new int[3][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
    }

}
