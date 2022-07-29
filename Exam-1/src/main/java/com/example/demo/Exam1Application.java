package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
import com.example.demo.entity.UserProfile;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class Exam1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Exam1Application.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User();
		user.setName("Deepak");
		user.setEmail("depak@gmail.com");
		
		UserProfile userProfile=new UserProfile();
		userProfile.setAddress("Gurgaon");
		userProfile.setBirthOfDate(LocalDate.of(2000, 7, 29));
		userProfile.setMobile("100");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
