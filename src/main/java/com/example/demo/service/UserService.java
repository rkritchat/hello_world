package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserInfo;

public interface UserService {

	public List<UserInfo> getAllUserInfo();

	public UserInfo findById(int id);

	public void insertUser(UserInfo userInfo);
	
}
