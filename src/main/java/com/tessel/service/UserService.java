package com.tessel.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.tessel.dto.RegisterRequest;
import com.tessel.dto.UserResponse;
import com.tessel.entity.User;
import com.tessel.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UserResponse register(RegisterRequest request)
	{
		if(userRepository.existsByEmail(request.email())) {
			throw new ResponseStatusException(HttpStatus.CONFLICT,"Email already registered");
		}
		
		User user = User.builder()
		        .name(request.name())
		        .email(request.email())
		        .city(request.city())
		        .passwordHash(passwordEncoder.encode(request.password()))
		        .build();
		User saved=userRepository.save(user);
		
		return toResponse(saved);
	}
	
	private UserResponse toResponse(User user)
	{
		return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getRole(), user.getCity());
	}
	

}
