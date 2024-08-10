package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class TimeoutLoopsTest {

    @Test
     void loop() {
        Assertions.assertTimeout(Duration.ofMillis(5),
                TimeoutLoops::loop);

    }
}
