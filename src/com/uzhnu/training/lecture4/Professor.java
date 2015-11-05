package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:42 @ 04.11.2015.
 */
public class Professor extends Human implements HasPassport, UniversityMember {

    public Professor(int age) {
        super(age);
    }

    @Override
    public String getUniversityName() {
        return "UzhNU";
    }

    @Override
    public String getPassportSeries() {
        return "ВР";
    }

    @Override
    public int getPassportNumber() {
        return 355468;
    }
}