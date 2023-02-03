package com.subcriptly.services.project;

import com.subcriptly.models.Project;

import java.util.Collection;

public interface ProjectService {
    public abstract Collection<Project> getProjects();
    public abstract Project get(String id);
    public abstract Project create(Project project);
    public abstract Project update(String id, Project project);
    public abstract void delete(String id);
}
