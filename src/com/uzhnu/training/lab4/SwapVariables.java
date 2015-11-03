package com.uzhnu.training.lab4;

import java.util.Map;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:00 @ 29.10.2015.
 */
public class SwapVariables {

    public static void main(String[] args) {

        int a = 5;
        int b = 12;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
