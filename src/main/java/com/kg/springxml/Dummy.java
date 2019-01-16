package com.kg.springxml;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Dummy
 */
@Component
public class Dummy {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
} 
    public int saveDetails(College clg)
	 {
		String query="insert into college values("+clg.getId()+",'"+clg.getName()+"','"+clg.getDepartment()+"','"+clg.getAge()+"')";
		return  jdbcTemplate.update(query);
	 }
}