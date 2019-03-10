package com.step.assignment;

public class MegaByteConverter {
    public static void main(String[] args) {

        System.out.println(printMegaBytesAndKiloBytes(-1));
        System.out.println(printMegaBytesAndKiloBytes(2500));
        System.out.println(printMegaBytesAndKiloBytes(-1024));
        System.out.println(printMegaBytesAndKiloBytes(5000));
    }

    public static String printMegaBytesAndKiloBytes(int kiloBytes){
        String msg;
        int megabytes = kiloBytes/1024;
        int remainingKiloBytes = kiloBytes % 1024;
        msg = kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB";
        if(kiloBytes <= 0){
            msg = "invalid value";
        }

        return msg;
    }
}
