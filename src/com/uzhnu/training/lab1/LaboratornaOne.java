package com.uzhnu.training.lab1;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:04 @ 01.10.2015.
 */
public class LaboratornaOne {

    public static void main(String[] args) {

        int a = 9;
        int b = 19;

        int sumEven = 0;    // парне
        int sumOdd = 0;     // непарне

        for (int i = a; i <= b; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Сума парних: " + sumEven);
        System.out.println("Сума непарних: " + sumOdd);

        int i = 20;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }


    }

}
