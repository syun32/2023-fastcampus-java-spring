package com.fastcampus.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fastcampus.book.domain.UserDto;
import com.fastcampus.book.service.UserService;

@Controller
public class UserListController {
	@Autowired
	UserService userService;
	
	@GetMapping("/userlist")	// http://localhost:8090/book/userlist
	public String userList(Model m, HttpServletRequest request) {
		try {			
			List<UserDto> userlist = userService.getUsers();
			m.addAttribute("list", userlist);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "userList"; // WEB-INF/views/userList.jsp
	}
	
	@GetMapping("/userlist/modify")	// http://localhost:8090/book//userlist/modify&{cust_no}
	public String userModify(@RequestParam String cust_no, Model m, HttpServletRequest request) {
		try {
			UserDto user = userService.getUserInfo(cust_no);
			m.addAttribute(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "userModify"; // WEB-INF/views/userModify.jsp
	}
	
	@PostMapping("/userlist/modify")	// http://localhost:8090/book//userlist
	public String userModifySave(UserDto user, Model m, HttpServletRequest request) {
		try {
			int result = userService.modifyUser(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/userlist"; // WEB-INF/views/userlist.jsp
	}
}
