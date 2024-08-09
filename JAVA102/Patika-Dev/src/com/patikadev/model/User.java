package com.patikadev.model;

import com.patikadev.helper.DBconnect;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private  int id;
    private  String name;
    private  String user_name;
    private  String password;
    private  String user_type;

    //Constructor
    public User(int id,String name,String user_name,String password,String user_type){
        this.name = name;
        this.id = id;
        this.user_name =user_name;
        this.password = password;
        this.user_type =user_type;
    }

    //Constructor2
    public  User(){

    }

    //Setter and Getter method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public static ArrayList<User> getUserList(){
        ArrayList<User> arrayList = new ArrayList<>();
        String query = "SELECT * FROM user";
        try {
            Statement statement = DBconnect.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(query); //always will be for database
            User obj;
            while (resultSet.next()){
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUser_name(resultSet.getString("user_name"));
                obj.setPassword(resultSet.getString("password"));
                obj.setUser_type(resultSet.getString("user_type"));
                arrayList.add(obj);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }


}
