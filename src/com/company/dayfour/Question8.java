package com.company.dayfour;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Question8 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMMM-yyyy ");
        SimpleDateFormat d2 = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = "26-11-2013";
        Date date = d2.parse(dateInString);
        System.out.println(outputFormat.format(date));

    }
}


