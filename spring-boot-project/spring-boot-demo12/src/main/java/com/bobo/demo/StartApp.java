package com.bobo.demo;


import com.bobo.demo.demo.MyBeanDefinitionRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MyBeanDefinitionRegistrar.class})
//@Configuration
public class StartApp {

	public static void main(String[] args) {
		//  test
		ConfigurableApplicationContext context = SpringApplication.run(StartApp.class, args);
	}
}
