package org.example.services;

public class TimeoutLoops {
    public static void loop() {
        long j=0;
        for (int i = 0; i < 1000000; i++) {
            j++;
        }
    }
}
