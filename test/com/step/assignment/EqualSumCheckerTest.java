package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualSumCheckerTest {

    @Test
    void hasEqualSum() {
        boolean actualOutput = EqualSumChecker.hasEqualSum(1,1,1);
        assertEquals(actualOutput,false);
        actualOutput = EqualSumChecker.hasEqualSum(1,1,2);
        assertEquals(actualOutput,true);
        actualOutput = EqualSumChecker.hasEqualSum(1,-1,0);
        assertEquals(actualOutput,true);
    }
}