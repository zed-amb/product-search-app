package com.zola.controllers;

import com.zola.entity.Project;
import com.zola.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/metro/{metroId}")
    public ResponseEntity<List<Project>> getProjectsByMetro(@PathVariable Long metroId) {
        return ResponseEntity.ok(projectService.getProjectsByMetro(metroId));
    }
}
