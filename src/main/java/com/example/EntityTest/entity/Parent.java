package com.example.EntityTest.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parent {
    @Column(name="parent_name")
    private String name;
    @Column(name="parent_age")
    private Integer age;
    @Column(name="parent_number")
    private String number;
}
