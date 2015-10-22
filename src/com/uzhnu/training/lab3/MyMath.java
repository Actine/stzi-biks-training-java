package com.uzhnu.training.lab3;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:58 @ 22.10.2015.
 */
public class MyMath {

    /**
     * Розв’язати квадратне рівняння типу ax^2 + bx + c = 0
     *
     * @param a
     * @param b
     * @param c
     * @return масив із коренями: {x1, x2} якщо два корені; {x} якщо один;
     * пустий масив, якщо нема коренів
     */
    public static double[] solve(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d == 0) {
            // дискримінант = 0 - один корінь
            double x = -b / (2 * a);
            return new double[]{x};
        } else if (d < 0) {
            // дискримінант < 0 - нема коренів
            return new double[]{};
        } else {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b - sqrtD) / 2 / a;
            double x2 = (-b + sqrtD) / 2 / a;

            return new double[]{x1, x2};
        }
    }

}
