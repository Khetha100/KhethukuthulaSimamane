package com.enviro.assessment.grad001.KhethukuthulaSimamane.service.serviceImpl;

import com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling.ResourceNotFoundException;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.RecyclingTips;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.repository.RecyclingTipsRepository;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.service.RecyclingTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Service implementation for managing RecyclingTips.
 */
@Service
public class RecyclingTipsServiceImpl implements RecyclingTipsService {

    @Autowired
    private RecyclingTipsRepository repository;

    @Override
    public List<RecyclingTips> findAll() {
        return repository.findAll();
    }

    @Override
    public RecyclingTips findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RecyclingTip not found with id " + id));
    }

    @Override
    public RecyclingTips save(RecyclingTips tip) {
        return repository.save(tip);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
