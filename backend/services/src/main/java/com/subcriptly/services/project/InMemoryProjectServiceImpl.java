package com.subcriptly.services.project;

import com.subcriptly.models.Project;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//@Service
public class InMemoryProjectServiceImpl implements ProjectService {
    private static Map<String, Project> projectMap = new HashMap<>();

    {
        var project1 = new Project();
        project1.setId("abc123");
        project1.setName("Demo project");
        project1.setDescription("description is here");
        projectMap.put(project1.getId(), project1);

        var project2 = new Project();
        project2.setId("demo2");
        project2.setName("Second project");
        project2.setDescription("description is awesome");
        projectMap.put(project2.getId(), project2);
    }

    @Override
    public Collection<Project> getProjects() {
        return projectMap.values();
    }

    @Override
    public Project get(String id) {
        return projectMap.get(id);
    }

    @Override
    public Project create(Project project) {
        String newId = UUID.randomUUID().toString();
        project.setId(newId);
        projectMap.put(project.getId(), project);
        return project;
    }

    @Override
    public Project update(String id, Project project) {
        projectMap.put(project.getId(), project);
        return project;
    }

    @Override
    public void delete(String id) {
        projectMap.remove(id);
    }
}
