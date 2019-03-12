package com.step.assignment.Range;

import java.util.ArrayList;

public class IntegerRange implements Range<Integer> {

    ArrayList<Integer> elements;
    private Integer start;
    private Integer end;

    public IntegerRange(Integer start, Integer end) {
        this.start = start;
        this.end = end;
        elements = new ArrayList<Integer>();
    }

    @Override
    public ArrayList<Integer> getAll() {
        for (Integer i = this.start; i <= this.end; i++) elements.add(i);
        return elements;
    }

    @Override
    public boolean contains(Integer element) {
        return elements.contains(element);
    }


}
