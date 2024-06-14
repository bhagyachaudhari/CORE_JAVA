package org.example.designpatterns.creational.singleton;

import java.util.List;

public class DatabaseConnection {

    String url;
    String DBname;
    String Password;
    List<Integer> pools;

    private static DatabaseConnection dbConn = null;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        //Double check locking
        if(dbConn == null){
            synchronized (DatabaseConnection.class){
                if(dbConn == null){
                    dbConn = new DatabaseConnection();
                }
            }
        }
        return dbConn;
    }
}
