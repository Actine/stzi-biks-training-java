package com.uzhnu.training.lecture1.stzi;

/**
 * Created by Actine on 16.09.2015.
 */
public class SecondSimpleApp {

    public static void main(String[] args) {
        int a = 13;
        int b = 5;
        int r;
        double c = 2.5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a < c);
        System.out.println(a > c);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println(a);
        System.out.println(b);

        String name1 = "Pasha";
        String myBeautifulName = "Pasha";
        String name2 = new String("Pasha");
        String name3 = null;
        String name4;
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        Integer aObj = a;
        int x = aObj;
        aObj.equals(name2);
    }
}
