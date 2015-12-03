package com.uzhnu.training.lab6.eshop;

import java.util.HashSet;
import java.util.Set;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 11:09 @ 03.12.2015.
 */
public class Tovar {

    private String name;
    private int price;
    private Set<String> categories = new HashSet<>();

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public Tovar addCategory(String category) {
        categories.add(category);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
