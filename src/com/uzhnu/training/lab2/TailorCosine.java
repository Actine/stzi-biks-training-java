package com.uzhnu.training.lab2;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 10:49 @ 15.10.2015.
 */
public class TailorCosine {

    public static void main(String[] args) {

        double precision = 0.00001;

        double x = Math.PI / 3;
        double sum = 1;

        double prevChiselnik = 1;
        long prevZnamennik = 1;

        for (int n = 1; ; n++) {

            prevChiselnik = prevChiselnik * x * x;
            prevZnamennik = prevZnamennik * (2*n - 1) * (2*n);
            double dodanok = prevChiselnik / prevZnamennik;
            if (Math.abs(dodanok) <= precision) {
                break;
            }

            if (n % 2 == 0) {
                sum = sum + dodanok;
            } else {
                sum = sum - dodanok;
            }

        }

        System.out.println(sum);

    }

}
