package com.minis.minis.test;

import com.minis.beans.BeansException;
import com.minis.context.ClassPathXmlApplicationContext;
import com.minis.test.AService;

public class Test1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	    com.minis.test.AService aService;
		try {
			aService = (AService)ctx.getBean("aservice");
		    aService.sayHello();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
