package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.model.StudentModel;

@RequestMapping(value="/StudentApi")
public interface IStudentController {
	
	@GetMapping(value="/studentinfo/id/{id}")
	public StudentModel getStudentInfo(@PathVariable int id);

}
