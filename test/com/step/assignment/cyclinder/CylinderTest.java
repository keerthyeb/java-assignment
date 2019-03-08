package com.step.assignment.cyclinder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        double actualOutput  = cylinder.getHeight();
        assertEquals(actualOutput,7.25);
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        double actualOutput  = cylinder.getVolume();
        assertEquals(actualOutput,701.574580913447);
    }
}