package com.myapp.test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;

import com.app.dto.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;
import com.app.service.impl.UserServiceImpl;

public class UserServiceTest {
	
	@Test
	public void testUserServiceFindAll() {
		UserServiceImpl userService = mock(UserServiceImpl.class);
		List<User> testUsers = new ArrayList<>();
		testUsers.add(new User());
		when(userService.findAll()).thenReturn(testUsers);
		assertEquals(userService.findAll(), testUsers);
	}
	
	@Test
	public void testUserServiceGetRepository() {
		UserServiceImpl userService = mock(UserServiceImpl.class);
		UserRepository userRepository = mock(UserRepository.class);
		when(userService.getRepository()).thenReturn(userRepository);
		assertEquals(userService.getRepository(), userRepository);
		
	}

}
