package com.zola.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "metro")
public class Metro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "metroareaid")
    private Long metroAreaId;

    @Column(name = "metroareatitle")
    private String metroAreaTitle;

    @Column(name = "metroareastateabr")
    private String metroAreaStateAbr;

    @Column(name = "metroareastatename")
    private String metroAreaStateName;

    // Getters and Setters
    public Long getMetroAreaId() {
        return metroAreaId;
    }

    public void setMetroAreaId(Long metroAreaId) {
        this.metroAreaId = metroAreaId;
    }

    public String getMetroAreaTitle() {
        return metroAreaTitle;
    }

    public void setMetroAreaTitle(String metroAreaTitle) {
        this.metroAreaTitle = metroAreaTitle;
    }

    public String getMetroAreaStateAbr() {
        return metroAreaStateAbr;
    }

    public void setMetroAreaStateAbr(String metroAreaStateAbr) {
        this.metroAreaStateAbr = metroAreaStateAbr;
    }

    public String getMetroAreaStateName() {
        return metroAreaStateName;
    }

    public void setMetroAreaStateName(String metroAreaStateName) {
        this.metroAreaStateName = metroAreaStateName;
    }
}
