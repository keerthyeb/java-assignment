package com.step.assignment;

public class PaintJob {
    public static void main(String[] args) {

        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println(getBucketCount(3.4,2.1,1.5));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
         if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
             return -1;
         }
         double area = height * width;
         double noOfBucket = area/ areaPerBucket;
         double noOfBucketToBuy = Math.ceil(noOfBucket - extraBuckets);
         return (int) (noOfBucketToBuy);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width,height,areaPerBucket,0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
         return getBucketCount(1,area,areaPerBucket);
    }
}
