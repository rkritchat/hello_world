package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.UserInfo;

public interface UserDAO {

	public List<UserInfo> getAll();

	public UserInfo findById(int id);

	public void save(UserInfo userInfo);

	public int getMax();

}
