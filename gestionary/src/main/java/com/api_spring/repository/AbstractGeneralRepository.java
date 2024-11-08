package com.api_spring.repository;

import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class AbstractGeneralRepository<T, ID> implements GeneralRepository<T,ID> {

    protected final JdbcTemplate jdbcTemplate;
    protected String className;
    protected AbstractGeneralRepository(JdbcTemplate jdbcTemplate, String className){
        this.jdbcTemplate = jdbcTemplate;
        this.className = className;
    }

 
    @Override
    public void deleteById(ID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public T findById(ID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<T> findAll() {
        String sql = "SELECT * FROM " + this.className;
        
    }


    @Override
    public T save(HashMap<String, Object> hydrate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
