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

        Human human = new Student(10);
        human.setName("Paul");
//        human.setGender(Gender.valueOf("male"));
//        System.out.println(human.getGender().value);

        Human human2 = new Professor(18);
        human2.setName("Alex");

        Student student = new Student(456);
        student.setName("Andrew");
        student.setUniversity("UzhNU");
        student.setDrunk(false);
        student.setHasZalikova(true);

        Professor professor = new Professor(40);
        professor.setName("Vitaliy", "Petrovich");

        System.out.println(human.getName());
        System.out.println(human2.getName());
        System.out.println(human);
        System.out.println(student);

        UniversityMember student1 = new Student(16);
        UniversityMember professor1 = new Professor(16);

        StudiedAtUniversity mom = new Adult(40);
        StudiedAtUniversity dad = new Adult(41);
        StudiedAtUniversity grandmom = new Professor(70);


        StudiedAtUniversity[] uzhnuGetTogether = new StudiedAtUniversity[3];
        uzhnuGetTogether[0] = mom;
        uzhnuGetTogether[1] = dad;
        uzhnuGetTogether[2] = grandmom;


        System.out.println("Student has passport: " + (student instanceof HasPassport));
        System.out.println("Student has student pass: " + (student instanceof HasStudentPass));


        String x = "abc";
        System.out.println(x.toUpperCase());
        System.out.println(x);

    }

}
