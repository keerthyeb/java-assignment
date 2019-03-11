package com.step.assignment.ApnaIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {

    private List<Integer> numbers;
    private int index;

    public ListIterator(List<Integer> numbers) {
        this.numbers = numbers;
        this.index = -1;
    }

    public boolean hasNext(){
        this.index ++;
        if(this.index < this.numbers.size()) return true;
        return false;

    }

    public Integer next(){
        if(this.hasNext()) {
            Integer number = this.numbers.get(this.index);
            return number;
        }
        throw new NoSuchElementException("No such ElementException");
    }
}
