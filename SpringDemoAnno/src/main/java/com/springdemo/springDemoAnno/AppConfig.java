package com.springdemo.springDemoAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springdemo.springDemoAnno") //scans by class type
public class AppConfig {
	
/*	this is alternate of writing in a xml file specifying beans and bean id
 * 
 * @Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}*/
	

}
