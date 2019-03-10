package com.step.assignment;

public class MinituesToDaysAndYearsCalculater {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minitues) {
        if (minitues < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int year = (int) (minitues / 525600);
        int days = (int) ((minitues % 525600) / 1440);
        System.out.println(minitues + " min = " + year + " y " + days + " d");
        return;

    }
}
