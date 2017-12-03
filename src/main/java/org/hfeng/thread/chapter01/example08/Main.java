package org.hfeng.thread.chapter01.example08;

import org.hfeng.thread.chapter01.example06.Printer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("Nice!")).start();

        for (int i = 0; i < 10000; i++) {
            System.out.print("Good");
        }
    }
}
