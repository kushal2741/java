package com.company.DesignPatterns;

public class Singleton {

    public static void main(String[] args) {
    System.out.println(Company.getSingletonInstance());
    System.out.println(Company.getSingletonInstance());
    }
}

class Company {
    String name;
    String address;
    static Company singletoninstance;

    //Private Constructor
    private Company(){

        this.address = "Sec 127,Logix Techno park,Tower B";
        this.name = "To the New";
    }
    //Use of static function
    static Company getSingletonInstance(){

        if(singletoninstance==null){
            singletoninstance = new Company();
        }
    return singletoninstance;
    }

    //tostring override
    @Override
    public String toString() {
        return "name:"+ name + " and adrress: " + address;
    }
}
