package com.company.dayone;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Main obj1 = new Main();

        System.out.println("<<<<<------Program to replace a substring in a string--->>>>");
        System.out.println(obj1.getSubstring("I am a Indian citizen", "Indian", "American"));

        System.out.println("<<<<<------Program to getDuplicate Occurrences--->>>>>");

        obj1.getDuplicateOcuurences("He is vegetarian and hates non vegetarian food");

        System.out.println("<<<<<------Program to find occurences of a character in a string--->>>>>");
        obj1.getOcuurencesOfCharacter("He is vegetarian and hates non vegetarian food", "a");

        System.out.println("<<<<<------Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String--->>>>>>");
        obj1.getNumberPercentage("@100Km/hour");

        System.out.println("<<<<<------Find common elements between two arrays-->>>>>");
        int[] s1 = {2,3,4,5,7,7,5};

        int[] s2 = {1,6,4,5,2,3,6,5};
        obj1.getCoomonElements(s1,s2 );

        System.out.println("<<<<<------There is an array with every element repeated twice except one---->>>>>>>");

        int [] s3 = {1,2,3,4,5,6,1,2,3,4,5,6,8};
        //obj1.getSingleElement(s3);
        System.out.println("The element without duplicacy is " + obj1.getSingleElement(s3));

        //Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
        //using static block
        Teststatic objstatic = new Teststatic();

        //using static method
        Teststatic.teststatic();

        //using static variable
        System.out.println("Print Data using static variables");
        System.out.println("Firstname is " + Teststatic.firstname);
        System.out.println("Firstname is " + Teststatic.lastname);
        System.out.println("Firstname is " + Teststatic.age);

        System.out.println("<<<<<------Reverse string program--->>>>>");

        obj1.reverseString("This is reverse string program");


        System.out.println("<<<<<------enum initialize constructor & getPrice() method (Example display house & their prices----->>>>>>>>>");

        System.out.println("All house prices:");
        for (House h : House.values()) System.out.println(
                h + " costs " + h.getPrice() + " thousand dollars.");

        System.out.println("<<<<<------Write a single program for following operation using overloading------>>>>>>>>>");

        Math math = new Math();
        //addition of integer values
        math.compute(4,5);
        //addition of boolean values
        math.compute(3.5,5.6);
        //multiplication of 2 float numbers
        math.multiply(10.11f,2.5f);
        //multiplication of 2 int numbers
        math.multiply(10,2);
        //concatenate 2 strings
        math.concatenate("My name is ","Kushal");
        //concatenate 3 strings
        math.concatenate("My name is ","Kushal ","and I am working in To The New");

        System.out.println("<<<<<------Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks---->>>>>");
        SBI sbi = new SBI();
        sbi.getDetails();
        BOI boi = new BOI();
        boi.getDetails();
        ICICI icici = new ICICI();
        icici.getDetails();
    }


    public String getSubstring(String oldStr, String pattern, String replaceString) {
        return oldStr.replaceAll(pattern, replaceString);
    }

    public void getDuplicateOcuurences(String string) {

        String[] words = string.split(" ");
        int wordc = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                  wordc=wordc+1;
                  words[j]="0";
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + wordc);
            wordc = 1;
        }
    }

    public void getOcuurencesOfCharacter(String charstr, String chartocount) {

        int charstrlength = charstr.length();
        int withoutchar = charstr.replaceAll(chartocount, "").length();
        int characterlength = charstrlength - withoutchar;
        System.out.println("character length count is " + characterlength);
    }

    public void getNumberPercentage(String charstr) {

        int charStringLength = charstr.length();
        int lowercase = 0;
        int upperCase = 0;
        int digit = 0;
        int specialchars = 0;
        for (int i = 0; i < charstr.length(); i++) {

            char strch = charstr.charAt(i);
            if (Character.isLowerCase(strch)) {
                lowercase++;
            } else if (Character.isUpperCase(strch)) {
                upperCase++;
            } else if (Character.isDigit(strch)) {
                digit++;
            } else {
                specialchars++;
            }


        }
        Float specialPercentage = (float) specialchars / charStringLength * 100;
        Float lowercasePercentage = (float) lowercase / charStringLength * 100;
        Float uppercasePercentage = (float) upperCase / charStringLength * 100;
        Float digitPercentage = (float)  digit / charStringLength * 100;

        System.out.println("Total count is " + charStringLength);
        System.out.println("Uppercase letters count" + upperCase);
        System.out.println("Lowercase letters count" + lowercase);
        System.out.println("Digit Count is " + digit);
        System.out.println("Special character Count is " + specialchars);
        System.out.println("special character Percentage is " + specialPercentage);
        System.out.println("lowercasePercentage is " + lowercasePercentage);
        System.out.println("uppercasePercentage is " + uppercasePercentage);
        System.out.println("digitPercentage is " + digitPercentage);

    }

    public void getCoomonElements(int [] s1,int [] s2) {
           int [] arr1 = unique_array(s1);
           int [] arr2 = unique_array(s2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element is : " + arr1[i]);
                }

            }
        }
    }

    static int[] unique_array(int[] my_array){

      int no_unique_elements = my_array.length;
      for (int i = 0; i < no_unique_elements; i++) {
          for (int j = i+1; j < no_unique_elements; j++){
              if(my_array[i] == my_array[j]){
                   my_array[j] = my_array[no_unique_elements-1];
                   no_unique_elements--;
                   j--;
              }
          }
      }
      int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
      return array1;
    }

    public int getSingleElement(int [] arraynum){
        int nondub = arraynum[0];
        int arraynumlength = arraynum.length;
        for(int i = 1; i < arraynumlength; i++)
           nondub = nondub ^ arraynum[i];
           return nondub;
    }

    public void reverseString(String string){

        String[] words = string.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";


        }
        System.out.println("Main string is :" +string);
        System.out.println("Reveresed string is :" +reversedString);

        StringBuffer bufflist = new StringBuffer(reversedString);
        System.out.println("bufferlist = " + bufflist);

        // deleting character from index 4 to index 9
        bufflist.delete(4, 9);
        System.out.println("Bufferlist after deletion of characters from index 4 and 9 = " + bufflist);



    }



}

