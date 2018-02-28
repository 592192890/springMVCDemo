package com.bbg.spring;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Controller
@RequestMapping("/index")
public class DemoController {
	@RequestMapping(value="/test",consumes = "application/json",produces="application/json")
	@ResponseBody
	public Map index(@RequestBody ApiParamEntity u) throws JsonParseException, JsonMappingException, IOException{
//		ObjectMapper objectMapper = new ObjectMapper();
//		User user = objectMapper.readValue(u, User.class);
		System.out.println(u.getName());
		for(User user:u.getList()){
			System.out.println(user.getAge());
		}
		
		Map map=new HashMap();
		map.put("name","Scott");
		
		return map;
//		return "demo";
	}
	@RequestMapping(value="/demo")
	public String test(){
		return "demo";
	}
}
