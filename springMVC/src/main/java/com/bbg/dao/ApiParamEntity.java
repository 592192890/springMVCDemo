package com.bbg.dao;

import java.util.ArrayList;
import java.util.List;


public class ApiParamEntity {
	private String name;
	private List<User> list=new ArrayList<User>();
	
	public ApiParamEntity(){
		
	}
	public ApiParamEntity(String name,List<User> list){
		this.name=name;
		this.list=list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	
	
}
