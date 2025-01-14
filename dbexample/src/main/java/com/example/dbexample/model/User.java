package com.example.dbexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
    @Column(name="id")
	private int id;
	
	@Column(name="name")
	
	private String name;
	
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId()  {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName()  {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
