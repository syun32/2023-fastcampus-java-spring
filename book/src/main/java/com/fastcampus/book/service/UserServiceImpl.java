package com.fastcampus.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fastcampus.book.dao.UserDao;
import com.fastcampus.book.domain.*;

@Repository
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

    @Override
    public List<UserDto> getUsers() throws Exception {
        return userDao.selectUsers();
    }

    @Override
    public UserDto getUserInfo(String custNo) throws Exception {
        UserDto userDto = userDao.selectUser(custNo);
        return userDto;
    }
	
    @Override
    public int getCount() throws Exception {
        return userDao.count();
    }
    
    @Override
    public int getMaxCustNo() throws Exception {
    	return userDao.selectMaxCustNo();
    }
    
    @Override
    public List<RentDto> getRents() throws Exception {
    	return userDao.selectRents();
    }
    
    @Override
    public List<UserDto> getUserTotalRent() throws Exception {
    	return userDao.selectUserTotalRent();
    }
    
    @Override
    public int addUser(UserDto user) throws Exception {
    	return userDao.insertUser(user);
    }
    
    @Override
    public int modifyUser(UserDto user) throws Exception {
    	return userDao.updateUser(user);
    }
}
