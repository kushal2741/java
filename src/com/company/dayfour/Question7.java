package com.company.dayfour;

import java.util.Stack;

public class Question7 {

    public static void main(String[] args) {

        SpStack s = new SpStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}

class SpStack extends Stack<Integer>{

   Stack<Integer> val = new Stack<>();

    @Override
    public Integer pop() {
        int x = super.pop();
        val.pop();
        return x;

    }

    int getMin(){

        int x = val.pop();
        val.push(x);
        return x;
    }

    void push (int x){
        if(isEmpty() == true) {
            super.push(x);
            val.push(x);
        }
        else{

            super.push(x);
            int y = val.pop();
            val.push(y);
            if(x < y)
                val.push(x);
            else
                val.push(y);
        }
    }




}



