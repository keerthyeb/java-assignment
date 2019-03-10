package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    void hasTeen() {
        boolean actualOutput = TeenNumberChecker.hasTeen(12,13,20);
        assertEquals(actualOutput,true);
        actualOutput = TeenNumberChecker.hasTeen(14,13,19);
        assertEquals(actualOutput,true);
        actualOutput = TeenNumberChecker.hasTeen(12,25,20);
        assertEquals(actualOutput,false);
    }

    @Test
    void isTeen() {
        boolean actualOutput = TeenNumberChecker.isTeen(13);
        assertEquals(actualOutput,true);
        actualOutput = TeenNumberChecker.isTeen(20);
        assertEquals(actualOutput,false);

    }
}