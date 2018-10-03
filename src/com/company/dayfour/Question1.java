package com.company.dayfour;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {
    float sum = 0;
    List<Float> list = new LinkedList<>();
    list.add(2.1f);
    list.add(2.2f);
    list.add(2.3f);
    list.add(2.4f);
    list.add(2.5f);
    Iterator<Float> itr = list.iterator();
    while(itr.hasNext()){

        Float next = itr.next();
        sum = sum + next;

    }
        System.out.println("sum is = " + sum);

    }
}


