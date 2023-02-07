package com.subcriptly.models;

import lombok.Getter;

public class DebugInfo {
    @Getter
    private String version = "0.1";

    public String getOsName() {
        return System.getProperty("os.name");
    }
}
