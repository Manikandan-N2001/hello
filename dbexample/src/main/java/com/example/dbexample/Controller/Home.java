package com.example.dbexample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dbexample.model.*;

import com.example.dbexample.dao.*;



@Controller
public class Home {
	
	@Autowired
	Userrepo repo;
	
	
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("addUsers")  //1,sabari
	public String addUsers(User u)
	{
		repo.save(u);
		
		return "result";
	}
	

}
