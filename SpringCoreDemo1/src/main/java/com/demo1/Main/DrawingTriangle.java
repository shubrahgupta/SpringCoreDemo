package com.demo1.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo1.beans.Triangle;
import com.demo1.beans.Triangle1;

public class DrawingTriangle {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Triangle t = (Triangle)context.getBean("t");
		t.draw();
		
		Triangle t1 = (Triangle)context.getBean("t1");
		t1.draw();
		
		Triangle1 t2 = (Triangle1)context.getBean("t2");
		t2.draw();
	}

}
