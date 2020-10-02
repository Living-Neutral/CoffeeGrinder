package com.NuclearNode.CoffeeGrinder;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarbucksController 
{
	private StarbucksDrinkService sb_service;
	
	@RequestMapping("/CoffeeGrinder")
	public List<StarbucksDrink> getAllStarBucksDrink()
	{
		
	}
	
	@RequestMapping("/CoffeeGrinder/{id}")
	public getStarbucksDrink(@PathVariable String id)
	{
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/CoffeeGrinder")
	public void addStarbucksDrink(@RequestBody StarbucksDrink sb_drink) 
	{
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/CoffeeGrinder/{id}")
	public void updateStarbucksDrink(@RequestBody StarbucksDrink sb_drink, @PathVariable String id)
	{
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value ="/CoffeeGrinder/{id}")
	public void deleteStarbucksDrink(@PathVariable String id)
	{
		
	}
	

}
