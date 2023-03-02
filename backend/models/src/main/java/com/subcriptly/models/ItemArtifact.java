package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemArtifact {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private String name;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private String location;
}
