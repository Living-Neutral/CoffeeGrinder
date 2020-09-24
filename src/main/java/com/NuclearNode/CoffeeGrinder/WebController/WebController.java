package com.NuclearNode.CoffeeGrinder.WebController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.math.*;
@RestController
public class WebController {
	
	@RequestMapping(value="/CoffeeGrinder/test",method=RequestMethod.GET)
	String testCheck()
	{
		return "CoffeeGrinder Test";
	}
	
	@RequestMapping(value="/CoffeeGrinder/guavatest",method=RequestMethod.GET)
	String guavaCheck()
	{
		
		return String.valueOf(BigIntegerMath.log10(new BigInteger("1000"),  
                RoundingMode.HALF_EVEN));
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

}

*/