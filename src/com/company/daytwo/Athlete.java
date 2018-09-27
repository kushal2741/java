package com.company.daytwo;

import javax.swing.text.html.HTMLDocument;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Athlete implements Comparable<Athlete> {
    String name;
    String sport;
    String country;
    int world_rank;
    List<String> medals;

    public Athlete(String name,String sport,String country,int world_rank,List<String> medals){
    this.name = name;
    this.sport = sport;
    this.country = country;
    this.world_rank = world_rank;
    this.medals = medals;
    }

    @Override
    public int compareTo(Athlete athlete) {
        return this.world_rank - athlete.world_rank;
    }

    public static void main(String args[]) throws ParseException {
//Date program
        String d1 = "27/09/2018";
        SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy");
        //d2.format(d2.parse(d1));
        System.out.println(d2.format(d2.parse(d1)));



        //sorting function
    List <String> medals = new ArrayList<>();
    medals.add("gold");
    medals.add("silver");
    medals.add("bromze");
    List<Athlete> obj = new LinkedList<>();
    obj.add(new Athlete("Kushal","Hockey","India",2,medals));
    obj.add(new Athlete("Kushal","Hockey","India",1,medals));
    obj.add(new Athlete("Kushal","Hockey","India",9,medals));
    Collections.sort(obj);
    Iterator<Athlete> itr = obj.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next().world_rank);


    }

    }
}
