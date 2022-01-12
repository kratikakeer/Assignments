package com.te.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.te.crud.model.Employee;
import com.te.crud.service.CrudService;

@Controller
public class CrudController {

	@Autowired
	CrudService service;

	@GetMapping("/add")
	public String add() {
		return "insert";
	}

	@PostMapping("/add")
	public String addEmp(Employee emp) {
		// case1: emp object is null
		// case2: emp object is not null and no exception
		// case3: emp object is not null and with exception
		boolean add = service.add(emp);
		if (add) {
			return "success";
		} else {
			return "failure";
		}
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";

	}

	@PostMapping("/delete")
	public String delete(int id) {
		if (service.delete(id))
			return "success";
		return "failure";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	@PostMapping("/update")
	public String update(String ename, String newname) {
		if (service.update(ename, newname))
			return "success";
		return "failure";

	}

	@GetMapping("/update1")
	public String update1() {
		return "update1";
	}

	@PostMapping("/update1")
	public String update1(int id, String firstname) {
		if (service.update1(id, firstname)) 
			return "success";
		return "failure";
		
	}

	@GetMapping("/get")
	public String geti() {
		return "get";
	}

	@PostMapping("/get")
	public String getp(ModelMap map, int id) {
		map.addAttribute("data1", service.get(id));
		return "showone";
	}

	@GetMapping("/getall")
	public String get(ModelMap map) {
		List list = service.getData();
		map.addAttribute("data", list);
		return "show";
	}

}
