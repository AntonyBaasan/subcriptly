package com.subcriptly.repository;

import com.subcriptly.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
//    List<Project> findAll();
//    Optional<Project> findById(String id);
}
