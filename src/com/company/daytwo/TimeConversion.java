package com.company.daytwo;
import java.util.*;
//Program to convert seconds into Hour,minutes and seconds
public class TimeConversion {

    public static void main(String[] args) {
        printDaysHoursMinutesAndSecondsFromSeconds(67526344);
    }

    public static void printDaysHoursMinutesAndSecondsFromSeconds(long seconds) {
        long days = seconds/(60*60*24);
        System.out.println("days = " + days);
        long remainingSeconds = seconds - (days*60*60*24);
        long hours = remainingSeconds/(60*60);
        remainingSeconds = remainingSeconds - (hours*60*60);
        long minutes = remainingSeconds/60;
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + remainingSeconds%60);

    }
}
