package com.uzhnu.training.lab3;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:21 @ 20.10.2015.
 */
public class QuadraticEquationApp {

    public static void main(String[] args) {

        double a = 2;
        double b = 2;
        double c = 0;

        double[] roots = MyMath.solve(2, 2, 0);

        if (roots[0] == -1 && roots[1] == 0) {
            System.out.println("Тест пройшов");
        } else {
            System.out.println("Тест не пройшов");
        }

        roots = MyMath.solve(1, 1, 0);

        if (roots[0] == -1 && roots[1] == 0) {
            System.out.println("Тест пройшов");
        } else {
            System.out.println("Тест не пройшов");
        }

        roots = MyMath.solve(1, 1, 2);

        if (roots[0] == -1 && roots[1] == 0) {
            System.out.println("Тест пройшов");
        } else {
            System.out.println("Тест не пройшов");
        }

    }

}
