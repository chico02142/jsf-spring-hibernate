package com.app.repository;

import org.springframework.stereotype.Repository;

import com.app.entity.UserEntity;

/**
 * repository for user
 * 
 * @author Seetharama Krishna
 *
 */
@Repository
public interface UserRepository extends BaseRepository<UserEntity, Long> {

}
