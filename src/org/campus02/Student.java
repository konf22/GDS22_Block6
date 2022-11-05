package org.campus02;

public class Student {

    private int matrNr;
    private String fullName;

    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
