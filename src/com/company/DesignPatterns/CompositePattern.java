package com.company.DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {

    public static void main(String[] args) {

        Electrical electrical = new Electrical(1001,"Kushal");
        Electronics electronics = new Electronics(1300,"Abhishek");
        CompanyDir companyDir = new CompanyDir();
        companyDir.addEmployee(electrical);
        companyDir.addEmployee(electronics);
        companyDir.showEmployeeDetails();
    }
}

interface Employee
{
    public void showEmployeeDetails();


}

class Electrical implements Employee{

    private String name;
    private long empId;
    private String department;

    public Electrical(long empid,String name){

      this.department = "Electrical";
      this.name = name;
      this.empId = empid;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("employee id is :" + empId + " ,name is :" + name + ", Department is " + department);
    }
}

class Electronics implements Employee{

    private String name;
    private long empId;
    private String department;

    public Electronics(long empid,String name){

        this.department = "Electronics";
        this.name = name;
        this.empId = empid;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("employee id is :" + empId + " ,name is :" + name + " department is " + department);
    }

}

class CompanyDir implements Employee {

    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {

        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}

