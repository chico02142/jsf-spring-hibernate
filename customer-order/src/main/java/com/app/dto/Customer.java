package com.app.dto;

/**
 * Customer information
 * 
 * @author Seetharama Krishna
 *
 */
public class Customer extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5398077190552126110L;
	
	private String name;
	private String email;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
