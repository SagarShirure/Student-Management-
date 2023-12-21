package com.Spring.Jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Spring.Jdbc.entity.Student;

//Adding the component
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	//Autowired injecting jdbcTemple
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Inserting value
	@Override
	public int insert(Student student) {
		String query="insert into student(id,name,city) value(?,?,?)";
		int result=jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}

	//updating value
	@Override
	public int update(Student student) {
		String query="update student set name=?, city=? where id=?";
		int result=jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}

	//delete the student by id
	@Override
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int result=jdbcTemplate.update(query,studentId);
		return result;
	}

	//get student by id
	@Override
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student result=jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return result;
	}

	//get all student
	@Override
	public List<Student> getAllStudent() {
		String query="select * from student ";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		List<Student> result=jdbcTemplate.query(query,rowMapper);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
