package com.step.assignment;

public class LeapYear {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        if (year >= 9999 || year <= 1) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
              if(year% 400 == 0 )return true;
               return false;
            }
            return true;
        }
        return false;
    }
}

