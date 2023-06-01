package com.example.EntityTest.Repository;

import com.example.EntityTest.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student
                .builder()
                .email("neelmehta0086@gmail.com")
                .name("Neel Mehta")
                .age(21)
                .build();
        studentRepository.save(student);
    }

}