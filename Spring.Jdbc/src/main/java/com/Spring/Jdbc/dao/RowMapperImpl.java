package com.Spring.Jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Spring.Jdbc.entity.Student;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student= new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
