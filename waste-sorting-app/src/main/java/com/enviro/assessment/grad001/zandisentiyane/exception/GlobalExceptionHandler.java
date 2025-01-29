package com.enviro.assessment.grad001.zandisentiyane.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

// This class handles exceptions globally for all controllers in the application.
@RestControllerAdvice // Marks the class as an exception handler for REST controllers.
public class GlobalExceptionHandler {

    // Handles ResourceNotFoundException. This exception typically indicates that a resource could not be found.
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
        // Returns a 404 NOT FOUND status and the exception's message as the response body.
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    // Handles ConstraintViolationException, which is thrown when bean validation fails (e.g., @NotBlank, @Size).
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List<String>> handleValidationExceptions(ConstraintViolationException ex) {
        // Collects all constraint violations (validation errors) and formats them into a list of error messages.
        List<String> errors = ex.getConstraintViolations().stream()
                .map(violation -> violation.getPropertyPath() + " " + violation.getMessage())
                .collect(Collectors.toList());
        // Returns a 400 BAD REQUEST status and the list of error messages.
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    // Handles any other generic exceptions that may occur.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        // Returns a 500 INTERNAL SERVER ERROR status and the exception's message as the response body.
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
