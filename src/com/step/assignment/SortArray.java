package com.step.assignment;

public class SortArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 6;
        numbers[2] = 1;
        numbers[3] = 11;
        numbers[4] = 9;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
               if(numbers[i] > numbers[j] ){
                   int temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j] = temp;
               }
            }
        }
        for(int i = 0; i< numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

    }

}

