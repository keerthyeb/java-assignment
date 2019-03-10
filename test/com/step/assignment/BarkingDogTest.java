package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarkingDogTest {

    @Test
    void shouldWakeUp() {
        boolean actualOutput = BarkingDog.shouldWakeUp(true, 1);
        assertEquals(actualOutput, true);
        actualOutput = BarkingDog.shouldWakeUp(false, 2);
        assertEquals(actualOutput, false);
        actualOutput = BarkingDog.shouldWakeUp(true, 8);
        assertEquals(actualOutput, false);
        actualOutput = BarkingDog.shouldWakeUp(true, -1);
        assertEquals(actualOutput, false);
    }
}