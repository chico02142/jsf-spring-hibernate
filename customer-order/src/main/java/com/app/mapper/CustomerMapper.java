package com.app.mapper;

import org.springframework.stereotype.Component;

import com.app.dto.Customer;
import com.app.entity.CustomerEntity;

/**
 * mapper for customer
 * 
 * @author Seetharama Krishna
 *
 */
@Component
public class CustomerMapper implements BaseMapper<Customer, CustomerEntity> {

	@Override
	public Customer mapEntityToDto(CustomerEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity mapDtoToEntity(Customer dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
