package com.enviro.assessment.grad001.KhethukuthulaSimamane.model;




import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


/**
 * This is a Waste Category model class
 * It allows you to create Waste Category objects
 * It consists of 6 attributes
 **/
@Entity
@Data
@Table(name = "waste_category")
@AllArgsConstructor
@NoArgsConstructor
public class WasteCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @Column(name = "name_of_waste_category")
    private String nameOfWasteCategory;

    @NotNull
    @Column(name = "disposable")
    private boolean disposable;

    @NotNull
    @Column(name = "recyclable")
    private boolean recyclable;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "container_type")
    private String container;

}

