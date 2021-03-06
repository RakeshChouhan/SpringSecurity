package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authManager) throws Exception {
		authManager.inMemoryAuthentication().withUser("user").password("pass").roles("user");
		
		
	}
}
