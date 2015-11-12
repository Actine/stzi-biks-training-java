package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 15:48 @ 28.10.2015.
 */
public abstract class Human {

    protected int age;
    protected String name;
    protected Gender gender;

    public Human(int age) {
        this.age = age;
    }

    final public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        verifyNotEmpty(name, "Ім’я");
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        verifyNotEmpty(firstName, "Ім’я");
        this.name = firstName + " " + lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    protected void verifyNotEmpty(String name, String verifyingWhat) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(verifyingWhat + " не може бути пустим");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        return !(name != null ? !name.equals(human.name) : human.name != null);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
