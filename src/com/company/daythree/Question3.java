package com.company.daythree;

public class Question3 {

    static Object monitor = new Object();

    static boolean one = true;
    static boolean two = false;
    static boolean three = false;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new SequenceDisplayImpl(1));
        Thread thread2 = new Thread(new SequenceDisplayImpl(2));
        Thread thread3 = new Thread(new SequenceDisplayImpl(3));
        thread1.start();
        thread2.start();
        thread3.start();

    }

    static class SequenceDisplayImpl implements Runnable {

        int threadId;

        SequenceDisplayImpl(int threadId) {
            this.threadId = threadId;
        }

        public void run() {
            print();
        }

        private void print() {
            try {
                while (true) {
                    Thread.sleep(500);
                    synchronized (monitor) {
                        if (1 == threadId) {
                            if (!one) {
                                monitor.wait();
                            } else {
                                System.out.print(threadId + " ");
                                one = false;
                                two = true;
                                three = false;
                                monitor.notifyAll();
                            }
                        }
                        if (2 == threadId) {
                            if (!two) {
                                monitor.wait();
                            } else {
                                System.out.print(threadId + " ");
                                one = false;
                                two = false;
                                three = true;
                                monitor.notifyAll();
                            }
                        }
                        if (3 == threadId) {
                            if (!three) {
                                monitor.wait();
                            } else {
                                System.out.print(threadId + " ");
                                one = true;
                                two = false;
                                three = false;
                                monitor.notifyAll();
                            }
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}