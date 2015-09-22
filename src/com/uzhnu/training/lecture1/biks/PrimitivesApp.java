package com.uzhnu.training.lecture1.biks;

import java.util.Scanner;

/**
 * Code for lecture 2
 *
 * @author Paul Danyliuk
 * @date 21:15 @ 17.09.2015.
 */
public class PrimitivesApp {

    public static void main(String[] args) {

        int a = 13;
        int b = 5;
        double c = 2.5;

//        Integer d = 13;
//        Integer e = 5;

//        String s1 = "a";
//        String s2 = "b";

//        System.out.println(d + e);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((int) Math.sqrt(4));

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name1.equals(name2));



    }
}
