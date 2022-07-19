package com.company;

import com.company.entity.User;
import com.company.service.inter.UserServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ResumeDbAppJpaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeDbAppJpaSpringApplication.class, args);
	}

//	@Autowired
//	private UserRepository userRepository;

	@Autowired
	private UserServiceInter userRepository;


	@Bean
	public CommandLineRunner run(){
		CommandLineRunner clr=new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				List<User> list=userRepository.getAll(null,null,null);
				User user=userRepository.findByEmail(list.get(0).getEmail());
				System.out.println("heey "+user.getName()+"   email  "+user.getEmail()+ " "+user.getPassword());
			//	System.out.println(list);
			}
		};
		return  clr;
	}

}