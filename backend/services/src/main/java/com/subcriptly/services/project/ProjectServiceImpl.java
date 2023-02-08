package com.subcriptly.services.project;

import com.subcriptly.models.Project;
import com.subcriptly.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository repository;

    @Override
    public Collection<Project> getProjects() {
        return repository.findAll();
    }

    @Override
    public Project get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Project create(Project project) {
        project.setId(UUID.randomUUID().toString());
        repository.save(project);
        return project;
    }

    @Override
    public Project update(String id, Project project) {
        Project projectDb = repository.findById(id).get();
        projectDb.setName(project.getName());
        projectDb.setDescription(project.getDescription());
        repository.save(projectDb);
        return project;
    }

    @Override
    public void delete(String id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
