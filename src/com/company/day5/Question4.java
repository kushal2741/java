package com.company.day5;
import java.util.*;
public class Question4 {

    public static void main(String[] args) {
        List<Integer> integerlist =
                Arrays.asList(1, 2, 3, 5, 7, 9, 12, 15, 16, 18);
        int sumList = 0 ;
        for (int i = 0; i < integerlist.size(); i++) {
            if (integerlist.get(i) > 5) {

                sumList = sumList + integerlist.get(i);
            }
        }
        System.out.println("sum of no's greater than 5 is  = " + sumList);

    }
}
