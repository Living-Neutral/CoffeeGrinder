package com.NuclearNode.CoffeeGrinder;

import java.util.List;

import java.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.rowset.CachedRowSetImpl;

@RestController
@RequestMapping
public class MainController {

    
    @Autowired
    private StarbucksDrinkService starbucks_drink_service;
    
    //@Autowired
    //private QueryHandler queryhandler;
    
	@RequestMapping(value = "/CoffeeGrinder/home",method=RequestMethod.GET)
	public String home()
	{
		return "Welcome to CoffeeGrinder";
	}
	
    @RequestMapping("/CoffeeGrinder/StarbucksDrinks")
    public List<StarbucksDrink> getAllStarBucksDrinks()
    {
    	return starbucks_drink_service.getAllStarBucksDrinks();
    }
    
    
    @RequestMapping("CoffeeGrinder/StarbucksDrink/id")
    public String getDrinkInfo()
    {
    	//return queryhandler.returnDrinkInfo("Blonde Roast");
    	return "";
    }
    
    @Autowired
    FetchDrinkData fetchDrinkData;

    @GetMapping(path = "/getdata")
    List<DrinkModel> getDrinks(){
        return fetchDrinkData.findAll();
    }
    
    

}
