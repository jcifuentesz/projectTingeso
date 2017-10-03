package com.projectT.projectTingeso;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.projectT.projectTingeso.controller.StudentController;
import com.projectT.projectTingeso.model.Student;

import static org.junit.Assert.assertEquals;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTest {
	@Autowired
	StudentController studentController;
	
	@Test
	public void testLoadStudent ()
	{
		List<Student> students = (ArrayList<Student>) studentController.findAll();
		assertEquals("Did not get all students", 3, students.size());
	}
	
	@Test
	public void testFindStudent() throws Exception{
		List<Student> pepitoList = studentController.findByName("pepito"); 
		assertEquals("Found wrong number of students", 1, pepitoList.size());
		assertEquals("Found wrong name", "pepito", pepitoList.get(0).getName());
	}
	
	@Before 
	public void setUp() throws Exception{
		studentController.deleteAll();
		Student s1 = new Student("juanito","1111111-1", "juanito@gmail.com","vagancia");
		studentController.save(s1);
		Student s2 = new Student("pepito","2222222-2", "pepito@gmail.com","vagancia");
		studentController.save(s2);
		Student s3 = new Student("pedrito","3333333-3", "pedrito@gmail.com","vagancia");
		studentController.save(s3);
	}
	
}
