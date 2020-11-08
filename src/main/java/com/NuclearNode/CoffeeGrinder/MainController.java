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
    
    @RequestMapping(method = RequestMethod.POST, value = "/CoffeeGrinder/StarbucksDrinks/add/{id}")
    public void addDrink(@PathVariable String id,StarbucksDrink sbD)
    {
    	starbucks_drink_service.updateStarBucksDrink(id,sbD);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/CoffeGrinder/StarbucksDrinks/Delete/{id}")
    public void deleteDrink(@PathVariable String id) 
    {
    	starbucks_drink_service.deleteStarbucksDrink(id);
    }

    @Autowired
    FetchDrinkData fetchDrinkData;

    @GetMapping(path = "/getdata")
    List<DrinkModel> getDrinks(){
        return fetchDrinkData.findAll();
    }
    
    @GetMapping(path="/sqlData")
    String amazonSqlTest() throws SQLException
    {
    	String q1 = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink";
    	Connection con = DriverManager.getConnection("jdbc:mysql://starbucks-drinks-online.ci8dkiszgiw2.us-east-2.rds.amazonaws.com:3299/CoffeeGrinder_drinks","root","CoffeeGrinder1!");
    	Statement smt = con.createStatement();
    	ResultSet rs = smt.executeQuery(q1);
    	
    	CachedRowSetImpl crs = new CachedRowSetImpl();
        crs.populate(rs);
        System.out.println(crs);
        int i = 1;
        String returned_result = "";
        while(crs.next() && i<=16)
        {
        	returned_result+=crs.getString(i);
        	i++;
        }
        return returned_result;
    }

}
