package com.company.dayfour;

import java.util.ArrayList;

public class Question2 {

    public static void main(String[] args) {
        int j= 0;
        String inputstring = "This@ArrayList";
        ArrayList<Character> unique = new ArrayList<Character>();
        for (int i = 0; i < inputstring.length(); i++) {
            if (!unique.contains(inputstring.charAt(i))) {
                unique.add(inputstring.charAt(i));
                j++;
            }
        }
        System.out.println("unique = " + unique);
        System.out.println("unique elements count = " + j);

    }
    
    }


