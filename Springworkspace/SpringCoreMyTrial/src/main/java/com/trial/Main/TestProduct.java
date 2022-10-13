package com.trial.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trial.beans.Product;

public class TestProduct {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Product p1 = (Product)context.getBean("p1");
		p1.returnitem();
		
		
	}
	
	
}
