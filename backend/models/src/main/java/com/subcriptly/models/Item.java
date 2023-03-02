package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Item {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @ManyToOne
    @JoinColumn(name="project_id")
    @Getter
    @Setter
    private Project project;

    @OneToMany
    @JoinColumn(name="item_type_id")
    @Getter
    @Setter
    private ItemType itemType;

}

