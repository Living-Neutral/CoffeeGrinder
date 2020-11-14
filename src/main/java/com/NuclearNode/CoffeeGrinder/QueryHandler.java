package com.NuclearNode.CoffeeGrinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import org.springframework.stereotype.Service;

import com.sun.rowset.CachedRowSetImpl;

import javax.sql.RowSet;



@Service 
public class QueryHandler 
{

	boolean yesvar = true;
	boolean novar = false;
	CachedRowSetImpl crs ;
	Connection con;
	String query = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink";
	
	QueryHandler()
	{
		try 
		{
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

    void generalAllergy()
	{
		//add first where to path
		query+=" WHERE allergy = " + 0;
	}

	void addDairyQuery()
	{
		//add dairy allergy to query
		query+=" AND dairy = " + String.valueOf(novar);
	}

	void addSoyAllergy(){
		//add soy allergy to query
		query+=" AND soy = " + String.valueOf(novar);
	}

	void addTreeNutsAllergy(){
		//add treenuts allergy to query
		query+=" AND treenuts =  " + String.valueOf(novar);
	}

	void addWheatAllergy() {
		//add wheat allergy to query
		query += " AND wheat = " + String.valueOf(novar);
	}

	void coldTemp(){
		//return cold drinks
		query+=" AND temperature = " + String.valueOf(yesvar);
	}

	void hotTemp(){
		//return hot drinks
		query+=" AND temperature = " + String.valueOf(novar);
	}

	void coffeeDrink(){
		//return all coffee type drinks
		query+=" AND type = \'Coffee\' ";
	}

	void teaDrink(){
		//return all tea type drinks
		query+=" WHERE type = Tea";
	}

	void otherDrink(){
		//return all other type drinks
		query+=" AND type = \'Drink\' ";
	}

	void frapDrink(){
		//return all frappuccinos
		query+=" AND type = \'Frappuccino\' ";
	}

	void espresso(){
		//return drinks containing espresso
		query+=" AND espresso = " + String.valueOf(yesvar);
	}


	void fruity(){
		//return drinks that are fruity
		query+=" AND fruity = " + String.valueOf(yesvar);
	}

	void refresher(){
		//return refresher drinks
		query+=" AND category = \'Starbucks Refresher\' ";
	}

	void coconutMilk(){
		//return drinks that have coconut milk
		query+=" AND category LIKE \'%Coconutmilk%\' ";
	}

	void hotChocolate(){
		//returns hot chocolate drinks
		query+=" AND category = \'Hot Chocolate\' ";
	}

	void juice(){
		//returns juice drinks
		query+=" AND category = \'Juice\' ";
	}

	void steamer(){
		//returns steamer drinks
		query+=" AND category = \'Steamer	\' ";
	}

	void cremeFrap(){
		//returns creme type frappuccinos
		query+=" AND category = \'Creme Frappuccino\' ";
	}

	void coffeeFrap(){
		//returns coffee type frappuccinos
		query+=" AND category = \'Coffee Frappuccino\' ";
	}

	void firstSugar(){
		//returns first level of sugar
		query+=" AND relative_sugar <= 1.5";
	}

	void secondSugar(){
		//returns second level of sugar
		query+= " AND relative_sugar BETWEEN 1.5 AND 2.5";
	}

	void thirdSugar(){
		//returns highest level of sugar
		query+= " AND relative_sugar >= 2.5";
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
				
				sb_drink.setName(crs.getString("name"));
				sb_drink.setDescription(crs.getString("description"));
				sb_drink.setType(crs.getString("type"));
				sb_drink.setCategory(crs.getString("category"));
				sb_drink.setImage(crs.getString("image"));
				sb_drink.setSugar_content(crs.getFloat("sugar_content"));
				sb_drink.setServing_size(crs.getFloat("serving_size"));
				sb_drink.setRelative_sugar(crs.getFloat("relative_sugar"));
				sb_drink.setTemp(crs.getBoolean("temperature"));
				sb_drink.setAllergy(crs.getBoolean("allergy"));
				sb_drink.setDairy(crs.getBoolean("dairy"));
				sb_drink.setSoy(crs.getBoolean("soy"));
				sb_drink.setTree_nuts(crs.getBoolean("treenuts"));
				sb_drink.setEspresso(crs.getBoolean("espresso"));
				sb_drink.setWheat(crs.getBoolean("wheat"));
				sb_drink.setSweetness(crs.getBoolean("sweetness"));
				sb_drink.setFruity(crs.getBoolean("fruity"));
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
			crs.beforeFirst();
		}
		
		catch (Exception e)
		{
			System.err.println(e);
			
		}
		
	}

}
