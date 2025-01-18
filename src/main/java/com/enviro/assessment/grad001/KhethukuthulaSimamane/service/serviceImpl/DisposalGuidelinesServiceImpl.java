package com.enviro.assessment.grad001.KhethukuthulaSimamane.service.serviceImpl;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling.ResourceNotFoundException;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.DisposalGuidelinesRepository;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.service.DisposalGuidelinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service implementation for managing DisposalGuidelines.
 */
@Service
public class DisposalGuidelinesServiceImpl implements DisposalGuidelinesService {

    @Autowired
    private DisposalGuidelinesRepository repository;

    @Override
    public List<DisposalGuidelines> findAll() {
        return repository.findAll();
    }

    @Override
    public DisposalGuidelines findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("DisposalGuideline not found with id " + id));
    }

    @Override
    public DisposalGuidelines save(DisposalGuidelines guideline) {
        return repository.save(guideline);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
