package org.ueabend;

import org.campus02.Student;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {

        Student susi = new Student(123, "Susi Sorglos");
        Student max = new Student(124, "Max Mustermann");
        Student john = new Student(123, "John Doe"); // matrNr doppelt
        
        // Sets
        // equals/hashCode

        System.out.println("susi.hashCode() = " + susi.hashCode());
        System.out.println("max.hashCode() = " + max.hashCode());
        System.out.println("john.hashCode() = " + john.hashCode());

        HashSet<Student> hashSetStudents = new HashSet<>();
        hashSetStudents.add(john);
        hashSetStudents.add(susi);
        hashSetStudents.add(max);

        System.out.println("hashSetStudents = " + hashSetStudents);
        hashSetStudents.add(john);
        System.out.println("hashSetStudents = " + hashSetStudents);

        hashSetStudents.remove(john);
        System.out.println("hashSetStudents = " + hashSetStudents);

        System.out.println("hashSetStudents.add(john) = " + hashSetStudents.add(john));
        System.out.println("hashSetStudents.add(john) = " + hashSetStudents.add(new Student(123, "John Doe")));
        System.out.println("hashSetStudents.add(john) = " + hashSetStudents.add(new Student(123, "Johny Doe")));

        System.out.println("hashSetStudents.contains(susi) = " + hashSetStudents.contains(susi));
        System.out.println("hashSetStudents.contains(new Student(123, \"Susi Sorglos\")) = "
                + hashSetStudents.contains(new Student(123, "Susi Sorglos")));


        for (Student s : hashSetStudents) {
            System.out.println("s = " + s);
        }
    }
}
