package com.Spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Spring.Jdbc.dao.StudentDao;
import com.Spring.Jdbc.entity.Student;

public class App {
	public static void main(String[] args) {
		
//		Creating Application Context object using Class Path Xml
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
//		Creating Application Context object using Annotations
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

		StudentDao student1 = context.getBean("studentDao", StudentDao.class);

//      Creating Student object 
		Student student = new Student();

		/*
		 * Insert student student.setId(3); student.setName("Rutwik");
		 * student.setCity("Sangali");
		 * 
		 * System.out.println(student1.insert(student));
		 */

		/*
		 * Update student student.setId(3); student.setName("Rutwik");
		 * student.setCity("Sangali");
		 * 
		 * System.out.println(student1.update(student));
		 */

		/*
		 * Delete student System.out.println(student1.delete(3));
		 */

		/*
		 * Get student by Id System.out.println(student1.getStudent(1));
		 */

		/*
		 * Getting all student 
		 */
		System.out.println(student1.getAllStudent());
	}
}
