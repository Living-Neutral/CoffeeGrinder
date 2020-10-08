package com.NuclearNode.CoffeeGrinder.assignments;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupExample{
	
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

