package com.enigmacamp.erjpa.repository;

import com.enigmacamp.erjpa.entity.Student;

import java.util.List;

public interface IStudentRepo {
    void create(Student student);
    Student findOne(long id);
    List<Student> findAll(int page, int pageSize);
    void update(Student student);
}
