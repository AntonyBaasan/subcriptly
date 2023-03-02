package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name="project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name="item_type_id")
    private ItemType itemType;

    @OneToOne(mappedBy = "item")
    private ItemArtifact itemArtifact;
}

