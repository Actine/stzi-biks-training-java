package com.uzhnu.training.lab6.eshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 11:16 @ 03.12.2015.
 */
public class Shop {

    private List<Tovar> tovars = new ArrayList<>();

    public Shop() {
        tovars.add(
                new Tovar("Відеокарта GeForce 980 Ti", 20000)
                        .addCategory("Відеокарта")
                        .addCategory("Для геймерів")
        );
        tovars.add(
                new Tovar("Відеокарта GeForce 980", 15000)
                        .addCategory("Відеокарта")
                        .addCategory("Для геймерів")
        );
        tovars.add(
                new Tovar("Відеокарта Samsung Duos", 5000)
                        .addCategory("Відеокарта")
                        .addCategory("Офісні комплектуючі")
        );
        tovars.add(new Tovar("Сканер Panasonic Dt23843", 7000).addCategory("Для геймерів"));
        tovars.add(new Tovar("Сканер Panasonic 12434675", 7000));
        tovars.add(new Tovar("Сканер Panasonic 12122", 7000));
    }

    public List<Tovar> getByCategory(String category) {
        List<Tovar> filteredList = new ArrayList<>();
        for (Tovar tovar : tovars) {
            if (tovar.getCategories().contains(category)) {
                filteredList.add(tovar);
            }
        }
        return filteredList;
    }

}
