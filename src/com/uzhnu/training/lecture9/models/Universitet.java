package com.uzhnu.training.lecture9.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:57 @ 16.12.2015.
 */
public class Universitet {

    private String name;
    private Set<Fakultet> fakultets;

    public Universitet(String name) {
        this.name = name;
        this.fakultets = new HashSet<>();
    }

    public void addFakultet(Fakultet fakultet) {
        if (fakultet.universitet != null) {
            throw new IllegalArgumentException("Факультет " + fakultet.name + " уже числиться в університеті " + fakultet.universitet.name);
        }
        fakultets.add(fakultet);
        fakultet.universitet = this;
    }
}
