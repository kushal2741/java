package com.company.daytwo;

public class Clonning {

    public static void main(String[] args) throws CloneNotSupportedException {
    //Clonable interface method
    Abc obj1 = new Abc(5,6);
    System.out.println(obj1.i + "and" + obj1.j);
    System.out.println(obj1.hashCode());
    Abc obj3 = obj1.clone();
    System.out.println(obj3.i + "and" + obj3.j);
    System.out.println(obj3.hashCode());

    //Copy constructor method
    Abc obj2 = new Abc(obj3);
    System.out.println(obj2.i + "and" + obj2.j);
    System.out.println(obj2.hashCode());
    }
}
class Abc implements Cloneable//step 1
{

    int i;
    int j;

Abc(int i,int j){
 this.i = i;
 this.j =j;
}

public String toString(){
    return "i ="+i+" and j=" + j;
}
public Abc clone() throws CloneNotSupportedException{
  return (Abc)super.clone();
}

Abc(Abc abc){
    System.out.println("Copy constructor called");
    //Deep copy
    i = abc.i;
    j = abc.j;
}
}
