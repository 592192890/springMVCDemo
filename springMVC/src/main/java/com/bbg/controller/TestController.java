package com.bbg.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbg.dao.ApiParamEntity;
import com.bbg.dao.User;
import com.bbg.service.TestService;
import com.bbg.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="springtest")
	public String springTest(){
		return testService.test();
	}
	
	@RequestMapping(value="/user",consumes = "application/json",produces="application/json")
	@ResponseBody
	public Map index(@RequestBody ApiParamEntity u) throws JsonParseException, JsonMappingException, IOException{
//		ObjectMapper objectMapper = new ObjectMapper();
//		User user = objectMapper.readValue(u, User.class);
		System.out.println(u.getName());
		
		
		Map map=new HashMap();
		map.put("name","Scott");
		
		return map;
//		return "demo";
	}
	@RequestMapping(value="/demo")
	public String test(){
		return "demo";
	}
	
	@RequestMapping(value="/get")
	@ResponseBody
	public User getUser(@RequestParam int id){
	
		User u=userService.getUser(id);
		
//		ObjectMapper objectMapper = new ObjectMapper();
//		String response = null;
//		try {
//			response = objectMapper.writeValueAsString(u);
//			System.out.println(response);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(u.getName());
		//自动将对象转为json格式返回
		return u;
	}
	
}
