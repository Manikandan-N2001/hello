package com.example.dbexample.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbexample.model.*;


public interface Userrepo extends JpaRepository<User, Integer> {
	
}
