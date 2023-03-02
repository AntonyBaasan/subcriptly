package com.subcriptly.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Project {
    @Id
    private String id;

    private String name;

    private String description;
}
