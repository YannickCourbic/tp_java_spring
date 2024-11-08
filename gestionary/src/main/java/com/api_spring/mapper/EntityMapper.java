package com.api_spring.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public interface EntityMapper<T>{
    T mapHydrate(HashMap<String, Object> hydrate) throws SQLException;
    T mapRow(ResultSet rs) throws SQLException;

}
