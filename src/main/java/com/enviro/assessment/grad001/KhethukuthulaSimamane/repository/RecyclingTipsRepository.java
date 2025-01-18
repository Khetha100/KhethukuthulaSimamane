package com.enviro.assessment.grad001.KhethukuthulaSimamane.repository;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.RecyclingTips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for managing RecyclingTips entities.
 */
@Repository
public interface RecyclingTipsRepository extends JpaRepository<RecyclingTips, UUID> {
}
