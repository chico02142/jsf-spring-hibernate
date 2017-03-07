package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.UserMapper;
import com.app.repository.UserRepository;
import com.app.service.UserService;

/**
 * 
 * @author Seetharama Krishna
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserRepository getRepository() {
		return userRepository;
	}

	@Override
	public UserMapper getMapper() {
		return userMapper;
	}

}
