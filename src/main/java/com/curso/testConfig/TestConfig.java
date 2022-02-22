package com.curso.testConfig;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso.domain.User;
import com.curso.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Diego", "diego@teste.com", 29);
		User u2 = new User(null, "Rosidete", "rosa@teste.com", 52);
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
