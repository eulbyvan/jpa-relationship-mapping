package com.enigmacamp.erjpa;

import com.enigmacamp.erjpa.constants.Gender;
import com.enigmacamp.erjpa.entity.GroupProject;
import com.enigmacamp.erjpa.entity.Major;
import com.enigmacamp.erjpa.entity.Student;
import com.enigmacamp.erjpa.entity.UserCredential;
import com.enigmacamp.erjpa.repository.*;
import com.enigmacamp.erjpa.utils.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {
        EntityManager entityManager = JpaUtil.getEntityManager();
        StudentRepo studentRepo = new StudentRepoImpl(entityManager);
        MajorRepo majorRepo = new MajorRepoImpl(entityManager);
        GroupProjectRepo groupProjectRepo = new GroupProjectRepoImpl(entityManager);

//        AuthenticationRepository authenticationRepository = new AuthenticationRepositoryImpl(entityManager);
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

//        UserCredential credential = authenticationRepository.findOne("stu");
//        System.out.println(credential.getStudent());

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

//        List<Student> studentList = new ArrayList<>();

        //region major
//        Major major = new Major();
//        major.setMajorName("IT");
//        majorRepo.create(major);

//        Major major = majorRepo.findOne(1);
//
//        Student student = new Student();
//        student.setFirstName("stu");
//        student.setLastName("pid");
//        student.setGender(Gender.M);
//        student.setMajor(major);
//        student.setBirthDate(new Date());
//        studentRepo.create(student);

//        majorRepo.findOne(1).getStudentList().forEach(System.out::println);

//        studentList.add()
        //endregion

        //region group project
        GroupProject otherGroupProject = new GroupProject();
        otherGroupProject.setProjectName("React Native Framework Documentation");
        groupProjectRepo.create(otherGroupProject);

        Student student = studentRepo.findOne(1);
        student.getGroupProjects().add(otherGroupProject);
        otherGroupProject.getStudents().add(student);
        studentRepo.update(student);
        //endregion
    }
}
