package com.projectT.projectTingeso.controller;

import com.projectT.projectTingeso.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import javax.transaction.Transactional;


@Transactional
public interface StudentController extends CrudRepository<Student, Integer> {
	List<Student> findByName(String name);
}
