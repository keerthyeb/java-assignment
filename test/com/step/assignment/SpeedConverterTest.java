package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    @Test
    void shouldReturnTheValueInMilesperhour() {
        long actualOutput = SpeedConverter.toMilesPerHour(1.5);
        assertEquals(actualOutput,1);

    }
}