package com.bbg.spring;

import java.io.Serializable;

public class User implements Serializable{
	private int id;
	private String age;
	public User(){
		
	}
	public User(int id,String age){
		
		this.id=id;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
