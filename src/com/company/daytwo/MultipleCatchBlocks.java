package com.company.daytwo;
//Program for multipe catch and final
public class MultipleCatchBlocks {
    public static void main(String args[])
    {
        int marks[ ] = { 76, 57, 83, 46, 38 };
        System.out.println("One");

        try
        {
            System.out.println(marks[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Some problem: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Some problem: " + e);
        }
        finally
        {
            System.out.println("two");
        }
        System.out.println("three");
    }
}
