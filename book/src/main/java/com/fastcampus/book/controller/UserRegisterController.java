package com.fastcampus.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fastcampus.book.domain.UserDto;
import com.fastcampus.book.service.UserService;

@Controller
public class UserRegisterController {
	@Autowired
	UserService userService;
	
	@GetMapping("/register")	// http://localhost:8090/book/register
	public String register(Model m, HttpServletRequest request) {
		try {
			int cust_no = userService.getMaxCustNo();
			m.addAttribute("cust_no", cust_no);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "userRegister"; // WEB-INF/views/userRegister.jsp
	}
	
	@PostMapping("/register")	// http://localhost:8090/book/register
	public String save(UserDto user, Model m, HttpServletRequest request) {
		try {
			int result = userService.addUser(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/userlist"; // WEB-INF/views/userList.jsp
	}
	
}
