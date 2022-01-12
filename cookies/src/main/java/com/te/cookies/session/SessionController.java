package com.te.cookies.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {
	
	@GetMapping("/login1")
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/login1")
	public String login(HttpServletRequest req, String username, Model model) {
		HttpSession session = req.getSession();
		session.setAttribute("data", username);
		model.addAttribute("name", username);
		return "welcome";
	}
	
	@GetMapping("/inbox1")
	public String inbox(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		String attribute = (String) session.getAttribute("data");
		model.addAttribute("data", attribute);
		return "inbox";
	}

}
