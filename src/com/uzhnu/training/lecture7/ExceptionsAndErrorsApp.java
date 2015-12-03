package com.uzhnu.training.lecture7;

import java.util.Scanner;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:37 @ 02.12.2015.
 */
public class ExceptionsAndErrorsApp {


    public static int solveLinearEquation(int a, int b) {
        try {
            return -b / a;
        } catch (ArithmeticException e) {
//            throw new Exception("Число a не може бути нулем", e);
            throw new BadEquationArgumentException("Число a не може бути нулем", e);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Порахуємо ax + b = 0");

//        System.out.println("Введіть a");
//        int a = scanner.nextInt();
//        System.out.println("Введіть b");
//        int b = scanner.nextInt();

        int a = 0;
        int b = 2;
//        if (a == 0) {
//            System.out.println("Рівняння не має розв’язку");
//        } else {
//            System.out.println("x = " + (-b / a));
//        }

//        try {
//            System.out.println("операція 1");
//            System.out.println("операція 2");
//            System.out.println("x = " + (-b / a));
//            System.out.println("операція 3");
//            System.out.println("операція 4");
//            return;
//        } catch (ArithmeticException e) {
//            throw new IllegalArgumentException("Число a не може бути нулем");
//        } catch (StackOverflowError e) {
//            System.out.println("При операції виникло ділення на нуль");
//        } finally {
//            System.out.println("finally блок");
//        }


            System.out.println("x = " + solveLinearEquation(a, b));



        String as = null;
        System.out.println("BS".equals(as));


    }

}
