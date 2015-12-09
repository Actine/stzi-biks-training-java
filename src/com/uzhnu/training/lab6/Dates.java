package com.uzhnu.training.lab6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 12:00 @ 08.12.2015.
 */
public class Dates {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        Date now = new Date();
        Date inAMinute = new Date(System.currentTimeMillis() + 1000 * 60);

        System.out.println(now);
        System.out.println(inAMinute);

        System.out.println(inAMinute.compareTo(now));

        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.setTime(inAMinute);

        calendar.set(2016, Calendar.JANUARY, 1);
        System.out.println(calendar.getTime());

    }

}
