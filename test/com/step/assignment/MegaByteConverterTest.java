package com.step.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MegaByteConverterTest {

    @Test
    void printMegaBytesAndKiloBytes() {
        String actualOutput = MegaByteConverter.printMegaBytesAndKiloBytes(-1);
        assertEquals(actualOutput, "invalid value");
        actualOutput = MegaByteConverter.printMegaBytesAndKiloBytes(2500);
        assertEquals(actualOutput, "2500 KB = 2 MB and 452 KB");
        actualOutput = MegaByteConverter.printMegaBytesAndKiloBytes(-1024);
        assertEquals(actualOutput, "invalid value");
        actualOutput = MegaByteConverter.printMegaBytesAndKiloBytes(5000);
        assertEquals(actualOutput, "5000 KB = 4 MB and 904 KB");
    }
}