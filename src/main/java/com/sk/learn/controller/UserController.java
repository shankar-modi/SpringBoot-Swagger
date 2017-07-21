package com.sk.learn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sk.learn.vo.User;

/**
 * 
 * @author shankarmodi
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public List<User> getUsers() {

		List<User> users = new ArrayList<>();

		User user = new User();

		user.setId(1);
		user.setName("S K MODI");
		user.setAge(26);

		users.add(user);

		return users;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String setUser(@RequestBody User user){
		
		System.out.println("Get user information : " + user.toString() );
		
		return "SUCCESS";
	}
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public String updateUser(@RequestBody User user){
		
		System.out.println("Updating user information : " + user.toString() );
		
		return "SUCCESS";
	}

}
