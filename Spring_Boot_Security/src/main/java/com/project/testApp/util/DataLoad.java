package com.project.testApp.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.project.testApp.models.Role;
import com.project.testApp.models.User;
import com.project.testApp.repositories.RoleRepository;
import com.project.testApp.repositories.UserRepository;

@Component
public class DataLoad implements ApplicationRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Role roleAdmin = Role.builder().id(1).role_name("ROLE_ADMIN").build();
		Role roleUser = Role.builder().id(2).role_name("ROLE_USER").build();
		
		roleRepository.save(roleAdmin);
		roleRepository.save(roleUser);
		
		//Admin User
		
		List<Role> adminRoleList = new ArrayList<>();
		adminRoleList.add(roleAdmin);
		
		User admin = User.builder().id(1).email("kozdemir141@outlook.com").password("55431921").roles(adminRoleList).build();
		userRepository.save(admin);
		
		//User
		
		List<Role> userRoleList = new ArrayList<>();
		userRoleList.add(roleUser);
		
		User user = User.builder().id(2).email("bozdemir141@outlook.com").password("55431921").roles(userRoleList).build();
		userRepository.save(user);
	}

}
