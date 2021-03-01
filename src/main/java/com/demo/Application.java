package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot嘅啓動類（引導類）
 * 
 * @author Hopen
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// 1、返回我们IOC容器
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		// 2、查看容器里面的组件bean
		String[] beans = run.getBeanDefinitionNames();
		for (String bean : beans) {
			System.out.println("bean -->" + bean + "<--");
		}

	}

}
