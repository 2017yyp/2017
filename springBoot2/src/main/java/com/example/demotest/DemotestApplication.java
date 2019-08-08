package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//@Controller
//启用Spring Boot自动装配
//@EnableAutoConfiguration
@SpringBootApplication
public class DemotestApplication {
//	@RequestMapping("/test")
//	@ResponseBody
//    private Map<String,String> test(){
//		Map<String,String> map = new HashMap<String,String>();
//        map.put("key","value");
//		return  map;
//	}

	public static void main(String[] args) {

		SpringApplication.run(DemotestApplication.class, args);
	}

}
