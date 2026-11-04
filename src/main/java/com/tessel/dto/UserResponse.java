package com.tessel.dto;

import com.tessel.entity.Role;

public record UserResponse(Long id, String name, String email,
		Role role, String city) {
	

}
