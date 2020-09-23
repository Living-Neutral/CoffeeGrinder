package com.NuclearNode.CoffeeGrinder.WebController;
package com.mkyong

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@RestController
public class WebController {
	
	@RequestMapping(value="/CoffeeGrinder/test",method=RequestMethod.GET)
	String testCheck()
	{
		return "CoffeeGrinder Test";
	}
	
}
	
public class JSoupExample{
	
	public static void main(String[] args) {
		Document doc;
		try {
			
			doc = JSoup.connect("http://google.com").get();
			
			String title = doc.title;
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


