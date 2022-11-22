package com.enigmacamp.erjpa.entity;

import com.enigmacamp.erjpa.constants.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private @Getter
    @Setter long studentId;

    @Column(name = "first_name", nullable = false, length = 50)
    private @Getter
    @Setter String firstName;

    @Column(name = "last_name", length = 50)
    private @Getter
    @Setter String lastName;

    @Column(name = "gender", columnDefinition = "varchar(1)")
    @Enumerated(EnumType.STRING)
    private @Getter
    @Setter Gender gender;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "major_id")
    private @Getter
    @Setter
    @ToString.Exclude Major major;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false)
    private @Getter
    @Setter Date birthDate;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id")
    private @Getter
    @Setter
    @ToString.Exclude UserCredential userCredential;
    
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private @Getter
    @Setter
    @ToString.Exclude List<GroupProjectWithPoint> projectWithPoints = new ArrayList<>();
}
