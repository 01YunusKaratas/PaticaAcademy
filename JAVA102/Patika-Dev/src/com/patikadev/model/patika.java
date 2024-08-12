package com.patikadev.model;

import com.patikadev.helper.DBconnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class patika {
    private String name;
    private  int id;

    //constructor
    public  patika(String name,int id){
        this.name = name;
        this.id = id;

    }

    public patika() {

    }

    //Show in the panel
    public static ArrayList<patika> getList(){
        ArrayList<patika> array = new ArrayList<>();
        String query ="SELECT * FROM patika";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query); //Create object for database
            ResultSet resultSet = preparedStatement.executeQuery();//Because we take aknowledge from database
            patika obj;
            while (resultSet.next()){
                obj = new patika();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                array.add(obj);


            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  array;
    }

    //patika addeed
    public static  boolean addPatika(String  name){
        String query = "INSERT INTO patika(name) VALUES(?)";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);

            preparedStatement.setString(1,name.trim().toUpperCase());
            return  preparedStatement.executeUpdate() != -1;

        }catch (Exception e){
            System.out.println(e.getMessage());

        }
            return  true;
    }
    public static boolean deletePatika(int id) {
        String query = "DELETE FROM patika WHERE id = ?";

        try {
            // Önce ID'nin var olup olmadığını kontrol et
            String checkQuery = "SELECT * FROM patika WHERE id = ?";
            PreparedStatement checkStmt = DBconnect.getInstance().prepareStatement(checkQuery);
            checkStmt.setInt(1, id);
            ResultSet resultSet = checkStmt.executeQuery();

            if (resultSet.next()) {
                // ID mevcut, silme işlemini yap
                PreparedStatement deleteStmt = DBconnect.getInstance().prepareStatement(query);
                deleteStmt.setInt(1, id);
                return deleteStmt.executeUpdate() > 0;
            } else {
                // ID mevcut değil
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
    public static patika getFetch(int id) {
        String query = "SELECT * FROM patika WHERE id = ?";


        patika obj = null;
        try {
            // Prepare statement with the query
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);

            // Set the parameter
            preparedStatement.setInt(1, id);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();//sonuç yazdırıcaksak executequery

            // Process the result set
            if (resultSet.next()) {
                obj = new patika();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
            }

            // Close the result set
            resultSet.close();

            // Close the prepared statement
            preparedStatement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return obj;
    }
    public static boolean updatePatika(int id,String name){
        ArrayList<patika> arry = new ArrayList<>();

        String query = "UPDATE patika SET name =? WHERE id =?";
        try {

            try (PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query)) {

                preparedStatement.setString(1, name.trim());
                preparedStatement.setInt(2,id);

                return preparedStatement.executeUpdate() != -1;
            }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }

        return  true;
    }









    //Setter and Getter Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
