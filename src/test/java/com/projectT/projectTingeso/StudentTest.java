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
	StudentController sc;
	
	@Test
	public void testLoadStudent ()
	{
		List<Student> students = (ArrayList<Student>) sc.findAll();
		assertEquals("Did not get all students", 3, students.size());
	}
	
	@Before 
	public void setUp() throws Exception{
		sc.deleteAll();
		Student s1 = new Student(1,"juanito","1111111-1", "juanito@gmail.com","vagancia");
		sc.save(s1);
		Student s2 = new Student(2,"juanito","1111111-1", "juanito@gmail.com","vagancia");
		sc.save(s2);
		Student s3 = new Student(3,"juanito","1111111-1", "juanito@gmail.com","vagancia");
		sc.save(s3);
	}
	
}
