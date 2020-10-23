package com.NuclearNode.CoffeeGrinder;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {

    @Autowired
    private StarBucksDrinkRepo drinkRepository;
    
    @Autowired
    private StarbucksDrinkService starbucks_drink_service;



    @GetMapping(path="/all")
    public @ResponseBody Iterable<StarbucksDrink> getAllDrinks(){
        return drinkRepository.findAll();
    }
    
    
    @RequestMapping("/CoffeeGrinder/StarbucksDrinks")
    public List<StarbucksDrink> getAllStarBucksDrinks()
    {
    	return starbucks_drink_service.getAllStarBucksDrinks();
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/CoffeeGrinder/StarbucksDrinks")
    public void addDrink(@PathVariable String id,@RequestBody StarbucksDrink sbD)
    {
    	starbucks_drink_service.updateStarBucksDrink(id, sbD);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteDrink(@PathVariable String id) 
    {
    	starbucks_drink_service.deleteStarbucksDrink(id);
    }

}
