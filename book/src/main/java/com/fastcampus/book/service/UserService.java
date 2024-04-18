package com.fastcampus.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fastcampus.book.domain.RentDto;
import com.fastcampus.book.domain.UserDto;

@Service
public interface UserService {

	List<UserDto> getUsers() throws Exception;

	UserDto getUserInfo(String custNo) throws Exception;

	int getCount() throws Exception;
	
	int getMaxCustNo() throws Exception;
	
	List<RentDto> getRents() throws Exception;
	
	List<UserDto> getUserTotalRent() throws Exception;
	
	int addUser(UserDto user) throws Exception;
	
	int modifyUser(UserDto user) throws Exception;

}