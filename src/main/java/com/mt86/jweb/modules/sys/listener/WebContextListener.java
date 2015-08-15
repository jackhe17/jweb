package com.mt86.jweb.modules.sys.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import com.mt86.jweb.modules.sys.service.SystemService;

public class WebContextListener extends ContextLoaderListener{

	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		
		if (!SystemService.printKeyLoadMessage()) {
			return null;
		}
		return super.initWebApplicationContext(servletContext);
		
	}
	
}
