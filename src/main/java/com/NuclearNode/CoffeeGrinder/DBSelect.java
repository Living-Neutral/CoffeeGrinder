package com.NuclearNode.CoffeeGrinder;

import com.sun.rowset.CachedRowSetImpl;

import javax.sql.rowset.CachedRowSet;
import java.sql.*;
import java.util.Collection;

public class DBSelect {

    public static void main(String args[]){

        String q1 = "SELECT * FROM CoffeeGrinder_drinks.starbucks_drink";

        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://starbucks-drinks-online.ci8dkiszgiw2.us-east-2.rds.amazonaws.com:3299/CoffeeGrinder_drinks",
            "root", "CoffeeGrinder1!");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(q1);
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);
            System.out.println(crs);
            int i = 1;
            Collection sb_drink_test =crs.toCollection();
            
            
            System.out.println(sb_drink_test.toString());
            
            
            while(crs.next() && i<=16)
            {
            	System.out.println(crs.getString(i));
            	i++;
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
