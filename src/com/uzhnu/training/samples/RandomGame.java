package com.uzhnu.training.samples;


import java.util.Random;
import java.util.Scanner;

/**
 * Гра, де комп’ютер загадує число від 0 до 100, і його треба відгадати
 *
 * @author Paul Danyliuk
 * @date 15:52 @ 23.09.2015.
 */
public class RandomGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = new Random().nextInt(101);      // ціле у проміжку [0, 101), тобто [0, 100]
        int response;

        System.out.println("Я задумав число від 0 до 100, спробуйте відгадати його");

        while (true) {
            // Зчитати введений рядок із консолі і розпізнати в ньому ціле число
            response = Integer.parseInt(scanner.nextLine());

            if (response < randomNumber) {
                System.out.println("Ні, спробуйте більше число");
            } else if (response > randomNumber) {
                System.out.println("Ні, спробуйте менше число");
            } else {
                // Залишився тільки варіант, коли randomNumber == response
                System.out.println("Ви відгадали!");
                break;
            }
        }
    }

}
