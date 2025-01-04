/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Microservices;

/**
 *
 * @author user
 */
import static spark.Spark.*;

public class UserService {
    public static void main(String[] args) {
        port(8081); // Set the port for the service
        get("/user/:userId", (req, res) -> {
            String userId = req.params(":userId");
            return "User details for: " + userId;
        });
    }
}

