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
    
    @Autowired
    private QueryHandler queryhandler = new QueryHandler();
    
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
    
    
    @RequestMapping("CoffeeGrinder/StarbucksDrink/CRStest")
    public String getCRSINFO()
    {
    	return queryhandler.cachedrowtest();
    }
    
    @RequestMapping("CoffeeGrinder/StarbucksDrink/FinalOrder")
    public List<StarbucksDrink> returnOrder()
    {
    	return queryhandler.makeSBOrder();
    }
    
    @RequestMapping("CoffeeGrinder/StarbucksDrink/querytest")
    public void queryTest()
    {
    	queryhandler.queryTest();
    }

    @RequestMapping("CoffeeGrinder/dairy")
    public void dairyAllergy(){
	    
	    queryhandler.addDairyQuery();

	    System.out.println("Query Successful");
    }
    
    @RequestMapping("CoffeeGrinder/CreateCRS")
    public void createCRS()
    {
    	queryhandler.createCRS();
    }

    @RequestMapping("CoffeeGrinder/soy")
    public void soyAllergy(){
        queryhandler.addSoyAllergy();
        System.out.println("Query Successful");
    }

    @RequestMapping("CoffeeGrinder/treenuts")
    public void nutsAllergy(){
        queryhandler.addTreeNutsAllergy();
        System.out.println("Query Successful");
    }

    @RequestMapping("CoffeeGrinder/wheat")
    public void wheatAllergy(){
        queryhandler.addWheatAllergy();
        System.out.println("Query Successful");
    }

    @RequestMapping("CoffeeGrinder/get")
    public String returnData(){
	    return queryhandler.getQuery();
    }




    @Autowired
    FetchDrinkData fetchDrinkData;

    @GetMapping(path = "/getdata")
    List<DrinkModel> getDrinks(){
        return fetchDrinkData.findAll();
    }
    
    

}
