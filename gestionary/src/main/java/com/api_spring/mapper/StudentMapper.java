package com.api_spring.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import com.api_spring.model.Student;

public class StudentMapper implements EntityMapper<Student>{

    @Override
    public Student mapHydrate(HashMap<String, Object> hydrate) throws SQLException {
        Student student = new Student();
        student.setId(Integer.parseInt(hydrate.get("id").toString()));
        student.setEmail(hydrate.get("email").toString());
        student.setFirstname(hydrate.get("firstname").toString());
        student.setLastname(hydrate.get("lastname").toString());
        student.setPhone(hydrate.get("phone").toString());
        return student;
    }

    @Override
    public Student mapRow(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setEmail(rs.getString("email"));
        student.setFirstname(rs.getString("firstname"));
        student.setLastname(rs.getString("lastname"));
        student.setPhone(rs.getString("phone"));
        return student;
    }

    
}
