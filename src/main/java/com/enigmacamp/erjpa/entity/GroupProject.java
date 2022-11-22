package com.enigmacamp.erjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group_project")
@ToString
public class GroupProject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private @Getter @Setter long projectId;

    @Column(name = "project_name", nullable = false, length = 50)
    private @Getter @Setter String projectName;

    @OneToMany(mappedBy = "groupProject")
    private @Getter @Setter
    @ToString.Exclude List<GroupProjectWithPoint> projectWithPoints = new ArrayList<>();
}
