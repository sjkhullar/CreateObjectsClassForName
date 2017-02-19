package org.learn;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Thread started :");
        int index = 0;
        while (index++ < 10) {
            System.out.println("Iteration "+ index);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Thread executed successfully");
    }

}