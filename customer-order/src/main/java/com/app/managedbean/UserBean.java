package com.app.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dto.User;
import com.app.service.UserService;

@Component
@ManagedBean
@RequestScoped
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8177603054184527196L;
	
	private User user;
	
	@Autowired
	private UserService userService;
	
	/**
	 * Authenticate the user using login credentials
	 */
	public void authenticate() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
