package com.enigmacamp.erjpa;

import com.enigmacamp.erjpa.constants.Gender;
import com.enigmacamp.erjpa.entity.Student;
import com.enigmacamp.erjpa.repository.StudentRepo;
import com.enigmacamp.erjpa.repository.StudentRepoImpl;
import com.enigmacamp.erjpa.utils.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        StudentRepo studentRepo = new StudentRepoImpl(entityManager);

//        Student student1 = new Student();
//        student1.setGender(Gender.M);
//        student1.setFirstName("stu");
//        student1.setLastName("pid");
//        student1.setBirthDate(new Date());
//        student1.setMajor("Computer Science");
//        studentRepo.create(student1);

        Student student2 = new Student();
        student2.setStudentId(1);
        student2.setGender(Gender.M);
        student2.setFirstName("stu");
        student2.setLastName("pid");
        student2.setBirthDate(new Date());
        student2.setMajor("Comp. Sci.");
        studentRepo.update(student2);


    }
}
