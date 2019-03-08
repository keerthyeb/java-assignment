package com.step.assignment.poolArea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getHeight() {
        Cuboid cuboid = new Cuboid(5,10,5);
        double actualOutput = cuboid.getHeight();
        assertEquals(actualOutput,5);
    }

    @Test
    void getVolume() {
        Cuboid cuboid = new Cuboid(5,10,5);
        double actualOutput = cuboid.getVolume();
        assertEquals(actualOutput,250);
    }
}