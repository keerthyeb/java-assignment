package com.step.assignment;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(5.6);
        printConversion(25.42);
        printConversion(75.114);

    }


        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            }
            double milesPerHour = kilometersPerHour / 1.60934D;
            return Math.round(milesPerHour);
        }

        public static void printConversion(double kilometersPerHour) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            String message = kilometersPerHour + " km/h = " + milesPerHour + " mi/h ";
            if (milesPerHour == -1) {
                message = "Invalid Value";
            }
            System.out.println(message);
        }

}