class Teststatic {

        static String firstname;
        static String lastname;
        static int age;
        static {

            firstname = "Amit";
            lastname  = "Kumar";
            age = 20;
            System.out.println("Printing the data using the static block");
            System.out.println("The firstname is " +firstname);
            System.out.println("The lastname is " +lastname);
            System.out.println("The age is " +age);


    }

    static void teststatic(){
        System.out.println("Printing the data using the static method");
        System.out.println("The firstname is " +firstname);
        System.out.println("The lastname is " +lastname);
        System.out.println("The age is " +age);

    }

}

enum House {
    houseA(900),houseB(2),housecC(50),houseD(15),houseF(12);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}

class Math{

    public void compute(int a,int b){
     int sum = a + b;
     System.out.println("The sum of two numbers is: " + sum);
    }

    public void compute(double c,double d){
        double sum = c + d;
        System.out.println("The sum of two numbers is: " + sum);
    }

    public void multiply(float e,float f){

        float mul = e*f;
        System.out.println("The multiplication of two boolean numbers is: " + mul);
    }

    public void multiply(int a,int b){

        int mul = a*b;
        System.out.println("The multiplication of two integer numbers is: " + mul);
    }

    public void concatenate(String str1,String str2){

      System.out.println("Concatenation of two strings is " + str1 + str2);
    }

    public void concatenate(String str1,String str2,String str3){

        System.out.println("Concatenation of three strings is " + str1 + str2 + str3);
    }
}

abstract class Bank{
    abstract public void getDetails();

}

class SBI extends Bank{

public void getDetails(){
 System.out.println("The rate of interest of SBI BANK for Home loan is 8%");
}
}

class BOI extends Bank{
    public void getDetails(){
        System.out.println("The rate of interest of BOI BANK for Home loan is 10%");
    }
}
class ICICI extends Bank{
    public void getDetails(){
        System.out.println("The rate of interest of ICICI BANK for Home loan is 15%");
    }
}


