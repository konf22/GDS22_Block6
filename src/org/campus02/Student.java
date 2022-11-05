package org.campus02;

import java.util.Objects;

public class Student {

    private int matrNr;
    private String fullName;

    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr && Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr, fullName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
