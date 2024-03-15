package org.example;
import java.time.LocalTime;

public class WelcomeMessage {
    public String generateMessage(String name) {
        String greeting;
        if (LocalTime.now().isBefore(LocalTime.NOON)) {
            greeting = "Good morning, " + name + ", Welcome to COMP367";
        } else {
            greeting = "Good afternoon, " + name + ", Welcome to COMP367";
        }
        return greeting;
    }
}
