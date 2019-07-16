package com.bridgelabz.fundoo.dto;

public class UserLoginDto 
{
	private String emailId;
	private String Password;

	@Override
	public String toString() 
	{
		return "LoginDto [emailId=" + emailId + ", Password=" + Password + "]";
	}
	
	public UserLoginDto(String emailId, String password) {
		super();
		this.emailId = emailId;
		Password = password;
	}

	public String getEmailId() 
	{
		return emailId;
	}
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	public String getPassword() 
	{
		return Password;
	}
	public void setPassword(String password) 
	{
		Password = password;
	}

}