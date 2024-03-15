package org.example;



import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        WelcomeMessage welcomeMessage = new WelcomeMessage();
        String message = welcomeMessage.generateMessage("Joseph Boglo"); // Replace "John" with the desired name
        System.out.println(message);
    }
}