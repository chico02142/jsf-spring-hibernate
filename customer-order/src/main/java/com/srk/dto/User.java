package com.srk.dto;

/**
 * User information
 * 
 * @author Seetharama Krishna
 *
 */
public class User extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3386940874217135939L;
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
