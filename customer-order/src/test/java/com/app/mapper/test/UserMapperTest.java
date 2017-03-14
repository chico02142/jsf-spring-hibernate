package com.app.mapper.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.app.dto.User;
import com.app.entity.UserEntity;
import com.app.mapper.UserMapper;

public class UserMapperTest {
	
	@Test
	public void testMapDtoToEntity() {
		UserMapper mapper = new UserMapper();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		User newUser = new User();
		newUser.setUserName("testuser");
		newUser.setPassword(encoder.encode("pass1234"));
		User savedUser = new User();
		savedUser.setId(1L);
		savedUser.setVersion(0L);
		savedUser.setUserName(newUser.getUserName());
		savedUser.setPassword(newUser.getPassword());
		UserEntity savedUserEntity = new UserEntity();
		savedUserEntity.setId(1L);
		savedUserEntity.setVersion(0L);
		savedUserEntity.setUserName(newUser.getUserName());
		savedUserEntity.setPassword(newUser.getPassword());
		UserEntity entity = mapper.mapDtoToEntity(savedUser);
		
		assertEquals(entity, savedUserEntity);
		assertEquals(entity.getId(), savedUserEntity.getId());
		assertEquals(entity.getUserName(), savedUserEntity.getUserName());
		assertEquals(entity.getPassword(), savedUserEntity.getPassword());
	}

}
