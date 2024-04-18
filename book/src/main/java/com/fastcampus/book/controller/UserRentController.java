package com.fastcampus.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fastcampus.book.domain.RentDto;
import com.fastcampus.book.service.UserService;

@Controller
public class UserRentController {
	@Autowired
	UserService userService;
	
	@GetMapping("/userrent") // http://localhost:8090/book/userrent
	public String userRent(Model m, HttpServletRequest request) {
		try {
			List<RentDto> rentList = userService.getRents();
			m.addAttribute("list", rentList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "userRentList"; // WEB-INF/views/userRentList.jsp
	}
	
}
