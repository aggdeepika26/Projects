package JDBC.repositories;

import JDBC.models.Beer;
import JDBC.models.Brewer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BeerRepository
{

    public List<Beer> read()

    {
        List<Beer> results = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            System.out.println("Connection to db is made");
            Statement statement = connection.createStatement();
            //if this

            String query = "select id,Name,BrewerId,CategoryId,Price,Stock,Alcohol from beers";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                System.out.println("Id  " + resultSet.getInt("Id") + " | " +
                        "Name  " + resultSet.getString("name") + " | " +
                        "BrewerId " + resultSet.getString("BrewerId") + " | " +
                        "CategoryId  " + resultSet.getString("CategoryId") + " | " +
                        "Price " + resultSet.getString("Price") + " | " +
                        "Stock" + resultSet.getInt("Stock") + "  |  " +
                        "Alcohol " + resultSet.getInt("Alcohol")
                );


            }
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());
        }
        return  results;
    }


    public void createRecord() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            Statement statement = connection.createStatement();

            String query = "insert into  Beers( id,Name,BrewerId,CategoryId,Price,Stock,Alcohol)values(1557,'AA',100,78,4,10,5)";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.getMessage();
        }
    }

        public void updateRecord()
        {
            try
            {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
                Statement statement = connection.createStatement();

                String query = "update  Beers set name = 'BB' where Id = 1557";
                statement.executeUpdate(query);
            }
            catch(SQLException e)
            {
                e.getMessage();
            }

        }


    public void deleteRecord()
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            Statement statement = connection.createStatement();

            String query = "delete from beers where Id = 1557";
            statement.executeUpdate(query);
        }
        catch(SQLException e)
        {
            e.getMessage();
        }

    }






    }