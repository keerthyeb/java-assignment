package com.step.assignment.cyclinder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getRadius() {
        Circle circle = new Circle(3);
        double actualOutput = circle.getRadius();
        assertEquals(actualOutput,3);
    }

    @Test
    void getArea() {
        Circle circle = new Circle(3.75);
        double actualOutput = circle.getArea();
        assertEquals(actualOutput,44.178646691106465);
    }
}