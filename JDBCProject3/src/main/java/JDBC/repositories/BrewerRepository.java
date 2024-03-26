package JDBC.repositories;

import JDBC.models.Brewer;
import JDBC.models.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class BrewerRepository {
    public List<Brewer> read()
    {
        List<Brewer> results = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            System.out.println("Connection to db is made");
            Statement statement = connection.createStatement();
            String query ="select id,Name,Address,zipcode,city,turnover from brewers";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                System.out.println("Id  " + resultSet.getInt("Id") + " | " +
                        "Name  " + resultSet.getString("name") + " | " +
                        "Address  " + resultSet.getString("Address") + " | " +
                        "ZipCode  " + resultSet.getString("ZipCode") + " | " +
                        "City  " + resultSet.getString("City") + " | " +
                        "Turnover " + resultSet.getInt("Turnover") );

            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }


        return results;
    }

    public void createRecord() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            Statement statement = connection.createStatement();

            String query = "insert into brewers ( id,Name,Address,Zipcode ,City,Turnover)values(127,'AAkash','Etterbeek',1004,'Brussel',1000)";
            statement.executeUpdate(query);
        }
        catch (SQLException e) {
            e.getMessage();
        }
    }

    public void updateRecord()
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            Statement statement = connection.createStatement();

            String query = "update brewers set name = 'Rahul' where Id = 127";
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

            String query = "delete from brewers where Id = 127";
            statement.executeUpdate(query);
        }
        catch(SQLException e)
        {
            e.getMessage();
        }

    }





}
