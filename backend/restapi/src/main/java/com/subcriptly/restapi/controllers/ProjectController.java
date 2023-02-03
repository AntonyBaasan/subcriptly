package com.subcriptly.restapi.controllers;

import com.subcriptly.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("project")
@RequestMapping(value = "project")
public class ProjectController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        var env = new Project();
        return String.format("Hello %s! %s", name, env.getTestValue());
    }
}
