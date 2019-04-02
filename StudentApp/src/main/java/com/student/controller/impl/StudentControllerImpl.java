package com.student.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.student.controller.IStudentController;
import com.student.model.StudentModel;
import com.student.service.StudentService;

@RestController
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private StudentService studentService;
	
	@Override
	public StudentModel getStudentInfo(int id) {
		// TODO Auto-generated method stub
		StudentModel studentModel=studentService.getStudentinfo(id);
		return studentModel;
	}

}
