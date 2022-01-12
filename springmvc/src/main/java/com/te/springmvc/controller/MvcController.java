package com.te.springmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.model.Register;
import com.te.springmvc.service.MvcService;

//@RequestMapping("/")
//@Component
@Controller
public class MvcController {

	@RequestMapping("/spider")
	public String home() {
//		return "home.jsp";
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
//		return "login.jsp";
		return "login";
	}
	
	@RequestMapping(path="/login" , method = RequestMethod.POST)
	public String log(@RequestParam("name") String username, @RequestParam("pass") String password) {

//	public String log(HttpServletRequest req) {
//		String username = req.getParameter("name");
//		String password = req.getParameter("pass");
		if(username.isEmpty()) {
			return "failure";
		}
		return "success";
	}
	
	@GetMapping("/register")
	public String reg() {
		return "register";
	}
	  
	
//	@PostMapping("/register")
//	public String register(@ModelAttribute Register reg) {
//		System.out.println("Name: " +reg.getName());
//		System.out.println("Email Id: " +reg.getEmail());
//		System.out.println("Mobile Number : " +reg.getPhoneNo());
//		System.out.println("Address : " +reg.getAddress());
//		
//		return "success";
//		
//	
	
//	@PostMapping("/register")
//	public String register(Register reg, ModelMap map) {
//		map.addAttribute("details", reg);
//		return "success";
//	}

	@Autowired
	MvcService service;
	
	@PostMapping("/register")
	public String register(Register reg, ModelMap map) {
		map.addAttribute("details", reg);
		service.save(reg);
		return "success";
	}

}

