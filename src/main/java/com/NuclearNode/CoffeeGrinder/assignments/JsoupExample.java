/*package com.NuclearNode.CoffeeGrinder.assignments;

<<<<<<< HEAD
import java.io.IOException;
=======
import com.NuclearNode.CoffeeGrinder.WebController.Document;
import com.NuclearNode.CoffeeGrinder.WebController.Element;
import com.NuclearNode.CoffeeGrinder.WebController.Elements;
import com.NuclearNode.CoffeeGrinder.WebController.IOException;
import org.jsoup.Jsoup;
>>>>>>> c218f546f506a79bfc21f14d6a634602bba8c273

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

*/