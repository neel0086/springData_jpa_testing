package com.example.EntityTest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    private String name;
    private String email;
    private Integer age;
}
