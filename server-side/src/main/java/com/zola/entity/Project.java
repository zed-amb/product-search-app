package com.zola.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectgroupid;

    @ManyToOne
    @JoinColumn(name = "metroareaid", nullable = false) // Ensure the join column matches your DB
    private Metro metro;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "status")
    private String status;

    // Getters and Setters
    public Long getProjectGroupId() {
        return projectgroupid;
    }

    public void setProjectGroupId(Long projectGroupId) {
        this.projectgroupid = projectGroupId;
    }

    public Metro getMetro() {
        return metro;
    }

    public void setMetro(Metro metro) {
        this.metro = metro;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

