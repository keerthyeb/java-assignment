package com.step.assignment;

public class NumberPallindrome {
    public static void main(String[] args) {
        System.out.println(reverse(432534));
    }

    public static boolean reverse(int number){

        Integer absoluteInt = Math.abs(number);
        String stringifiedNumber = absoluteInt.toString();
        StringBuilder sb = new StringBuilder(stringifiedNumber);
        StringBuilder k = new StringBuilder(sb.reverse());
        return stringifiedNumber.equals(k);
    }


}
