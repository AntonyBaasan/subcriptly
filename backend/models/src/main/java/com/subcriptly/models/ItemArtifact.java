package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ItemArtifact {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private String location;
}
