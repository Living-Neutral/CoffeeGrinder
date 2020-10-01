package com.NuclearNode.CoffeeGrinder.WebController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	
<<<<<<< HEAD
=======
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

>>>>>>> e5d0fa81983465371305c9a0eed9bec7a7854256
}

