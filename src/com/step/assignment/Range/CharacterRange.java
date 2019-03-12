package com.step.assignment.Range;

import java.util.ArrayList;

public class CharacterRange implements Range<Character>{

    private char start;
    private char end;
    private ArrayList<Character> elements;

    public CharacterRange(char start, char end) {
        this.start = start;
        this.end = end;
        elements = new ArrayList<Character>();
    }

    @Override
    public ArrayList<Character> getAll() {
        for(char ch = start ; ch<= end; ch++)elements.add(ch);
        return elements;
    }

    @Override
    public boolean contains(Character element) {
        return elements.contains(element);
    }
}
