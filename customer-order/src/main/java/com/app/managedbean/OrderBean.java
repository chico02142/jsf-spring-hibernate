package com.app.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.stereotype.Component;

import com.app.dto.Order;

/**
 * 
 * @author Seetharama Krishna
 *
 */
@Component
@ManagedBean
@RequestScoped
public class OrderBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7629488293840729328L;
	
	private Order order;
	private List<Order> existingOrders;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<Order> getExistingOrders() {
		return existingOrders;
	}
	public void setExistingOrders(List<Order> existingOrders) {
		this.existingOrders = existingOrders;
	}
	
	

}
