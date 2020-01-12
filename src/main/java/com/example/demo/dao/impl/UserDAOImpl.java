package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.UserInfo;

@Repository
public class UserDAOImpl implements UserDAO{

	private List<UserInfo> userInfos = new ArrayList<>();

	public List<UserInfo> getAll() {
		return userInfos;
	}

	@Override
	public UserInfo findById(int id) {
		return userInfos.get(id);
	}

	@Override
	public void save(UserInfo userInfo) {
		userInfos.add(userInfo);
	}

	@Override
	public int getMax() {
		return userInfos.size();
	}
}
