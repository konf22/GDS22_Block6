package org.campus02;

import java.util.HashSet;

public class SetsDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        // zum set hinzufügen
        strings.add("Hallo");
        strings.add("Servus");
        System.out.println(strings.size());
        System.out.println(strings.toString());

        strings.add("Hallo");
        System.out.println(strings.size());
        System.out.println(strings.toString());


        // neues HashSet von Person erstellen
        HashSet<Person> persons = new HashSet<>(); //STRG + ALT + V
        // Person Max hinzufügen
        persons.add(new Person("Max", "Mustermann"));
        // Person Max nochmals hinzufügen
        persons.add(new Person("Max", "Mustermann"));
        System.out.println(persons.toString());
    }
}
