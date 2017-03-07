package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.Order;
import com.app.entity.OrderEntity;
import com.app.mapper.BaseMapper;
import com.app.mapper.OrderMapper;
import com.app.repository.BaseRepository;
import com.app.repository.OrderRepository;
import com.app.service.BaseService;

/**
 * 
 * @author Seetharama Krishna
 *
 */
@Service("orderService")
public class OrderServiceImpl implements BaseService<Order, OrderEntity> {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public BaseRepository<OrderEntity, Long> getRepository() {
		return orderRepository;
	}

	@Override
	public BaseMapper<Order, OrderEntity> getMapper() {
		return orderMapper;
	}

}
