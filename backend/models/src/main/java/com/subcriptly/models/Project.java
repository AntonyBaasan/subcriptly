package com.subcriptly.models;

import lombok.Getter;
import lombok.Setter;

public class Project {
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String description;

   public String getTestValue() {
       return "AntonyBaasan";
   }
}
