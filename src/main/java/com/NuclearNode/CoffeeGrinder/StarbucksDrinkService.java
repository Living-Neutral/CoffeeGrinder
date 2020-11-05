package com.NuclearNode.CoffeeGrinder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarbucksDrinkService 
{
	
	
	@Autowired
	private StarBucksDrinkRepo sb_repo;
	
	public List<StarbucksDrink> getAllStarBucksDrinks()
	{
		
		Iterable<StarbucksDrink> sb_iter = sb_repo.findAll();
		List<StarbucksDrink> sb_drinks = new ArrayList <StarbucksDrink>();
		
		return sb_drinks;
	}
	
	public Optional<StarbucksDrink> getStarbucksDrink(String id)
	{
		return sb_repo.findById(id);
	}
	
	public void addStarBucksDrink(StarbucksDrink sbD)
	{
		sb_repo.save(sbD);
		
	}
	
	public void updateStarBucksDrink(String id, StarbucksDrink sbD)
	{
		sb_repo.save(sbD);
	}
	
	public void deleteStarbucksDrink(String id)
	{
		sb_repo.deleteById(id);
	}
	
	

}
