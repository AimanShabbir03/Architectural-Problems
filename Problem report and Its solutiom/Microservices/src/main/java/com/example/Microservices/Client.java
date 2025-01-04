/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.Microservices;

/**
 *
 * @author user
 */
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Call UserService
            System.out.println("Connecting to UserService...");
            URL userServiceUrl = new URL("http://localhost:8081/user/user123");
            HttpURLConnection userServiceConnection = (HttpURLConnection) userServiceUrl.openConnection();
            userServiceConnection.setRequestMethod("GET");
            Scanner userScanner = new Scanner(userServiceConnection.getInputStream());
            while (userScanner.hasNext()) {
                System.out.println(userScanner.nextLine());
            }
            userScanner.close();
            
            // Call StreamingService
            System.out.println("Connecting to StreamingService...");
            URL streamingServiceUrl = new URL("http://localhost:8082/stream/content456");
            HttpURLConnection streamingServiceConnection = (HttpURLConnection) streamingServiceUrl.openConnection();
            streamingServiceConnection.setRequestMethod("GET");
            Scanner streamingScanner = new Scanner(streamingServiceConnection.getInputStream());
            while (streamingScanner.hasNext()) {
                System.out.println(streamingScanner.nextLine());
            }
            streamingScanner.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

