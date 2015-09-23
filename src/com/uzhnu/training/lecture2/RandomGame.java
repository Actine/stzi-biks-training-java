package com.uzhnu.training.lecture2;


import java.util.Random;
import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:52 @ 23.09.2015.
 */
public class RandomGame {

    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(100);

        System.out.println("Я задумав число між 0 до 100, спробуй відгадати його");

        int response;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            response = Integer.parseInt(scanner.nextLine());

            if (response == number) {
                System.out.println("Ви відгадали число");
                break;
            } else if (response < number) {
                System.out.println("Ваше число менше мого");
            } else {
                System.out.println("Ваше число більше мого");
            }
        }

    }

}
