package com.uzhnu.training.lecture4;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:33 @ 28.10.2015.
 */
public class OOPBasics {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String hello = scanner.next();
//
//        PrintStream out = System.out;
//        out.println(hello);

        Human human = new Human(10);
        human.setName("Paul");

        Human human2 = new Human(18);
        human2.setName("Alex");

        Student student = new Student(456);
        student.setUniversity("UzhNU");
        student.setDrunk(false);
        student.setHasZalikova(true);

        System.out.println(human.getName());
        System.out.println(human2.getName());
        System.out.println(human);
        System.out.println(student);

    }

}
