package com.uzhnu.training.samples;

import java.util.Arrays;

/**
 * <p></p>
 *
 * @author Paul Danyliuk
 * @version $Id$
 */
public class QuadraticEquationApp {

    /**
     * Розв’язує квадратне рівняння типу ax² + bx + c = 0
     *
     * @param a коефіцієнт при x²
     * @param b коефіцієнт при x
     * @param c вільний член
     * @return масив із коренями рівняння, величиною 0, 1 або 2 елементи
     */
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d < 0) {
            // нема коренів
            return new double[0];
        } else if (d == 0) {
            // один корінь
            return new double[]{-b / 2 / a};
        } else {
            // два корені
            double sqrtOfD = Math.sqrt(d);
            return new double[]{
                    (-b - sqrtOfD) / 2 / a,
                    (-b + sqrtOfD) / 2 / a,
            };
        }
    }

    public static void main(String[] args) {

        double[] result1 = solveQuadraticEquation(1, 5, 4);
        System.out.println(Arrays.toString(result1));

        double[] result2 = solveQuadraticEquation(2, 0, -8);
        System.out.println(Arrays.toString(result2));

        double[] result3 = solveQuadraticEquation(1, -2, 1);
        System.out.println(Arrays.toString(result3));

        double[] result4 = solveQuadraticEquation(1, 0, 1);
        System.out.println(Arrays.toString(result4));

    }

}
