package com.zola.service;

import com.zola.entity.Project;
import com.zola.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getProjectsByMetro(Long metroId) {
        return projectRepository.findAll().stream()
                .filter(project -> project.getMetro().getMetroAreaId().equals(metroId))
                .collect(Collectors.toList());
    }
}
