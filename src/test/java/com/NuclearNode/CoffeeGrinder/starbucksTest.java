package com.NuclearNode.CoffeeGrinder;
import org.junit.*;

public class starbucksTest 
{
	private StarbucksDrink sb_d;
	
	@Before
	public void setup()
	{
		sb_d = new StarbucksDrink();
	}
	
	
	@Test
	public void testSetGetCategory()
	{
		sb_d.setCategory("Coffee");
		
	}
	
	@After
	public void cleanUp()
	{
		System.out.println("testing over!\ncleaning up");
	}
	

}
