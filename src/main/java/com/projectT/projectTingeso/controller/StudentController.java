package com.projectT.projectTingeso.controller;

import com.projectT.projectTingeso.model.Student;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;


@Transactional
public interface StudentController extends CrudRepository<Student, Integer> {
}
