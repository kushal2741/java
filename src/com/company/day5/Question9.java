package com.company.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Question9 {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fout = new FileOutputStream("mfile.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(2741);
        pout.println("Hello KUSHAL");
        pout.close();
    }
    }
