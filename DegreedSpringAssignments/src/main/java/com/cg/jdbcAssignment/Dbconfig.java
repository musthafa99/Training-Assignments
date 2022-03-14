package com.cg.jdbcAssignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dbconfig {
	
	@Value("${mysql.url}")
	private String url;
	@Value("${mysql.username}")
	private String username;
	@Value("${mysql.password}")
	private String password;
	@Value("${mysql.driver}")
	private String driver;
	
	
	public void display()
	{
		System.out.println("URL: "+url);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Driver: "+driver);
	}

}
