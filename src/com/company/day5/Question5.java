package com.company.day5;
import java.util.*;
public class Question5{

  public static void main(String[] args) {
    List<Integer> integerlist =
        Arrays.asList(1,2,3,5,7,9,12,15,16,18);
        ArrayList<Integer> sumList = new ArrayList<Integer>();
        for (int i=0; i<integerlist.size();i++)
        {
             if(integerlist.get(i) > 5){
                 
                  sumList.add(integerlist.get(i));
             }
        }
     for (int j=0; j<sumList.size();j++)
        {
          
                 
              System.out.println("The element is" + sumList.get(j));
             
        }
}
}
