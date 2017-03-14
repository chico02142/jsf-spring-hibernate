package com.app.service.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.app.dto.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;
import com.app.service.impl.UserServiceImpl;

public class UserServiceTest {
	
	@Test
	public void testFindAll() {
		UserService userService = mock(UserServiceImpl.class);
		List<User> testUsers = new ArrayList<>();
		testUsers.add(new User());
		when(userService.findAll()).thenReturn(testUsers);
		assertEquals(userService.findAll(), testUsers);
	}
	
	@Test
	public void testGetRepository() {
		UserService userService = mock(UserServiceImpl.class);
		UserRepository userRepository = mock(UserRepository.class);
		when(userService.getRepository()).thenReturn(userRepository);
		assertEquals(userService.getRepository(), userRepository);
	}
	
	@Test
	public void testSaveOrUpdate() {
		UserService userService = mock(UserServiceImpl.class);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		User newUser = new User();
		newUser.setUserName("testuser");
		newUser.setPassword(encoder.encode("pass1234"));
		User savedUser = new User();
		savedUser.setId(1L);
		savedUser.setVersion(0L);
		savedUser.setUserName(newUser.getUserName());
		savedUser.setPassword(newUser.getPassword());
		when(userService.saveOrUpdate(newUser)).thenReturn(savedUser);
		assertEquals(userService.saveOrUpdate(newUser), savedUser);
	}
	
	

}
