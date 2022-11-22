package com.enigmacamp.erjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_credential")
@ToString
public class UserCredential {
    @Id
    @Column(name = "user_name")
    private @Getter
    @Setter String userName;

    @Column(nullable = false)
    private @Getter
    @Setter String password;

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "userCredential")
    @JoinColumn(name = "student_id")
    @Getter
    @Setter
    Student student;
}
