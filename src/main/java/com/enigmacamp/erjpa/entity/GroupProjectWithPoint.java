package com.enigmacamp.erjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "group_project_point")
@ToString
public class GroupProjectWithPoint {
    public GroupProjectWithPoint() {
        this.id = new GroupProjectKey();
    }

    @EmbeddedId
    @Getter
    @Setter
    GroupProjectKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    @Getter
    @Setter
    Student student;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "projectId")
    @Getter
    @Setter
    GroupProject groupProject;

    @Getter
    @Setter
    int point;
}
