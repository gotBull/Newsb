package com.futurenews.newsb.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConGenerator {
    String password = "12345";
    String username = "root";
    String cstring = "jdbc:mariadb://127.0.0.1/webdb";
    public DBConGenerator()
    {
        try
        {
            Class.forName("org.mariadb.jdbc.Driver");
        }
        catch(Exception e)
        {}
    }

    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection(username,password,cstring);
            return con;
        }
        catch (Exception e)
        {return null;}
    }
//    Connection getConnection(){
//        throw new UnsupportedOperationException("not supported yet");
//    }
}


