package com.step.assignment;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(9);
    }
    public static void printNumberInWord(int number){
        String[] numbersInWords = {"ZERO", "ONE", "TWO", "THREE",
                "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if(number < 0 || number > 9){
            System.out.println("OTHER");
            return;
        }
        System.out.println(numbersInWords[number]);
    }
}
