package com.enviro.assessment.grad001.KhethukuthulaSimamane.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This is a Disposal Guidelines model class
 * It allows you to create Disposal Guideline objects
 * It consists of 4 attributes
 **/
@Entity
@Data
@Table(name = "disposal_guidelines")
@NoArgsConstructor
@AllArgsConstructor
public class DisposalGuidelines {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "waste_id", nullable = false)
    private WasteCategory waste;

    @NotNull
    @Column(name = "disposal_tips")
    private String disposalSteps;

    @NotNull
    @Column(name = "guide_description")
    private String guideDescriptions;
}
