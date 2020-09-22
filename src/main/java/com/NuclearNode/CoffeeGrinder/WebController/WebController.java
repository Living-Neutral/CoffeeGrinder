package com.NuclearNode.CoffeeGrinder.WebController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@RequestMapping(value="/CoffeeGrinder/test",method=RequestMethod.GET)
	String testCheck()
	{
		return "CoffeeGrinder Test";
	}

}
