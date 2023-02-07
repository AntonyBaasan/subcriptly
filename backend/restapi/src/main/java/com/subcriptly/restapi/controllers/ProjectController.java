package com.subcriptly.restapi.controllers;

import com.subcriptly.dto.ProjectDto;
import com.subcriptly.models.Project;
import com.subcriptly.services.project.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("project")
@RequestMapping(value = "project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping("")
    public List<Project> get() {
        var projects = projectService.getProjects();
        return projects.stream().toList();
    }

    @GetMapping("/{id}")
    public ProjectDto get(@PathVariable("id") String id) {
        var project = projectService.get(id);
        return convertProjectToDto(project);
    }
    @PostMapping("")
    public ProjectDto create(@RequestBody ProjectDto projectDto) {
        var project = new Project();
        projectService.create(project);
        return convertProjectToDto(project);
    }
    private ProjectDto convertProjectToDto(Project project) {
        ProjectDto dto = modelMapper.map(project, ProjectDto.class);
        return dto;
    }
    private Project convertProjectToObject(ProjectDto projectDto) {
        Project obj = modelMapper.map(projectDto, Project.class);
        return obj;
    }
}
