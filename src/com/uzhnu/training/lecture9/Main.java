package com.uzhnu.training.lecture9;

import com.uzhnu.training.lecture9.models.Fakultet;
import com.uzhnu.training.lecture9.models.Kafedra;
import com.uzhnu.training.lecture9.models.Universitet;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:58 @ 16.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        Universitet uzhnu = new Universitet("UzhNU");
        Fakultet fizfak = new Fakultet("Fizfak");
        uzhnu.addFakultet(fizfak);
        Kafedra teib = new Kafedra("TEIB");
        fizfak.addKafedra(teib);
    }

}
