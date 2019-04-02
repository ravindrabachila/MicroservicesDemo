package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.student.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService {
	
	List<StudentModel> lstModel= new ArrayList<>();
	public StudentServiceImpl() {
		
		
		for (int i=0; i<=3; i++) {
			StudentModel model= new StudentModel();
			model.setId(i);
			model.setCity("Canary_bangalore_"+i);
			model.setName("Canary_ravi_"+i);
			model.setYearjoined("Canary_201"+i);
			lstModel.add(model);
			
		}
	}

	@Override
	public StudentModel getStudentinfo(int id) {
		StudentModel newmodel= new StudentModel();
		lstModel.forEach(a -> {
			if(a.getId()==id) {
				newmodel.setId(id);
				newmodel.setCity(a.getCity());
				newmodel.setName(a.getName());
				newmodel.setYearjoined(a.getYearjoined());
			}
		});
		return newmodel;
	}

}
