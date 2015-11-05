package com.uzhnu.training.lecture4.subpackage;

import com.uzhnu.training.lecture4.Human;
import com.uzhnu.training.lecture4.Professor;
import com.uzhnu.training.lecture4.Student;

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

        Human human = new Professor(10);
        human.setName("Paul");

        Human human2 = new Student(18);
        human2.setName("Alex");

        System.out.println(human.getName());
        System.out.println(human2.getName());

        Professor professor = new Professor(25);


    }

}
