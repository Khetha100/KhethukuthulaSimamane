package com.enviro.assessment.grad001.KhethukuthulaSimamane.repository;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.WasteCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for managing WasteCategory entities.
 */
@Repository
public interface WasteCategoryRepository extends JpaRepository<WasteCategory, UUID> {

}