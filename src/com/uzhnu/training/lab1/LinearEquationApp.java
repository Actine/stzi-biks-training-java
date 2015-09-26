package com.uzhnu.training.lab1;


import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:05 @ 24.09.2015.
 */
public class LinearEquationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c = 0;

        System.out.print("Введіть a: ");
        a = Double.parseDouble(scanner.nextLine());

        System.out.print("Введіть b: ");
        b = Double.parseDouble(scanner.nextLine());

        System.out.print("Введіть b: ");
        b = Double.parseDouble(scanner.nextLine());

        System.out.println(-b / a);


        // -----------------------------------------


        double d = b*b - 4*a*c;

        Math.sqrt(d);




    }

}
