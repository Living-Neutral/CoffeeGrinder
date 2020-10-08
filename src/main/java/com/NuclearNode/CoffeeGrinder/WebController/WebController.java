package com.NuclearNode.CoffeeGrinder.WebController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	

	@RequestMapping(value = "/CoffeeGrinder/mysqlTest", method = RequestMethod.GET)
	String mySqlCheck()
	{
		String url =  "jdbc:mysql://localhost:3306/starbucks drinks";
		String user = "root";
		String password = "SoberFlorida1!";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,user,password);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException throwables)
		{
			throwables.printStackTrace();
		}
		return "Connection is Successful";
	}
	/*
	@RequestMapping(value = "/CoffeeGrinder/BensTest", method = RequestMethod.GET)
	String mySqlCheckNew()
	{
		String url =  "jdbc:mysql://localhost:3306/starbucks_drinks";
		String user = "root";
		String password = "NyanCat7!";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,user,password);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException throwables)
		{
			throwables.printStackTrace();
		}
		return "Connection is Successful";
	}
	*/
		
}


