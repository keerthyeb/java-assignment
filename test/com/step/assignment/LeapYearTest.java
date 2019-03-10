package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() {
        boolean actualOutPut  = LeapYear.isLeapYear(-1600);
        assertEquals(actualOutPut,false);
        actualOutPut  = LeapYear.isLeapYear(1600);
        assertEquals(actualOutPut,true);
        actualOutPut  = LeapYear.isLeapYear(2017);
        assertEquals(actualOutPut,false);
        actualOutPut  = LeapYear.isLeapYear(2000);
        assertEquals(actualOutPut,true);
    }
}