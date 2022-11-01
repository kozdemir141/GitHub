package com.project.testApp.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.testApp.models.User;

import lombok.Data;

@Data
public class CustomUserDetails implements UserDetails {

	private String username;

	private String password;

	private List<GrantedAuthority> authorities;// roles

	public CustomUserDetails(User user) {
		this.username = user.getEmail();
		this.password = user.getPassword();
		this.authorities = user.getRoles().stream().map((role -> new SimpleGrantedAuthority(role.getRole_name())))
				.collect(Collectors.toList());
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
