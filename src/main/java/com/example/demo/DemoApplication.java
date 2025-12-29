package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	CommandLineRunner initDatabase(UserRepository repository) {
//		return args -> {
//			Users user1 = new Users();
//			user1.setUsername("admin");
//			user1.setPassword("admin123");
//
//			Users user2 = new Users();
//			user2.setUsername("tester");
//			user2.setPassword("test1234");
//			repository.save(user1);
//			repository.save(user2);
//		};
//	}

}
