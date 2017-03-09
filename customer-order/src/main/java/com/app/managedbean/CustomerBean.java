package com.app.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.app.dto.Customer;
import com.app.dto.User;
import com.app.service.CustomerService;
import com.app.service.UserService;

/**
 * Customer backed bean
 * 
 * @author Seetharama Krishna
 *
 */
@Component
@ManagedBean
@RequestScoped
public class CustomerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9015686401377185804L;
	
	private Customer customer;
	private String rawPassword;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * Register new customer
	 * Create a user login to the registered customer
	 */
	public void registerCustomer() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		customerService.saveOrUpdate(customer);
		
		User user = new User();
		user.setUserName(customer.getEmail());
		user.setPassword(encoder.encode(rawPassword));
		userService.saveOrUpdate(user);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
