package org.ueabend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {

        /*
        *   KEY | VALUE
        *   "Susi Sorglos"       | {3, 2}
        *   "Max Mustermann"     | {}
        * */

        HashMap<String, ArrayList<Integer>> gradesOfStudents = new HashMap<String, ArrayList<Integer>>();
        
        gradesOfStudents.put("Susi Sorglos", new ArrayList<>()/*A112*/);
        gradesOfStudents.put("Max Mustermann", new ArrayList<>() /*B223*/);

        System.out.println("gradesOfStudents = " + gradesOfStudents);

        ArrayList<Integer> grades;
        grades = gradesOfStudents.get("Susi Sorglos"); /*A112*/
        grades.add(3);
        grades.add(2);

        grades = gradesOfStudents.get("Max Mustermann"); /*B223*/
        grades.add(4);
        grades.add(2);
        grades.add(1);

        System.out.println("gradesOfStudents = " + gradesOfStudents);

        //gradesOfStudents.remove("Susi Sorglos");
        System.out.println("gradesOfStudents = " + gradesOfStudents);

        System.out.println("gradesOfStudents.containsKey(\"Max Mustermann\") = " + gradesOfStudents.containsKey("Max Mustermann"));
        System.out.println("gradesOfStudents.containsKey(\"Susi Sorglos\") = " + gradesOfStudents.containsKey("Susi Sorglos"));

        for (String student : gradesOfStudents.keySet()) {
            System.out.println("student = " + student);
        }

        for (Map.Entry<String, ArrayList<Integer>> entry: gradesOfStudents.entrySet()) {
            System.out.println("entry = " + entry);
        }

    }
}
