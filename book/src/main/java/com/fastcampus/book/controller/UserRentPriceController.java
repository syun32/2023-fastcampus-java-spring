package com.fastcampus.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fastcampus.book.domain.UserDto;
import com.fastcampus.book.service.UserService;

@Controller
public class UserRentPriceController {
	@Autowired
	UserService userService;
	
	@GetMapping("/rentprice") // http://localhost:8090/book/rentprice
	public String rentPrice(Model m, HttpServletRequest request) {
		try {
			List<UserDto> userRentList = userService.getUserTotalRent();
			m.addAttribute("list", userRentList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "userRentPrice"; // WEB-INF/views/userRentPrice.jsp
	}
	
}
