package com.uzhnu.training.lecture9.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:56 @ 16.12.2015.
 */
public class Fakultet {

    String name;
    Universitet universitet;
    Set<Kafedra> kafedras;

    public Fakultet(String name) {
        this.name = name;
        kafedras = new HashSet<>();
    }

    public Universitet getUniversitet() {
        return universitet;
    }

    public void addKafedra(Kafedra kafedra) {
        kafedras.add(kafedra);
        kafedra.fakultet = this;
    }
}
