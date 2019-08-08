package com.example.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

//@SpringBootApplication
public class Chapter3Application {
	private static Logger logger = Logger.getLogger(Chapter3Application.class);



	public static void main(String[] args) {
		ApplicationContext ctx=
		new AnnotatiionConfigApplicationContext(AppConfig.class);
		User user=ctx.getBean(User.class);

		log.info(user.getId());
		//SpringApplication.run(Chapter3Application.class, args);
	}

}
