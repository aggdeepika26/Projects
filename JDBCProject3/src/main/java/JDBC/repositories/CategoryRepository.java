package JDBC.repositories;

import JDBC.models.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    public List<Category> read()
    {
        List<Category> results = new ArrayList<>();
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thebelgianbrewerydb", "deepika", "2024");
            System.out.println("Connection to db is made");
            Statement statement = connection.createStatement();
            //if this

            String query ="select id,category from categories";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next())
            {
                System.out.println("Id  " + resultSet.getInt("Id"));
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


            String query = "insert  into Categories( id,Category)values(66,'Red Wine') ";

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

            String query = "update Categories set category = 'White Wine' where Id = 66";
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

            String query = "delete from categories  where Id = 66";
            statement.executeUpdate(query);
        }
        catch(SQLException e)
        {
            e.getMessage();
        }

    }





}
