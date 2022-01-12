package com.te.crud.service;

import java.util.List;

import com.te.crud.model.Employee;

public interface CrudService {
	
	public boolean add(Employee emp);
	
	public boolean delete(int id);
	
	public boolean update(String name, String newname);
	
	public boolean update1(int id, String firstname);
	
	public Object get(int id);
	
	public List<Employee> getData();


	

}
