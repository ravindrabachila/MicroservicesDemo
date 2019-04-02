package com.student.model;

import com.department.model.DepartmentModel;

public class StudentModel {
	private int id;
	private String name;
	private String city;
	private String yearjoined;
	private DepartmentModel departmentModel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getYearjoined() {
		return yearjoined;
	}
	public void setYearjoined(String yearjoined) {
		this.yearjoined = yearjoined;
	}
	public DepartmentModel getDepartmentModel() {
		return departmentModel;
	}
	public void setDepartmentModel(DepartmentModel departmentModel) {
		this.departmentModel = departmentModel;
	}
	/**
	 * @param id
	 * @param name
	 * @param city
	 * @param yearjoined
	 * @param departmentModel
	 */
	public StudentModel(int id, String name, String city, String yearjoined, DepartmentModel departmentModel) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.yearjoined = yearjoined;
		this.departmentModel = departmentModel;
	}
	/**
	 * 
	 */
	public StudentModel() {
		super();
	}

	
	
	
}
