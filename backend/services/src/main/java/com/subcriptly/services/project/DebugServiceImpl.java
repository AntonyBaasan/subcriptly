package com.subcriptly.services.project;

import com.subcriptly.models.DebugInfo;
import org.springframework.stereotype.Service;

@Service
public class DebugServiceImpl implements DebugService {

    private DebugInfo debugInfo;

    public DebugServiceImpl(){
        debugInfo = new DebugInfo();
    }

    public DebugInfo getDebugInfo() {
        return debugInfo;
    }

    public String getOsVersion() {
        return debugInfo.getOsName();
    }
}
