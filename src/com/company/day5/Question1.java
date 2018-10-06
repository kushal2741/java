package com.company.day5;

public class Question1 {

    public static void main(String[] args) {
        Calculation calculation = (a,b) -> a > b;

        System.out.println(calculation.checkGreater(17,16));

        Increment increment = (a) -> a + 1;

        System.out.println(increment.increment(12));
        
        Concatenate concatenate = (a,b) -> a + b;

        System.out.println(concatenate.concatenate("My name is ","Kushal"));

        Uppercase uppercase = (a) -> a.toUpperCase();

        System.out.println(uppercase.uppercase("my name is kushal"));

    }
}
@FunctionalInterface
interface Calculation{

    boolean checkGreater(int a,int b);
}
@FunctionalInterface
interface Increment{

    int increment (int a);
}
@FunctionalInterface
interface Concatenate{

    String concatenate (String a,String b);
}
@FunctionalInterface
interface Uppercase{

    String uppercase (String a);
}
