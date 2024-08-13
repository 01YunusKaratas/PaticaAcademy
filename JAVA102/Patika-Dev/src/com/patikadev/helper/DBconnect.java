package com.patikadev.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {

    private Connection connect =null;


    public Connection connectDb() {
        try {
            this.connect = DriverManager.getConnection(config.DB_URL, config.DB_USER, config.DB_PASSWORD);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return  this.connect;
    }

    //burada sınıftan bir nesne üretiyoruz ve o sınıfın methodunu çağırıyoz dimi
   public static Connection getInstance(){
        DBconnect db =new DBconnect();

        return  db.connectDb();
   }
}
