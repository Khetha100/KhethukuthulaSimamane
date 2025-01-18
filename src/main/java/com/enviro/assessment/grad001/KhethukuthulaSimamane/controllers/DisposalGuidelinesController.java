package com.enviro.assessment.grad001.KhethukuthulaSimamane.controllers;


import com.enviro.assessment.grad001.KhethukuthulaSimamane.errorHandling.ResourceNotFoundException;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.model.DisposalGuidelines;
import com.enviro.assessment.grad001.KhethukuthulaSimamane.service.DisposalGuidelinesService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * This is a Disposal Guidelines Controller class
 * It handles all /api/disposal endpoints
 * It consists of 5 endpoint methods in total
 */
@RestController
@RequestMapping("/api/disposal")
public class DisposalGuidelinesController {

    @Autowired
    private DisposalGuidelinesService disposalGuidelinesService;


    // This method get all the Disposal guidelines for you in  list format
    @GetMapping
    public ResponseEntity<List<DisposalGuidelines>> getAllDisposalGuidelines() {
        List<DisposalGuidelines> guidelines = disposalGuidelinesService.findAll();
        return ResponseEntity.ok(guidelines);
    }

    // This method get for you a single disposal guideline by id
    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> getDisposalGuidelineById(@Valid @PathVariable UUID id) {
        DisposalGuidelines guideline = disposalGuidelinesService.findById(id);
        return ResponseEntity.ok(guideline);
    }

    // This method lets you post disposal guideline
    @PostMapping
    public ResponseEntity<DisposalGuidelines> createDisposalGuideline(@Valid @RequestBody DisposalGuidelines guideline) {
        DisposalGuidelines createdGuideline = disposalGuidelinesService.save(guideline);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGuideline);
    }

    // This method let you update a specific disposal guideline using id
    @PutMapping("/{id}")
    public ResponseEntity<DisposalGuidelines> updateDisposalGuideline(@Valid @PathVariable UUID id, @Valid @RequestBody DisposalGuidelines guideline) {
        guideline.setId(id);
        DisposalGuidelines updatedGuideline = disposalGuidelinesService.save(guideline);
        return ResponseEntity.ok(updatedGuideline);
    }

    // This method let you delete a specific disposal guideline using id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisposalGuideline(@Valid @PathVariable UUID id) {
        disposalGuidelinesService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
