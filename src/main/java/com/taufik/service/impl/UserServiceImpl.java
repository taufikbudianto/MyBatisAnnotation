package com.taufik.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taufik.mapper.UserMapper;
import com.taufik.model.User;
import com.taufik.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper mapper;
	
	public List<User> getAllUser() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAllUser();
	}

	public User getSingleUser(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSingleUser(1);
	}

	public boolean insert(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.insert(user);
	}

	public boolean update(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(user);
	}

	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}
	

}
