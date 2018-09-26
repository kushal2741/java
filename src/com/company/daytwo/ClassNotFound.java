package com.company.daytwo;

public class ClassNotFound {

    public static void main(String args[]) {

        try {
            Class.forName("Testclass");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}

