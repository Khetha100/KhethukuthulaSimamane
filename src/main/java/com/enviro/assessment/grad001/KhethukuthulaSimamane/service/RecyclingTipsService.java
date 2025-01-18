package com.enviro.assessment.grad001.KhethukuthulaSimamane.service;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.RecyclingTips;

import java.util.List;
import java.util.UUID;

/**
 * Service interface for managing RecyclingTips.
 */
public interface RecyclingTipsService {

    /**
     * Retrieves all recycling tips.
     *
     * @return a list of all recycling tips
     */
    List<RecyclingTips> findAll();

    /**
     * Retrieves a recycling tip by its ID.
     *
     * @param id the ID of the recycling tip to retrieve
     * @return the recycling tip with the specified ID, or null if not found
     */
    RecyclingTips findById(UUID id);

    /**
     * Saves a disposal guideline.
     *
     * @param tip the recycling tip to save
     * @return the saved recycling tip
     */
    RecyclingTips save(RecyclingTips tip);

    /**
     * Deletes a recycling tip by its ID.
     *
     * @param id the ID of the recycling tip to delete
     */
    void delete(UUID id);
}
