package com.app.managedbean;

import java.io.Serializable;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.RequestScope;

import com.app.dto.Customer;
import com.app.dto.User;
import com.app.service.CustomerService;
import com.app.service.UserService;

/**
 * user backed bean used for login form
 * 
 * @author Seetharama Krishna
 *
 */
@Controller
@RequestScope
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8177603054184527196L;
	
	private User user;
	
	public UserBean() {
		user = new User();
	}
	
	@Autowired
	private transient UserService userService;
	
	@Autowired
	private transient CustomerService customerService;
	
	
	/**
	 * Authenticate the user using login credentials
	 */
	public String authenticate() {
		
		User loggedInUser = userService.findByUserName(user.getUserName());
		if (loggedInUser != null) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(user.getPassword(), loggedInUser.getPassword())) {
				addLoggedInCustomerToSession();
				return "/pages/private/dashboard";
			}
		}
		return "login";
	}

	
	private void addLoggedInCustomerToSession() {
		Customer customer  = customerService.getCustomerByUserName(user.getUserName());
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		HttpSession session = (HttpSession) context.getSession(true);
		session.setAttribute(Customer.class.getSimpleName(), customer);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
