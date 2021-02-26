package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.User;
import com.spring.config.AppConfig;

public class SpringUserApp {

	public static void main(String[] args) {
	    System.out.println(" begin");
	    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	    User user = ctx.getBean(User.class);
	    
	   // user.setUserId(10);
	    System.out.println("id "+ user.getUserId());

	}

}

