package com.enviro.assessment.grad001.zandisentiyane.service;

import com.enviro.assessment.grad001.zandisentiyane.model.WasteCategory;

import java.util.List;

// This interface defines the contract for services related to WasteCategory operations.
public interface WasteCategoryService {

    // Retrieves all waste categories from the system.
    List<WasteCategory> getAllCategories();

    // Retrieves a specific waste category by its ID.
    WasteCategory getCategoryById(Long id);

    // Creates a new waste category in the system.
    WasteCategory createCategory(WasteCategory wasteCategory);

    // Updates an existing waste category identified by its ID.
    WasteCategory updateCategory(Long id, WasteCategory wasteCategory);

    // Deletes a waste category by its ID.
    void deleteCategory(Long id);
}
