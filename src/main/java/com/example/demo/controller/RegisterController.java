package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class RegisterController {
	
	@Autowired 
	public UserService userService;
	
	@PostMapping("/insert")
	public String insertUser(@RequestBody UserInfo userInfo){
//		int size = userInfos.size();
//		if(size==0){
//			userInfo.setId(0);
//			userInfos.add(userInfo);
//		}else{
//			userInfo.setId(size);
//			userInfos.add(userInfo);
//		}

		userService.insertUser(userInfo);
		return "Register Successfully";
	}
	
	@GetMapping("/{id}")
	public UserInfo getUserInfo(@PathVariable int id){
		return userService.findById(id);
//		return userInfos.get(id);
	}
	
	@GetMapping("/all")
	public List<UserInfo> getAllUserInfo(){
	return	userService.getAllUserInfo();
	}

}
