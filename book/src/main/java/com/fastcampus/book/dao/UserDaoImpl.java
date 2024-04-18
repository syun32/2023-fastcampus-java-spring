package com.fastcampus.book.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fastcampus.book.domain.RentDto;
import com.fastcampus.book.domain.UserDto;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession session;
	private static String namespace = "com.fastcampus.book.dao.UserMapper.";

	@Override
	public List<UserDto> selectUsers() throws Exception {
		return session.selectList(namespace + "selectAll");
	}

	@Override
	public UserDto selectUser(String cust_no) throws Exception {
		return session.selectOne(namespace + "selectByCustNo", cust_no);
	}

	@Override
	public int count() throws Exception {
		return session.selectOne(namespace + "selectCount");
	}

	@Override
	public int selectMaxCustNo() throws Exception {
		return session.selectOne(namespace + "selectMaxCustNo");
	}
	
	@Override
	public List<RentDto> selectRents() throws Exception {
		return session.selectList(namespace + "selectRents");
	}
	
	@Override
	public List<UserDto> selectUserTotalRent() throws Exception {
		return session.selectList(namespace + "selectUserTotalRent");
	}
	
	@Override
	public int insertUser(UserDto user) throws Exception {
		Map<String, Object> param = new HashMap<String, Object>(); 
		param.put("cust_no", user.getCust_no()); 
		param.put("cust_name", user.getCust_name());
		param.put("phone", user.getPhone());
		param.put("cust_email", user.getCust_email());
		param.put("grade", user.getGrade());
		
		return session.insert(namespace + "insertUser", param);
	}
	
	@Override
	public int updateUser(UserDto user) throws Exception {
		Map<String, Object> param = new HashMap<String, Object>(); 
		param.put("cust_no", user.getCust_no()); 
		param.put("cust_name", user.getCust_name());
		param.put("phone", user.getPhone());
		param.put("cust_email", user.getCust_email());
		param.put("grade", user.getGrade());
		
		return session.update(namespace + "updateUser", param);
	}
	
}