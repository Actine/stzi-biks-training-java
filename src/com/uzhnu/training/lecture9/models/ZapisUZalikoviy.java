package com.uzhnu.training.lecture9.models;

import java.security.cert.Certificate;
import java.util.Date;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:19 @ 16.12.2015.
 */
public class ZapisUZalikoviy {

    Predmet predmet;
    Vykladach vykladach;
    Certificate pidpysVykladacha;
    Date dataSkladannya;
    ECTS ocinkaEcts;
    int baly;
    String ocinkaVNacionalniySystemi;

    public static enum ECTS {
        A, B, C, D, E, F, Fx
    }

}
