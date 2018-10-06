package com.company.day5;
import java.util.*;
public class Question6{

  public static void main(String[] args) {
        List<Integer> integerlist =
        Arrays.asList(1,2,3,5,7,9,12,15,16,18);
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i=0; i<integerlist.size();i++)
        {
             if(integerlist.get(i) % 2 == 0 && integerlist.get(i) > 3){

                 System.out.println("The element is " + evenList.add(integerlist.get(i)));
             }
        }

             
        
}
}
