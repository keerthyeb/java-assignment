package com.step.assignment.ComoarableVSComparator;

import java.util.*;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Person keerthy = new Person("keerthy", 123456);
        Person amju = new Person("amju", 23435435);
        Person athul = new Person("athul", 0);
        Person reshmi = new Person("reshmi", 23);


        HashSet person = new HashSet<>();
        person.add(keerthy);
        person.add(amju);
        person.add(athul);
        person.add(reshmi);
        person.add(keerthy);
        System.out.println(person);
        Collections.sort(asList(keerthy,amju,athul,reshmi));
//        Collections.sort(asList(keerthy,amju,athul,reshmi),new PersonComparator());

    }
}
