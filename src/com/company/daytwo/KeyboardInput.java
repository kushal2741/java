package com.company.daytwo;
import java.util.*;
public class KeyboardInput {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        String userInput;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            userInput = scanner.next();
            if (userInput.equals("done")) {
                break;
            } else {
              char firstcharacter =  userInput.charAt(0);
              char lastcharacter  =  userInput.charAt(userInput.length()-1);
              if(firstcharacter== lastcharacter){
                  System.out.println("First and last characters of " +userInput+ " are matching");
              }
              else{
                  System.out.println("First and last characters of " +userInput+ " are not matching");
              }
            }
        }
        scanner.close();
    }

}
