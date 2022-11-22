package com.enigmacamp.erjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "major")
@ToString
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    private @Getter
    @Setter long majorId;

    @Column(name = "major_name", nullable = false, length = 100)
    private @Getter
    @Setter String majorName;
    
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL)
    private @Getter
    @Setter
    @ToString.Exclude List<Student> studentList;
}
