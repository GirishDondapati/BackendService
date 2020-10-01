package com.poc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poc.app.model.User;
import com.poc.app.repository.UserRepository;

@SpringBootApplication
public class BackendServiceApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//this.userRepository.save(new User("Girish", "Dondapati", "giris@gmail.com","789456123"));
		//this.userRepository.save(new User("Mike", "Tison", "mike@gmail.com","321546789"));
	}
}
