package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.dto.Order;
import com.app.entity.OrderEntity;

/**
 * 
 * @author Seetharama Krishna
 *
 */
@Component
public class OrderMapper implements BaseMapper<Order, OrderEntity> {

	@Override
	public Order mapEntityToDto(OrderEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderEntity mapDtoToEntity(Order dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
