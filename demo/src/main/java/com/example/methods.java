package com.example;
import java.sql.*;
import java.util.*;


public class methods {


    public static void printMenu(String username, String password) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurants",username, password);
        Statement stmt = con.createStatement();
        Scanner scan = new Scanner(System.in);
        System.out.println("Which restaurant menu do you want to look at?");
        String resName = scan.next();
        ResultSet rst = stmt.executeQuery("select * from " + resName);
        while(rst.next()){
            System.out.println(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getDouble(3));
        }
        con.close();
    }    

    public static void addRestaurant(String username, String password)throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurants",username, password);
        Statement stmt = con.createStatement();  
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the name of the restaurant");
        String resName = scan.nextLine();
        String addTable = "create table " + resName + "(keyOf INT primary key, dishName varchar(30), dishPrice float(5,2))";
        stmt.executeUpdate(addTable);
        con.close();
    }

    public static void addDish(String username, String password) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurants",username, password);
        Statement stmt = con.createStatement(); 
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int key = rand.nextInt(1000);
        System.out.println("What is the name of the dish");
        String name = scan.nextLine();
        System.out.println("What is the price of the dish");
        double price = scan.nextDouble();
        System.out.println("What is the name of the restaurant to add to");
        String resName = scan.next();
        String sqlStmt = "INSERT INTO " + resName +  " VALUES(" + key + ", " + "'" + name + "'" + ", " + price + ")";
        System.out.println(sqlStmt);
        stmt.executeUpdate(sqlStmt);
        String sql2 = "select * from " + resName + "order by dishName DESC";
        System.out.println(sql2);
    }
    public static void order(String username, String password)throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurants",username, password);
        Statement stmt = con.createStatement(); 
        Scanner scan = new Scanner(System.in);
        int totalPrice=0;
        String totalOrder = null;
        
    }
}
