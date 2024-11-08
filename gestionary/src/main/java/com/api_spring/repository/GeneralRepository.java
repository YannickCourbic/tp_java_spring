package com.api_spring.repository;

import java.util.HashMap;
import java.util.List;

public interface GeneralRepository<T, ID> {
    T save(HashMap<String , Object> hydrate);
    void deleteById(ID id);
    T findById(ID id);
    List<T> findAll();
}
