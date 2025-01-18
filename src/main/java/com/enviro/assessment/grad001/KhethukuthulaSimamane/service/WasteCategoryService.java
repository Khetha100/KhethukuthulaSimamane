package com.enviro.assessment.grad001.KhethukuthulaSimamane.service;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.WasteCategory;

import java.util.List;
import java.util.UUID;

/**
 * Service interface for managing WasteCategory.
 */
public interface WasteCategoryService {

    /**
     * Retrieves all waste categories.
     *
     * @return a list of all waste categories
     */
    List<WasteCategory> findAll();

    /**
     * Retrieves a waste category by its ID.
     *
     * @param id the ID of the waste category to retrieve
     * @return the waste category with the specified ID, or null if not found
     */
    WasteCategory findById(UUID id);

    /**
     * Saves a waste category.
     *
     * @param category the waste category to save
     * @return the saved waste category
     */
    WasteCategory save(WasteCategory category);

    /**
     * Deletes a waste category by its ID.
     *
     * @param id the ID of the waste category to delete
     */
    void delete(UUID id);
}
