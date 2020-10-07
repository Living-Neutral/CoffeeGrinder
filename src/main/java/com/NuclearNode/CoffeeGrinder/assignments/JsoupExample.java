/*package com.NuclearNode.CoffeeGrinder.assignments;

import com.NuclearNode.CoffeeGrinder.WebController.Document;
import com.NuclearNode.CoffeeGrinder.WebController.Element;
import com.NuclearNode.CoffeeGrinder.WebController.Elements;
import com.NuclearNode.CoffeeGrinder.WebController.IOException;
import org.jsoup.Jsoup;

public class JSoupExample{
	
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