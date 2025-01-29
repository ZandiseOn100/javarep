package com.enviro.assessment.grad001.zandisentiyane.exception;

// Custom exception class for handling cases where a requested resource is not found.
public class ResourceNotFoundException extends RuntimeException {

    // Constructor that accepts a custom error message.
    public ResourceNotFoundException(String message) {
        // Passes the message to the parent RuntimeException constructor.
        super(message);
    }
}
