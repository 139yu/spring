package com.xj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.sayHello();
	}
}
