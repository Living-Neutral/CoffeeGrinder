package com.NuclearNode.CoffeeGrinder.assignments;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.math.BigIntegerMath;

@RestController
public class TestController 
{
	@RequestMapping(value="/CoffeeGrinder/test",method=RequestMethod.GET)
	String testCheck()
	{
		return "CoffeeGrinder Test";
	}
	
	@RequestMapping(value="/CoffeeGrinder/guavatest",method=RequestMethod.GET)
	String guavaCheck()
	{
		
		return String.valueOf(BigIntegerMath.log10(new BigInteger("1000"),  
                RoundingMode.HALF_EVEN));
	}

	@RequestMapping(value="/CoffeeGrinder/worm",method=RequestMethod.GET)
	String wormReturn()
	{
		return "The worm. It wiggles.";
	}
	
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

}
