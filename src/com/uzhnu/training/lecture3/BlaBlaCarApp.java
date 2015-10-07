package com.uzhnu.training.lecture3;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:45 @ 07.10.2015.
 */
public class BlaBlaCarApp {

    public static void main(String[] args) {

        Ride[] rides = new Ride[5];
        rides[0] = new Ride(120, 0, 20, "Володимир");
        rides[1] = new Ride(100, 0, 22, "Сергій");
        rides[2] = new Ride(110, 1, 8, "Дмитро");
        rides[3] = new Ride(115, 1, 12, "Олександр");
        rides[4] = new Ride(95,  2, 10, "Вадим");

        rides[2].changeCarModel("Porsche Cayenne");
        rides[2].changePrice(250);

        // Вивести всі пропозиції
        for (int i = 0; i < rides.length; i++) {
            System.out.println(rides[i]);
        }

    }

}
