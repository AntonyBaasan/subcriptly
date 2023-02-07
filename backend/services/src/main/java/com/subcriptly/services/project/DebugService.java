package com.subcriptly.services.project;

import com.subcriptly.models.DebugInfo;

public interface DebugService {
    public DebugInfo getDebugInfo();

    public String getOsVersion();
}
