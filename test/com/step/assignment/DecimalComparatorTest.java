package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalComparatorTest {

    @Test
    void areEqualByThreeDecimalPlaces() {
        boolean actualOutput = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        assertEquals(actualOutput,true);
        actualOutput = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        assertEquals(actualOutput,false);
        actualOutput = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        assertEquals(actualOutput,true);
        actualOutput = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        assertEquals(actualOutput,false);

    }
}