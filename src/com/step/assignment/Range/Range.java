package com.step.assignment.Range;

import java.util.ArrayList;

public interface Range<T> {
    ArrayList<T> getAll();

    boolean contains(T element);

}
