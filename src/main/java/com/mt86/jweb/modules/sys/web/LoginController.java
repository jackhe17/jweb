package com.mt86.jweb.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mt86.jweb.common.web.BaseController;

@Controller
public class LoginController extends BaseController{
	
	@RequestMapping(value="${adminPath}")
	public String index(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("cc-------------------------------------");
		return adminPath;
		
	}
}
