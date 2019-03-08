package com.step.assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintJobTest {

    @Test
    void main() {
    }

    @Test
    @DisplayName("Test for width, height, areaPerBucket and extraBucket paramers and it should return number of buckets to buy")
    void getBucketCount() {
        int noOfBucketsToBuy = PaintJob.getBucketCount(-3.4,2.1,1.5,2);
        assertEquals(noOfBucketsToBuy,-1);
        noOfBucketsToBuy = PaintJob.getBucketCount(3.4,2.1,1.5,2);
        assertEquals(noOfBucketsToBuy,3);
        noOfBucketsToBuy = PaintJob.getBucketCount(2.75,3.25,2.5,1);
        assertEquals(noOfBucketsToBuy,3);
    }

    @Test
    void getBucketCount1() {
        int noOfBucketsToBuy = PaintJob.getBucketCount(-3.4,2.1,1.5);
        assertEquals(noOfBucketsToBuy,-1);
        noOfBucketsToBuy = PaintJob.getBucketCount(3.4,2.1,1.5);
        assertEquals(noOfBucketsToBuy,5);
        noOfBucketsToBuy = PaintJob.getBucketCount(7.25,4.3,2.35);
        assertEquals(noOfBucketsToBuy,14);
    }

    @Test
    void getBucketCount2() {

        int noOfBucketsToBuy = PaintJob.getBucketCount(3.4,1.5);
        assertEquals(noOfBucketsToBuy,3);
        noOfBucketsToBuy = PaintJob.getBucketCount(6.26,2.2);
        assertEquals(noOfBucketsToBuy,3);
        noOfBucketsToBuy = PaintJob.getBucketCount(3.26,0.75);
        assertEquals(noOfBucketsToBuy,5);

    }

}