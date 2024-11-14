package com.example.studentmanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.studentmanagement.model.User;
import com.example.studentmanagement.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	

}

