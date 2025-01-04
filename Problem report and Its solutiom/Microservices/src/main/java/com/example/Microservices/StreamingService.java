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

public class StreamingService {
    public static void main(String[] args) {
        port(8082); // Set the port for the service
        get("/stream/:contentId", (req, res) -> {
            String contentId = req.params(":contentId");
            return "Streaming content: " + contentId;
        });
    }
}
