package com.uzhnu.training.lecture3;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:00 @ 07.10.2015.
 */
public class Ride {

    int price;
    int day;
    int hour;
    String name;
    String cityFrom;
    String cityTo;
    String carModel;

    public Ride(int price, int day, int hour, String name) {
        this.price = price;
        this.day = day;
        this.hour = hour;
        this.name = name;

        this.cityFrom = "Ужгород";
        this.cityTo = "Львів";
        this.carModel = "Citroen C4";
    }

    public void changeCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void changePrice(int newPrice) {
        this.price = newPrice;
    }

    public String toString() {
        return String.format(
                "%s-%s, %3d гривень, ім’я водія: %10s, виїзд через %d днів о %2d:00. Автомобіль: %s",
                this.cityFrom, this.cityTo,
                this.price, this.name, this.day, this.hour, this.carModel
        );
    }

}
