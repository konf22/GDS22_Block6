package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Student maxi = new Student(1, "Max Mustermann");
        students.add(maxi);

        students.add(new Student(2, "Susi Sorglos"));

        Student frauMusterfrau = new Student(3, "Frau Musterfrau");
        students.add(frauMusterfrau);
        System.out.println(students.size());

        students.remove(frauMusterfrau);
        System.out.println(students.size());

        boolean isMaxiOnList = students.contains(maxi);
        System.out.println("isMaxiOnList = " + isMaxiOnList);

        System.out.println(students.toString());

        Student susi = new Student(2, "Susi Sorglos");
        boolean containsSusi = students.contains(susi);
        System.out.println("containsSusi = " + containsSusi);

        boolean containsSusi2 = containsName(students, "Susi Sorglos");
        System.out.println("containsSusi2 = " + containsSusi2);

        boolean containsSusi3 = containsMatrNr(students, 2);
        System.out.println("containsSusi3 = " + containsSusi3);


        boolean contains4 = students.contains(new Student(2, "Susi Sorglos"));
        System.out.println("contains4 = " + contains4);

    }

    public static boolean containsName(ArrayList<Student> studentList,
                                       String searchName) {
        for (int i = 0; i < studentList.size(); i ++) {
            Student student = studentList.get(i);
            if (student.getFullName().equals(searchName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsMatrNr(ArrayList<Student> studentList,
                                         int matrNr) {
        for (Student student : studentList) {
            if (student.getMatrNr() == matrNr) {
                return true;
            }
        }
        return false;
    }


}
