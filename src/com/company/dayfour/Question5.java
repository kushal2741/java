package com.company.dayfour;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question5 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

            Student st0 = new Student(2741, "Anmol", 4.5);
            Student st1 = new Student(2742, "Kamal", 8.5);
            Student st2 = new Student(2754, "Shalini", 9.5);
            studentList.add(st0);
            studentList.add(st1);
            studentList.add(st2);

        Collections.sort(studentList);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class Student implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Object o){
        Student s=(Student)o;
        if(cgpa==s.cgpa){
            if(fname.equals(s.fname)){
                return id-s.id;
            }else{
                return fname.compareTo(s.fname);
            }
        }else{
            if(s.cgpa-cgpa>0)
                return 1;
            else
                return -1;
        }
    }

}

