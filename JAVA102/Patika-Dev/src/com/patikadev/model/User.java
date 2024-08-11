package com.patikadev.model;

import com.patikadev.helper.DBconnect;
import com.patikadev.view.OperatorGUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.security.spec.ECField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String user_name;
    private String password;
    private String user_type;

    //Constructor
    public User(int id, String name, String user_name, String password, String user_type) {
        this.name = name;
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.user_type = user_type;
    }

    //Constructor2
    public User() {

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

    public static ArrayList<User> getUserList() {
        ArrayList<User> arrayList = new ArrayList<>();
        String query = "SELECT * FROM user";
        try {
            Statement statement = DBconnect.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(query); //always will be for database
            User obj;
            while (resultSet.next()) {
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

    public static boolean add(String name, String user_name, String password, String user_type) {

        User copyUser = User.getFetch(user_name);
        if (copyUser != null) {
            JOptionPane.showMessageDialog(null, "There is same user_name !!!");
            return false;
        }

        String query = "INSERT INTO user(name,user_name,password,user_type) VALUES(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, user_name);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, user_type);


            return preparedStatement.executeUpdate() != -1; // atamayı yaptık


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return true;
    }

    // This method provides controll that find to same user_name in database
    public static User getFetch(String user_name) {
        User obj = null;
        String query = "SELECT * FROM user WHERE user_name =?";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);
            preparedStatement.setString(1, user_name); //nesne oluşturup 1.indeczine ekle dedik
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUser_name(resultSet.getString("user_name"));
                obj.setPassword(resultSet.getString("password"));
                obj.setUser_type(resultSet.getString("user_type"));


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return obj;

    }

    //delete userID
    public static boolean delete(int id) {
        // Silme işlemi için doğru SQL komutu
        String query = "DELETE FROM user WHERE id = ?";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);
            preparedStatement.setInt(1, id);
            // executeUpdate() ile etkilenilen kayıt sayısını al
            int affectedRows = preparedStatement.executeUpdate();
            // Eğer en az bir kayıt silindiyse, başarıyla silinmiş demektir
            return affectedRows > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean update(int id, String name, String user_name, String password, String user_type) {
        String query = "UPDATE user SET name = ?,user_name = ?,password =?,user_type =? WHERE id =?"; //Update query for database
        User copyUser = User.getFetch(user_name);
        if (copyUser != null && copyUser.getId() != id) {
            JOptionPane.showMessageDialog(null, "There is same user_name !!!");
            return false;
        }
        String[] arry = {"student", "educator", "operator"}; // bunlar olabilir değişitirmek istedikllerimiz
        if (user_type.equals(arry[0]) || user_type.equals(arry[1]) || user_type.equals(arry[2])) {
            JOptionPane.showMessageDialog(null, "");
        } else {
            JOptionPane.showMessageDialog(null, "There is not type,Type is not change!!! ");
        }


        try {
            PreparedStatement pr = DBconnect.getInstance().prepareStatement(query);
            pr.setString(1, name.trim());
            pr.setString(2, user_name.trim());
            pr.setString(3, password.trim());
            pr.setString(4, user_type.trim());
            pr.setInt(5, id);
            return pr.executeUpdate() != -1;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return true;
    }

    public static ArrayList<User> searchUser(String query) {
        ArrayList<User> arry = new ArrayList<>();// create arrayList


        // Elemanları tekrardan arrayliste ekledik.

        try {
            Statement statement = DBconnect.getInstance().createStatement();
            ResultSet resultSet = statement.  executeQuery(query); //always will be for database
            User obj;
            while (resultSet.next()){
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUser_name(resultSet.getString("user_name"));
                obj.setPassword(resultSet.getString("password"));
                obj.setUser_type(resultSet.getString("user_type"));
               arry.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        return  arry;
    }

    public static String searchQuery(String name, String user_name, String user_type) {
        String query = "SELECT * FROM user WHERE user_name LIKE '%{{user_name}}%' AND name LIKE '%{{name}}%' AND user_type LIKE '%{{user_type}}%'";
        query = query.replace("{{name}}", name.trim());
        query = query.replace("{{user_name}}", user_name.trim());
        query = query.replace("{{user_type}}", user_type.trim());

        return query;
    }

}
