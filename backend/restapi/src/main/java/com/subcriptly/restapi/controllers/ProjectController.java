package com.subcriptly.restapi.controllers;

import com.subcriptly.models.Project;
import com.subcriptly.services.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("project")
@RequestMapping(value = "project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("")
    public List<Project> get() {
        var projects = projectService.getProjects();
        return projects.stream().toList();
    }

    @GetMapping("/{id}")
    public Project get(@PathVariable("id") String id) {
        var project = projectService.get(id);
        return project;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        var env = new Project();
        return String.format("Hello %s! %s", name, env.getTestValue());
    }
}
