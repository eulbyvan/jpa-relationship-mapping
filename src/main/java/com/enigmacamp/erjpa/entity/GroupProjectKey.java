package com.enigmacamp.erjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class GroupProjectKey {
    @Column(name = "student_id")
    long studentId;
    @Column(name = "project_id")
    long projectId;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "GroupProjectKey{" +
                "studentId=" + studentId +
                ", projectId=" + projectId +
                '}';
    }
}
