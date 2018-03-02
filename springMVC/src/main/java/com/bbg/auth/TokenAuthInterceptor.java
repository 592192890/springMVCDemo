package com.bbg.auth;

import java.io.Writer;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TokenAuthInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("À¹½ØÆ÷after handle");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("À¹½ØÆ÷post handle");
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String cookie=req.getHeader("cookie");
		
		System.out.println("À¹½ØÆ÷pre handle:"+cookie);
		
		//if unlogin, return error info
//        Writer writer = res.getWriter();  
//        writer.write("{error:-100}");  
//        return false;  
		return true;
	}
	
}
