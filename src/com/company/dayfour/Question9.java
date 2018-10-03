package com.company.dayfour;
import java.text.DateFormat;
import java.util.*;
import static java.text.DateFormat.*;
import static java.util.Locale.*;



public class Question9 {

    public static void main(String[] args) throws Exception {

        Date today = new Date();
        Locale[] locales = { US, UK, GERMANY, FRANCE };
        int[] styles = { FULL, LONG, MEDIUM, SHORT };
        String[] styleNames = { "FULL", "LONG", "MEDIUM", "SHORT" };
        DateFormat fmt = null;
        for (Locale locale : locales) {
            System.out.println("\nThe Date for " + locale.getDisplayCountry() + ":");
            for (int i = 0; i < styles.length; i++) {
                fmt = DateFormat.getDateInstance(styles[i], locale);
                System.out.println("\tIn " + styleNames[i] + " is " + fmt.format(today));
            }
        }
    }
}
