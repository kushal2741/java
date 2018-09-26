package com.company.daytwo;

public class SingletonC {

    public static void main(String[] args){
     testSingleton obj = testSingleton.getInstance();
     testSingleton obj2 = testSingleton.getInstance();
     System.out.println(obj.str);
     System.out.println(obj2.str);
    }
}

class testSingleton{

    private static testSingleton first_obj;
    public String str;
    private testSingleton(){

        str = "This is Singleton test class";

    }

    public static testSingleton getInstance(){

        if(first_obj==null){
            first_obj = new testSingleton();
        }

        return  first_obj;
    }
}
