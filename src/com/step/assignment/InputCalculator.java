package com.java.day1;

import java.util.Scanner;


public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner number = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (number.hasNextInt()) {
            count++;
            sum += number.nextInt();
        }
        double avg = (double) sum / count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
}
