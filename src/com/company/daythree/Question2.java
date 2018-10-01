package com.company.daythree;
import java.lang.*;

public class Question2 {
    public static void main(String args[])
    {
        new Prime().start();
        new notPrime().start();

    }

}

class notPrime extends Thread
{
    boolean isPrime = true;
    String primeNumbersFound = "";
    public void run()
    {
        try
        {
            for (int i = 1; i <= 20; i++) {
                isPrime = CheckPrime(i);
                if (isPrime) {
                    primeNumbersFound = primeNumbersFound + i + " ";

                }
                //System.out.println(i);
            }
            System.out.println(primeNumbersFound);
        }
        catch (Exception e){}
    }

    synchronized boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
}
class Prime extends Thread
{
    boolean isNonPrime = true;
    String nonPrimeNumbersFound = "";
    public void run()
    {
        try
        {
            for (int i = 1; i <= 20; i++) {
                isNonPrime = CheckNonPrime(i);
                if (isNonPrime) {
                    nonPrimeNumbersFound = nonPrimeNumbersFound + i + " ";

                }
               // System.out.println(i);
            }

        }
        catch (Exception e){}
    }

    synchronized boolean CheckNonPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return true;
            }
        }
        return false;

    }
}
