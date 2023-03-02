package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ItemArtifact {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @Getter
    @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @Getter
    @Setter
    private String location;
}
