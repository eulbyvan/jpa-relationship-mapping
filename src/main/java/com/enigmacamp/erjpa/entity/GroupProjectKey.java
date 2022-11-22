package com.enigmacamp.erjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Embeddable
public class GroupProjectKey {
    @Column(name = "student_id")
    @Getter
    @Setter
    long studentId;
    @Column(name = "project_id")
    @Getter
    @Setter
    long projectId;
}
