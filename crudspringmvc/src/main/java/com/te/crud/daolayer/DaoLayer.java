package com.te.crud.daolayer;

import java.util.List;

import com.te.crud.model.Employee;

public interface DaoLayer {
	
	public boolean save(Employee emp);
	
	public boolean remove(int id);
	
	public boolean update(String ename, String newname);
	
	public boolean update1(int id, String firstname);
	
	public Object getone(int id);
	
	public List<Employee> get();

}
