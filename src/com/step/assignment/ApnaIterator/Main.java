package com.step.assignment.ApnaIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Create A class called ListIterator
    //Takes a list as constructor parameter
    //method hasNext() tells if there are any more elements in the list which are not yet visited
    //method next()
    //     - gives the next element if available
    //     - throw new NoSuchElementException() when all elements are visited already


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        ListIterator iterator = new ListIterator(list);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());


    }
}
