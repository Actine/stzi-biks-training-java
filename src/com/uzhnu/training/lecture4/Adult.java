package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:22 @ 04.11.2015.
 */
public class Adult extends Human implements StudiedAtUniversity {
    public Adult(int age) {
        super(age);
    }

    @Override
    public String getUniversityName() {
        return "UzhNU";
    }
}
