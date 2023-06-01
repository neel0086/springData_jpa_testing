package com.example.EntityTest.Repository;

import com.example.EntityTest.entity.Parent;
import com.example.EntityTest.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student
                .builder()
                .email("aryanmehta16@gmail.com")
                .name("Aryan Mehta")
                .age(12)
                .build();
        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithParent(){
        Parent parent = Parent
                .builder()
                .name("Amit Mehta")
                .number("9999999999")
                .age(50)
                .build();
        Student student= Student
                .builder()
                .email("aryanmehta16@gmail.com")
                .name("Aryan Mehta")
                .age(12)
                .parent(parent)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void FindAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        for(Student s:studentList){
            System.out.println(s.getEmail());
        }
        System.out.println(studentList);
    }


}