package com.subcriptly.restapi.controllers;

import com.subcriptly.models.DebugInfo;
import com.subcriptly.services.project.DebugService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "debug")
public class DebugController {

    private final DebugService debugService;

    public DebugController(DebugService debugService) {
        this.debugService = debugService;
    }

    @GetMapping("/version")
    public String getVersion(@RequestParam(name = "name", defaultValue = "World") String name) {
        return String.format("Version %s! %s", name, this.debugService.getOsVersion());
    }

    @GetMapping("")
    public DebugInfo getDebugInfo(@RequestParam(name = "name", defaultValue = "World") String name) {
        return this.debugService.getDebugInfo();
    }
}
