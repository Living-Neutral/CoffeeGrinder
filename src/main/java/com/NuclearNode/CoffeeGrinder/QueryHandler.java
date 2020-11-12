package com.NuclearNode.CoffeeGrinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sun.rowset.CachedRowSetImpl;

@Service 
public class QueryHandler 
{
	String database_name;
	CachedRowSetImpl crs ;
	Connection con;
	String query = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink";
	
	QueryHandler()
	{
		try 
		{
			String q1 = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink";
			con = DriverManager.getConnection("jdbc:mysql://starbucks-drinks-online.ci8dkiszgiw2.us-east-2.rds.amazonaws.com:3299/CoffeeGrinder_drinks",
		            "root", "CoffeeGrinder1!");
			crs = new CachedRowSetImpl();
		    createCRS();
		}
		
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
	
    String getQuery()
    {
    	return this.query;
    }

	void addDairyQuery()
	{

		query+=" WHERE dairy = 1 ";
	}

	void addSoyAllergy(){
		//add soy allergy to query
		query+=" WHERE soy = 1 ";
	}

	void addTreeNutsAllergy(){
		//add treenuts allergy to query
		query+=" WHERE treenuts = 1 ";
	}

	void addWheatAllergy(){
		//add soy allergy to query
		query+=" WHERE wheat = 1 ";

	}

	void coldTemp(){
		//return cold drinks
		query+=" WHERE temperature = \'True\' ";
	}

	void hotTemp(){
		//return hot drinks
		query+=" WHERE temperature = \'False\' ";
	}

	void coffeeDrink(){
		//return all coffee type drinks
		query+=" WHERE type = \'Coffee\' ";
	}

	void teaDrink(){
		//return all tea type drinks
		query+=" WHERE type = \'Tea\' ";
	}

	void otherDrink(){
		//return all other type drinks
		query+=" WHERE type = \'Drink\' ";
	}

	void frapDrink(){
		//return all frappuccinos
		query+=" WHERE type = \'Frappuccino\' ";
	}

	void espresso(){
		//return drinks containing espresso
		query+=" WHERE espresso = 1 ";
	}


	void fruity(){
		//return drinks that are fruity
		query+=" WHERE fruity = 1 ";
	}

	void nonFruity(){
		query+=" WHERE fruity = 0 ";
	}

	void refresher(){
		//return refresher drinks
		query+=" WHERE category = \'Starbucks Refresher\' ";
	}

	void coconutMilk(){
		//return drinks that have coconut milk
		query+=" WHERE category LIKE \'%Coconutmilk%\' ";
	}

	void hotChocolate(){
		//returns hot chocolate drinks
		query+=" WHERE category = \'Hot Chocolate\' ";
	}

	void juice(){
		//returns juice drinks
		query+=" WHERE category = \'Juice\' ";
	}

	void steamer(){
		//returns steamer drinks
		query+=" WHERE category = \'Steamer	\' ";
	}

	void cremeFrap(){
		//returns creme type frappuccinos
		query+=" WHERE category = \'Creme Frappuccino\' ";
	}

	void coffeeFrap(){
		//returns coffee type frappuccinos
		query+=" WHERE category = \'Coffee Frappuccino\' ";
	}


	
	void queryTest()
	{
		String q1 = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink WHERE ";
		try {
			Statement smt2 = con.createStatement();
			ResultSet rs = smt2.executeQuery(q1);
			crs.populate(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	void createCRS()
	{
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(query);
			crs.populate(rs);
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	List <StarbucksDrink> makeSBOrder()
	{
		List<StarbucksDrink> list_of_sb_drinks = new ArrayList<StarbucksDrink>();
		try {
			while(crs.next())
			{
				StarbucksDrink sb_drink = new StarbucksDrink();
				
				sb_drink.setName(crs.getString(1));
				sb_drink.setDescription(crs.getString(2));
				sb_drink.setType(crs.getString(3));
				sb_drink.setTemp(crs.getString(4));
				sb_drink.setCategory(crs.getString(5));
				sb_drink.setImage(crs.getString(6));
				sb_drink.setSugar_content(crs.getFloat(7));
				sb_drink.setServing_size(crs.getFloat(8));
				sb_drink.setRelative_sugar(crs.getFloat(9));
				sb_drink.setDairy(crs.getBoolean(10));
				sb_drink.setSoy(crs.getBoolean(11));
				sb_drink.setTree_nuts(crs.getBoolean(12));
				sb_drink.setEspresso(crs.getBoolean(13));
				sb_drink.setWheat(crs.getBoolean(14));
				sb_drink.setSweetness(crs.getBoolean(15));
				sb_drink.setFruity(crs.getBoolean(16));
				list_of_sb_drinks.add(sb_drink);
			}
			resetCachedSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_of_sb_drinks;
	}
	
	
	
	
	String cachedrowtest()
	{
		String crs_info = "";
		
		try 
		{
			while(crs.next())
			{
				for(int i = 1;i<17;i++)
				{
					crs_info+=crs.getString(i);
					
				}
				crs_info+="\n";
				crs_info+="\n";
			}
			
			resetCachedSet();
			return crs_info;
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
			
		}
		
		return "";
	}
	
	
	
	String returnDrinkInfo()
	{
		int i = 1;
		String drink_info = "";
		try {
			while(crs.next() && i<=16)
			{
				drink_info+= crs.getString(i); 
			}
			
			return drink_info;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Couldn't find it";
	}
	
	@SuppressWarnings("restriction")
	void resetCachedSet() 
	{
		try 
		{
			crs = (CachedRowSetImpl) crs.getOriginal();
		}
		
		catch (Exception e)
		{
			System.err.println(e);
			
		}
		
	}

}
