package com.enigmacamp.erjpa;

import com.enigmacamp.erjpa.constants.Gender;
import com.enigmacamp.erjpa.entity.Student;
import com.enigmacamp.erjpa.entity.UserCredential;
import com.enigmacamp.erjpa.repository.AuthenticationRepository;
import com.enigmacamp.erjpa.repository.AuthenticationRepositoryImpl;
import com.enigmacamp.erjpa.repository.StudentRepo;
import com.enigmacamp.erjpa.repository.StudentRepoImpl;
import com.enigmacamp.erjpa.utils.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class App {
    public static void main(String[] args) throws InterruptedException {
        EntityManager entityManager = JpaUtil.getEntityManager();
        StudentRepo studentRepo = new StudentRepoImpl(entityManager);

        AuthenticationRepository authenticationRepository = new AuthenticationRepositoryImpl(entityManager);
//        UserCredential userCredential = new UserCredential();
//        userCredential.setUserName("stu");
//        userCredential.setPassword("pid");
//        authenticationRepository.create(userCredential);
//
//        Student student1 = new Student();
//        student1.setGender(Gender.M);
//        student1.setFirstName("stu");
//        student1.setLastName("pid");
//        student1.setBirthDate(new Date());
//        student1.setMajor("Computer Science");
//        student1.setUserCredential(userCredential);
//        userCredential.setStudent(student1);
//        studentRepo.create(student1);

        UserCredential credential = authenticationRepository.findOne("stu");
        System.out.println(credential.getStudent());

//        Student student = studentRepo.findOne(1);
//        System.out.println(student);
//        Thread.sleep(5000);
//        System.out.println(student.getUserCredential());

//        Student student2 = new Student();
//        student2.setStudentId(1);
//        student2.setGender(Gender.M);
//        student2.setFirstName("stu");
//        student2.setLastName("pid");
//        student2.setBirthDate(new Date());
//        student2.setMajor("Comp. Sci.");
//        studentRepo.update(student2);


    }
}
