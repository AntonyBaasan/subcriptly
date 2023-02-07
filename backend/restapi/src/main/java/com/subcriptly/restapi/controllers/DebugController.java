package com.subcriptly.restapi.controllers;

import com.subcriptly.models.DebugInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "debug")
public class DebugController {

    @GetMapping("/version")
    public String getVersion(@RequestParam(name = "name", defaultValue = "World") String name) {
        var debugInfo = new DebugInfo();
        return String.format("Version %s! %s", name, debugInfo.getVersion());
    }

    @GetMapping("")
    public DebugInfo getDebugInfo(@RequestParam(name = "name", defaultValue = "World") String name) {
        return new DebugInfo();
    }
}
