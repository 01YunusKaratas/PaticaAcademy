package com.patikadev.model;

import com.patikadev.helper.DBconnect;

import java.security.spec.ECField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class course {
    private int id;
    private int user_id;
    private int patika_id;
    private String name;
    private String language;

    private  patika patika1;
    private  User educator1;



    public course(int id, int user_id, int patika_id, String name, String language){
        this.id =id;
        this.user_id=user_id;
        this.patika_id=patika_id;
        this.name=name;
        this.language=language;
        this.patika1= patika.getFetch(patika_id);// burda methodu çağırdık atadık içine çünkü o methodlar bize id ye göre diğer bilgileri dönderiyor
        this.educator1 = User.getFetch(user_id);
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public patika getPatika1() {
        return patika1;
    }

    public void setPatika1(patika patika1) {
        this.patika1 = patika1;
    }

    public User getEducator1() {
        return educator1;
    }

    public void setEducator1(User educator1) {
        this.educator1 = educator1;
    }

    public static ArrayList<course> getListCourse(){
        ArrayList<course> array = new ArrayList<>();
        String query = "SELECT * FROM course ";
        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            course obj;
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int user_id = resultSet.getInt("user_id");
                int patika_id = resultSet.getInt("patika_id");
                String name = resultSet.getString("name");
                String  language = resultSet.getString("language");

                obj= new course(id,user_id,patika_id,name,language);

                array.add(obj);


            }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }

            return  array;
    }

    public static boolean add(int user_id,int patika_id,String name,String language){
        String query = "INSERT INTO course(user_id,patika_id,name,language)VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);

            preparedStatement.setInt(1,user_id);
            preparedStatement.setInt(2,patika_id);
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,language);

            return  preparedStatement.executeUpdate() != -1;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


            return  true;
    }

    public  static  boolean delete(int id){
        String query = "DELETE FROM course WHERE id = ?";

        try {
            PreparedStatement preparedStatement = DBconnect.getInstance().prepareStatement(query);
            preparedStatement.setInt(1,id);
            return  preparedStatement.executeUpdate()!= -1;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
            return true;
    }






}
