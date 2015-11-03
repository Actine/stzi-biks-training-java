package com.uzhnu.training.lab4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 11:15 @ 29.10.2015.
 */
public class RecursionFact {

    public static long fact(long x) {
        if (x <= 1) {
            return 1;
        } else {
            return fact(x - 1) * x;
        }
    }

    public static long fastFact(long x) {
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(RecursionFact.fact(5));
        System.out.println(RecursionFact.fastFact(5));
    }

}
