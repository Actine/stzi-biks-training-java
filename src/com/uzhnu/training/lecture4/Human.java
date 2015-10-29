package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:48 @ 28.10.2015.
 */
public class Human {

    protected int age;
    protected String name;

    public Human(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        verifyNotEmpty(name, "Ім’я");
        this.name = name;
    }

    protected void verifyNotEmpty(String name, String verifyingWhat) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(verifyingWhat + " не може бути пустим");
        }
    }

}
