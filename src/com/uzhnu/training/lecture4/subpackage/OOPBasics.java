package com.uzhnu.training.lecture4.subpackage;

import com.uzhnu.training.lecture4.Human;

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

        System.out.println(human.getName());
        System.out.println(human2.getName());


    }

}
