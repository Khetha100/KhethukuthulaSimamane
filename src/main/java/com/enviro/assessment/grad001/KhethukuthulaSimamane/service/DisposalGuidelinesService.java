package com.enviro.assessment.grad001.KhethukuthulaSimamane.service;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.DisposalGuidelines;

import java.util.List;
import java.util.UUID;

/**
 * Service interface for managing DisposalGuidelines.
 */
public interface DisposalGuidelinesService {

    /**
     * Retrieves all disposal guidelines.
     *
     * @return a list of all disposal guidelines
     */
    List<DisposalGuidelines> findAll();

    /**
     * Retrieves a disposal guideline by its ID.
     *
     * @param id the ID of the disposal guideline to retrieve
     * @return the disposal guideline with the specified ID, or null if not found
     */
    DisposalGuidelines findById(UUID id);

    /**
     * Saves a disposal guideline.
     *
     * @param guideline the disposal guideline to save
     * @return the saved disposal guideline
     */
    DisposalGuidelines save(DisposalGuidelines guideline);

    /**
     * Deletes a disposal guideline by its ID.
     *
     * @param id the ID of the disposal guideline to delete
     */
    void delete(UUID id);
}
