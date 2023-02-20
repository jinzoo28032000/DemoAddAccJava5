package com.sendmail.bean;

 
public class SingUpBean {

	private String username;
	private String email;
	private String password;

	public SingUpBean(String username, String fullname, String email, String password, String photo, int activated,
					  int admin) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;

	}
	public SingUpBean() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
