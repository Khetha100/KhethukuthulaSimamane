package com.enviro.assessment.grad001.KhethukuthulaSimamane.repository;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.DisposalGuidelines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository interface for managing DisposalGuidelines entities.
 */
@Repository
public interface DisposalGuidelinesRepository extends JpaRepository<DisposalGuidelines, UUID> {
}
