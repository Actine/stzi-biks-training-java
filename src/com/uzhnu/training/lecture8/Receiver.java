package com.uzhnu.training.lecture8;

import com.uzhnu.training.lab6.eshop.Tovar;

import java.util.Random;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:54 @ 09.12.2015.
 */
public class Receiver<T extends Tovar> {


    public Box<T> receiveBox(Box<T> b, Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T result = clazz.newInstance();
        result.setName("повернутий товар");
        result.setPrice(1246);
        Box<T> newBox = b.getClass().newInstance();
        newBox.setItem(result);
        return newBox;
    }

}
