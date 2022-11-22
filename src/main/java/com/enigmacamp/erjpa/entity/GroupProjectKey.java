package com.enigmacamp.erjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Embeddable
public class GroupProjectKey implements Serializable {
//    private static final long serialVersionUID = 7179815047212857614L;
    @Column(name = "student_id")
    @Getter
    @Setter
    long studentId;

    @Column(name = "project_id")
    @Getter
    @Setter
    long projectId;
}
