package com.company.DesignPatterns;

public class BuilderClass {
    public static void main(String[] args) {

        Student student = new StudentBuilder().setName("kushal").setRoll(2741).setStandard("12").hasOptedForScholarShip(true).build();
        System.out.println(student);
    }

}

class Student{

    private String name;
    private Integer roll;
    private String  standard;
    private boolean optedForScholarShip;

    public Student(StudentBuilder studentbuilder){
        name = studentbuilder.getName();
        roll = studentbuilder.getRoll();
        standard = studentbuilder.getStandard();
        optedForScholarShip = studentbuilder.isOptedForScholarShip();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setOptedForScholarShip(boolean optedForScholarShip) {
        this.optedForScholarShip = optedForScholarShip;
    }

    public boolean isOptedForScholarShip() {
        return optedForScholarShip;
    }

    @Override
    public String toString() {
        return "Student name is :" + name + ",roll no is : " + roll + " ,studing in class :" +standard+ " and scholarshipship status is: "+optedForScholarShip;
    }
}
//BuilderClass
class StudentBuilder{

    private String name;
    private Integer roll;
    private String  standard;
    private boolean optedForScholarShip;


    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRoll() {
        return roll;
    }

    public StudentBuilder setRoll(Integer roll) {
        this.roll = roll;
        return this;
    }

    public String getStandard() {
        return standard;
    }

    public StudentBuilder setStandard(String standard) {
        this.standard = standard;
        return this;

    }

    public StudentBuilder hasOptedForScholarShip(boolean optedForScholarShip) {
        this.optedForScholarShip = optedForScholarShip;
        return this;
    }

    public boolean isOptedForScholarShip() {
        return optedForScholarShip;
    }

    public Student build(){

      return new Student(this);
    }
}
