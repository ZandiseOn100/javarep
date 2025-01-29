package com.enviro.assessment.grad001.zandisentiyane.controller;

import com.enviro.assessment.grad001.zandisentiyane.exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.zandisentiyane.model.WasteCategory;
import com.enviro.assessment.grad001.zandisentiyane.service.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// This is the controller class that handles HTTP requests related to WasteCategory entities.
@RestController
@RequestMapping("/api/waste-categories") // Base URL mapping for all methods in this controller.
public class WasteCategoryController {

    private final WasteCategoryService service;

    // Constructor for injecting the WasteCategoryService dependency.
    public WasteCategoryController(WasteCategoryService service) {
        this.service = service;
    }

    // Endpoint to retrieve all waste categories.
    @GetMapping
    public List<WasteCategory> getAllCategories() {
        // Calls the service layer to get all waste categories and returns them.
        return service.getAllCategories();
    }

    // Endpoint to retrieve a specific waste category by its ID.
    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        try {
            // Attempts to get the category by ID from the service.
            WasteCategory category = service.getCategoryById(id);
            return ResponseEntity.ok(category); // Returns the category in a 200 OK response.
        } catch (ResourceNotFoundException ex) {
            // If the category is not found, it catches the exception and returns a 404 Not Found response.
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to create a new waste category.
    @PostMapping
    public WasteCategory createCategory(@Valid @RequestBody WasteCategory wasteCategory) {
        // Validates the incoming wasteCategory object and passes it to the service layer to create the new category.
        return service.createCategory(wasteCategory);
    }

    // Endpoint to update an existing waste category.
    @PutMapping("/{id}")
    public ResponseEntity<WasteCategory> updateCategory(
            @PathVariable Long id, @Valid @RequestBody WasteCategory wasteCategory) {
        try {
            // Tries to update the category with the specified ID using the provided data.
            WasteCategory updatedCategory = service.updateCategory(id, wasteCategory);
            return ResponseEntity.ok(updatedCategory); // Returns the updated category with a 200 OK response.
        } catch (ResourceNotFoundException ex) {
            // If the category to be updated is not found, return a 404 Not Found response.
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to delete a waste category by ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        try {
            // Calls the service to delete the category with the given ID.
            service.deleteCategory(id);
            return ResponseEntity.noContent().build(); // Returns a 204 No Content response, indicating successful deletion.
        } catch (ResourceNotFoundException ex) {
            // If the category to be deleted does not exist, return a 404 Not Found response.
            return ResponseEntity.notFound().build();
        }
    }
}
