package com.company.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question2 {

    public static void main(String[] args) {
     //consumer interface
            Consumer < String > consumer1 = (arg) -> {

            System.out.println(arg + "OK");

        };

        consumer1.accept("TestConsumerAccept - ");

        Consumer< String > consumer2 = (x) -> {

            System.out.println(x + "OK!!!");

        };

        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");


     //supplier interface

        System.out.println("Test Supplier interface example");

        List<String> names = new ArrayList<String>();
        names.add("Kushal");
        names.add("Sarthak");
        names.add("Jitender");

        names.stream().forEach((item)-> {
            printNames(()-> item);
        });


       //predicate interface
        Predicate<Integer> greaterthan = i -> (i > 20);

        System.out.println(greaterthan.test(10));

        //Function functional interface
          int incr = 20;
          int myNumber = 10;
          modifyTheValue(myNumber, val-> val + incr);
    } 

    static void modifyTheValue(int valueToBeOperated, 
               Function<Integer, Integer> function){
    int newValue = function.apply(valueToBeOperated);
    System.out.println(newValue);
    }

    private static void printNames(Supplier<String> supplier) {

        System.out.println(supplier.get());

    }
 
}

