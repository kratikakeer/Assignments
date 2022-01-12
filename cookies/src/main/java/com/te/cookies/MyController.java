package com.te.cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	
	@GetMapping("/login")
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String username, Model model, HttpServletResponse res) {
		model.addAttribute("name", username);
		Cookie cookie = new Cookie("name", username);
		res.addCookie(cookie);
		return "welcome";
		
	}
	
	@GetMapping("/inbox")
	public String getinbox(@CookieValue String name, Model model) {
		model.addAttribute("data", name);
		return "inbox";
	}
	

}
