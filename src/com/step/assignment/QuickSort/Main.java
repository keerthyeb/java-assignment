package com.step.assignment.QuickSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int limit = scanner.nextInt();
        int[] numbers = new int[limit];
        System.out.println("enetr the numbers");
        for(int i= 0; i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        QuickSort quickSort = new QuickSort(numbers);
        quickSort.sort(0,numbers.length-1);
        int[] sortedNumbers = quickSort.getNumbers();
        for(int i = 0; i< sortedNumbers.length ;i++){
            System.out.println(sortedNumbers[i]);
        }

    }
}
