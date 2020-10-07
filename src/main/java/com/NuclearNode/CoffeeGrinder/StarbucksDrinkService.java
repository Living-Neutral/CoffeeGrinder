package com.NuclearNode.CoffeeGrinder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarbucksDrinkService 
{
	@Autowired
	private StarBucksDrinkRepo sb_repo;
	
	public List<StarbucksDrink> getAllStarBucksDrinks()
	{
		List<StarbucksDrink> sb_drinks = new ArrayList <StarbucksDrink>();
		
	}
	
	public StarbucksDrink getStarbucksDrink()
	{
		
	}
	
	public void addStarBucksDrink()
	{
		
	}
	
	public void updateStarBucksDrink()
	{
		
	}
	
	public void deleteStarbucsDrink()
	{
		
	}
	

}
