package cn.scp997.moor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
* @SpringBootApplication 标志这是一个Spring Boot应用
* main方法都要放在Spring Boot应用中
 * */
@SpringBootApplication
public class MoorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MoorApplication.class, args);
		for(String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
