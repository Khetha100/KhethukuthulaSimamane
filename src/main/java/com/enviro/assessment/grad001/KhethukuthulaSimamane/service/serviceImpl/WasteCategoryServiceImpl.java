package com.enviro.assessment.grad001.KhethukuthulaSimamane.service.serviceImpl;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling.ResourceNotFoundException;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.WasteCategory;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.WasteCategoryRepository;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service implementation for managing WasteCategory.
 */
@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {

    @Autowired
    private WasteCategoryRepository repository;

    @Override
    public List<WasteCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public WasteCategory findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("WasteCategory not found with id " + id));
    }

    @Override
    public WasteCategory save(WasteCategory category) {
        return repository.save(category);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
