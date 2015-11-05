package com.uzhnu.training.lecture4;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:30 @ 28.10.2015.
 */
public class Student extends Human implements HasStudentPass, UniversityMember {

    private String university;
    private boolean drunk;
    private boolean hasZalikova;

    public Student(int studentNumber) {
        super(17);
        super.setName("Student #" + studentNumber);
    }

    @Override
    public String getUniversityName() {
        return "UzhNU";
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        verifyNotEmpty(university, "Університет");
        this.university = university;
    }

    public boolean isDrunk() {
        return drunk;
    }

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }

    public boolean hasZalikova() {
        return hasZalikova;
    }

    public void setHasZalikova(boolean hasZalikova) {
        this.hasZalikova = hasZalikova;
    }

    public String toString() {
        return super.toString() + "{" +
                "university='" + university + '\'' +
                ", drunk=" + drunk +
                ", hasZalikova=" + hasZalikova +
                ", name=" + getName() +
                ", age=" + age +
                '}';
    }

    @Override
    public int getStudentPassNumber() {
        return 123456;
    }
}
