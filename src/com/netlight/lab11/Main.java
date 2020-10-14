package com.netlight.lab11;

import java.util.ArrayList;

// ушел с пар, вы обещали зачесть посещение
// если сдам 11 лабу до 15/10/2020 00:00
public class Main {

    static int totalSum;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        System.out.println("10 operations");
        for (int i = 0; i < 10; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            System.out.println(t.getState());
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
        // result mul by 10 because of 10 threads
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 3, (int) Math.pow(9, 8));
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime - startTime));
    }

    private synchronized static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start - i) * 0.3;
            totalSum++;
        }
        return a;
    }
}