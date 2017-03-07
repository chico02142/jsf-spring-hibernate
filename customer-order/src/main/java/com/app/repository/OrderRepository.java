package com.app.repository;

import org.springframework.stereotype.Repository;

import com.app.entity.OrderEntity;

/**
 * repository for order
 * 
 * @author Seetharama Krishna
 *
 */
@Repository
public interface OrderRepository extends BaseRepository<OrderEntity, Long> {

}
