package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.dto.User;
import com.app.entity.UserEntity;

/**
 * 
 * @author Seetharama Krishna
 *
 */
@Component
public class UserMapper implements BaseMapper<User, UserEntity> {

	@Override
	public User mapEntityToDto(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity mapDtoToEntity(User dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
