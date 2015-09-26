package com.uzhnu.training.lab1;

import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 11:13 @ 24.09.2015.
 */
public class Suma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Введіть друге число:");
        int b = Integer.parseInt(scanner.nextLine());


        int sum = 0;

        for (int i = a; i <= b; i++) {
//            sum += i;
            sum = sum + i;
        }

        System.out.println("Сума дорівнює " + sum);
    }

}
