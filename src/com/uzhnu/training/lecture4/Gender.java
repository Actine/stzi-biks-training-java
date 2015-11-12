package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:41 @ 11.11.2015.
 */
public enum Gender {
    MALE("male"), FEMALE("female"), UNSPECIFIED("n/a");

    String value;

    Gender(String value) {
        this.value = value;
    }
}

