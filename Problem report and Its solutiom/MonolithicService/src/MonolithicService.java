/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
// MonolithicService.java
public class MonolithicService {
    public void handleUserRequest(String userId) {
        System.out.println("Fetching user details for: " + userId);
        // Handle user authentication, profile, etc.
    }

    public void handleStreamingRequest(String contentId) {
        System.out.println("Streaming content: " + contentId);
        // Handle content streaming logic
    }

    public static void main(String[] args) {
        MonolithicService service = new MonolithicService();
        service.handleUserRequest("user123");
        service.handleStreamingRequest("content456");
    }
}

