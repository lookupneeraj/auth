package com.ard333.springbootjjwt.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ard333
 */
@NoArgsConstructor @AllArgsConstructor @Data
public class AuthResponse {
	
	private String token;

	public AuthResponse(final String token) {
		this.token = token;
		
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
