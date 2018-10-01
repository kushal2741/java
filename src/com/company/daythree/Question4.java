package com.company.daythree;

public class Question4 {
    public static void main(String[] arg){
        App t = new App(1);
        t.start();
    }
}

class App extends Thread {
    int counter;

    public App(int counter) {
        this.counter = counter;
    }

    public void run() {
        if (counter < 10) {
            createThread(counter + 1);
        }
        System.out.println("Hello from Thread " + counter);
    }

    public void createThread(int counter) {
        App t = new App(counter);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}