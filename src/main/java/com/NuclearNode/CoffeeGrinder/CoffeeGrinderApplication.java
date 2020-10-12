package com.NuclearNode.CoffeeGrinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.NuclearNode.CoffeeGrinder.MainController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class CoffeeGrinderApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(CoffeeGrinderApplication.class, args);

		DatabaseConnection ex = new DatabaseConnection();
		ex.connect();

	}

}
