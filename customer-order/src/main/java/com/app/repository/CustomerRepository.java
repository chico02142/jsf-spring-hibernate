package com.app.repository;

import org.springframework.stereotype.Repository;

import com.app.entity.CustomerEntity;

/**
 * repository for customer
 * 
 * @author Seetharama Krishna
 *
 */
@Repository
public interface CustomerRepository extends BaseRepository<CustomerEntity, Long> {

}
