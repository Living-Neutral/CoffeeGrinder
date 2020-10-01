package com.NuclearNode.CoffeeGrinder.WebController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.math.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@RestController
public class WebController {
	
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
	
	
}
/*
 class JSoupExample{
	
	public static void main(String[] args) {
		Document doc;
		try {
		    
			doc = Jsoup.connect("http://google.com").get();
			
			String title = doc.title();
			System.out.println("Title: " + title);
			
			Elements links = doc.select("a[href]");
			for(Element link: links) {
				System.out.println("\nlink: " + link.attr("href"));
				System.out.println("text: " + link.text());
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

*/