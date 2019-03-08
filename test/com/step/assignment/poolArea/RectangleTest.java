package com.step.assignment.poolArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(5,10);
        double actualOutput = rectangle.getWidth();
        assertEquals(actualOutput,5);
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(5,10);
        double actualOutput = rectangle.getLength();
        assertEquals(actualOutput,10);
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(5,10);
        double actualOutput = rectangle.getArea();
        assertEquals(actualOutput,50);
    }
}