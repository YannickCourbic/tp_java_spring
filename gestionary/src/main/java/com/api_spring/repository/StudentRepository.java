package com.api_spring.repository;

import org.springframework.jdbc.core.JdbcTemplate;

import com.api_spring.model.Student;

public class StudentRepository extends AbstractGeneralRepository<Student , Integer> {
    
    public StudentRepository(
        JdbcTemplate jdbcTemplate
    ){
        super(jdbcTemplate, "student");
    }
}
