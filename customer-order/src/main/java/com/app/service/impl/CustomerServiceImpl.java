package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.CustomerMapper;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;

/**
 * 
 * 
 * @author Seetharama Krishna
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public CustomerRepository getRepository() {
		return customerRepository;
	}

	@Override
	public CustomerMapper getMapper() {
		return customerMapper;
	}

}
