package org.example;
import java.time.LocalTime;

public class WelcomeMessage {
    public String generateMessage(String name) {
        if (LocalTime.now().getHour() < 12) {
            return "Good morning, " + name + ", Welcome to COMP367";
        } else {
            return "Good afternoon, " + name + ", Welcome to COMP367";
        }
    }
}
