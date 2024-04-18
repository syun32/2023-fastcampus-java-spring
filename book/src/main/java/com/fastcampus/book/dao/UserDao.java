package com.fastcampus.book.dao;

import java.util.List;

import com.fastcampus.book.domain.RentDto;
import com.fastcampus.book.domain.UserDto;

public interface UserDao {
	List<UserDto> selectUsers() throws Exception;
	
    UserDto selectUser(String cust_no) throws Exception;
    
	int count() throws Exception;
	
	int selectMaxCustNo() throws Exception;
	
	List<RentDto> selectRents() throws Exception;
	
	List<UserDto> selectUserTotalRent() throws Exception;
	
	int insertUser(UserDto user) throws Exception;
	
	int updateUser(UserDto user) throws Exception;
	
}
