package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired 
	public UserDAO userDao;

	public List<UserInfo> getAllUserInfo(){
		return userDao.getAll();
	}

	@Override
	public UserInfo findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public void insertUser(UserInfo userInfo) {
		int size = userDao.getMax();
		if(size==0){
			userInfo.setId(0);
		}else{
			userInfo.setId(size);
		}
		userDao.save(userInfo);
	}
}
