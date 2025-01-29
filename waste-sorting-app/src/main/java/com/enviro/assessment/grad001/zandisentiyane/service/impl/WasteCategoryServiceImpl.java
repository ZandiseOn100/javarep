package com.enviro.assessment.grad001.zandisentiyane.service.impl;

import com.enviro.assessment.grad001.zandisentiyane.exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.zandisentiyane.model.WasteCategory;
import com.enviro.assessment.grad001.zandisentiyane.repository.WasteCategoryRepository;
import com.enviro.assessment.grad001.zandisentiyane.service.WasteCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This class provides the implementation of the WasteCategoryService interface, handling business logic.
@Service // Marks this class as a service bean for Spring's dependency injection.
public class WasteCategoryServiceImpl implements WasteCategoryService {

    private final WasteCategoryRepository repository;

    // Constructor to inject the WasteCategoryRepository dependency.
    public WasteCategoryServiceImpl(WasteCategoryRepository repository) {
        this.repository = repository;
    }

    // Fetches all waste categories from the repository (database).
    @Override
    public List<WasteCategory> getAllCategories() {
        // Calls the repository to find and return all WasteCategory records.
        return repository.findAll();
    }

    // Fetches a specific waste category by its ID.
    @Override
    public WasteCategory getCategoryById(Long id) {
        // Attempts to find the category by ID. If not found, throws a ResourceNotFoundException.
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("WasteCategory with ID " + id + " not found"));
    }

    // Creates a new waste category and saves it to the repository (database).
    @Override
    public WasteCategory createCategory(WasteCategory wasteCategory) {
        // Saves the given WasteCategory object to the database and returns the saved instance.
        return repository.save(wasteCategory);
    }

    // Updates an existing waste category.
    @Override
    public WasteCategory updateCategory(Long id, WasteCategory wasteCategory) {
        // Checks if the category exists by its ID. If found, updates the category and saves it.
        Optional<WasteCategory> existingCategory = repository.findById(id);
        if (existingCategory.isPresent()) {
            wasteCategory.setId(id); // Ensures the ID is set to the provided ID for the update.
            return repository.save(wasteCategory); // Saves the updated category and returns it.
        }
        // If the category does not exist, throws a ResourceNotFoundException.
        throw new ResourceNotFoundException("WasteCategory with ID " + id + " not found");
    }

    // Deletes a waste category by its ID.
    @Override
    public void deleteCategory(Long id) {
        // Checks if the category exists. If not, throws a ResourceNotFoundException.
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("WasteCategory with ID " + id + " not found");
        }
        // Deletes the category by ID from the repository (database).
        repository.deleteById(id);
    }
}
