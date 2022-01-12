package com.te.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crud.daolayer.DaoLayer;
import com.te.crud.model.Employee;

@Service
public class CrudServiceImpl implements CrudService {

	@Autowired
	private DaoLayer dao;

	@Override
	public boolean add(Employee emp) {
		// emp object is null
		if (emp == null) {
			return false;
		}
		return dao.save(emp);

	}

	@Override
	public boolean delete(int id) {
		if (id == 0)
			return false;
		return dao.remove(id);
	}

	@Override
	public boolean update(String name, String newname) {
		if (name == null)
			return false;
		return dao.update(name, newname);

	}

	@Override
	public boolean update1(int id, String firstname) {
		if (firstname == null && id == 0)
			return false;
		return dao.update1(id, firstname);
	}

	@Override
	public Object get(int id) {
		return dao.getone(id);
	}

	@Override
	public List<Employee> getData() {
		return dao.get();
	}

}
