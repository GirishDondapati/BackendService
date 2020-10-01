package com.poc.app.payload.request;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.NotBlank;


public class SignupRequest implements Serializable {
	
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	@NotBlank
	private String email;
	private Set<String> roles;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
	
}
