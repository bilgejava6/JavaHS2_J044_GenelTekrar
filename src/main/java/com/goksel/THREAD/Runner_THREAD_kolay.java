package com.goksel.THREAD;


class MerhabaThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Merhaba Dünya!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runner_THREAD_kolay {

    public static void main(String[] args) {
        MerhabaThread thread1 = new MerhabaThread();
        thread1.start();
    }
}