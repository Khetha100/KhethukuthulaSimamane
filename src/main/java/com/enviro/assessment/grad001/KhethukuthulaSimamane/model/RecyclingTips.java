package com.enviro.assessment.grad001.KhethukuthulaSimamane.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * This is a Recycling Tips model class
 * It allows you to create Recycling Tips objects
 * It consists of 4 attributes
 **/
@Entity
@Data
@Table(name = "recycle_tips")
@AllArgsConstructor
@NoArgsConstructor
public class RecyclingTips {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "waste_id", nullable = false)
    private WasteCategory waste;

    @Column(name = "recycling_tips")
    private String RecycleTipsInstructions;

    @NotNull
    @Column(name = "recycle_description")
    private String recycleDescriptions;
}
