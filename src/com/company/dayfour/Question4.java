package com.company.dayfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Question4 {

    public static void main(String[] args) {
      List<Employee> emp = new ArrayList<>();
      emp.add(new Employee(24.5,10000,"Praveen"));
      emp.add(new Employee(27.5,15000,"Rahul"));
      emp.add(new Employee(25.5,19000,"Shalini"));
      Collections.sort(emp);
        Iterator<Employee> itr = emp.iterator();
        //Sort By Salary;
        while(itr.hasNext()){
            System.out.println(itr.next().Salary);


        }
    }
}


class Employee implements Comparable<Employee> {
    Double Age;
    int Salary;
    String Name;

    public Employee(Double Age,int Salary,String Name){

        this.Age = Age;
        this.Salary = Salary;
        this.Name = Name;

    }

    @Override
    public int compareTo(Employee employee) {
        return this.Salary-employee.Salary;
    }
}