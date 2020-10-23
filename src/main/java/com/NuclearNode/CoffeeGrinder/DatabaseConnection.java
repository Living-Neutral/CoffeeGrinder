package com.NuclearNode.CoffeeGrinder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/starbucks drinks";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "SoberFlorida1!";

    private Connection connection;

    public Connection connect(){
        if(connection == null){
            try {
                Class.forName(DATABASE_DRIVER);
                Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                System.out.print("Database Connected!");
            }
            catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            catch(SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public void Disconnect(){
        if(connection!= null){
            try{
                connection.close();
                connection = null;

            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
