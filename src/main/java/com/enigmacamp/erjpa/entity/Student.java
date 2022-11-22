package com.enigmacamp.erjpa.entity;

import com.enigmacamp.erjpa.constants.Gender;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "gender", columnDefinition = "varchar(1)")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id")
    private Major major;
    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id")
    private UserCredential userCredential;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private final List<GroupProjectWithPoint> projectWithPoints = new ArrayList<>();
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public UserCredential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(UserCredential userCredential) {
        this.userCredential = userCredential;
    }

    public List<GroupProjectWithPoint> getProjectWithPoints() {
        return projectWithPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", major='" + major + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
