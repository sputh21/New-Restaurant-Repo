package com.example;
import java.sql.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        String username=null;
        String password=null;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        username=scan.nextLine();
        System.out.println("Enter the password");
        password=scan.nextLine();

        
        //Class.forName("com.mysql.cj.jdbc.Driver");

        int loopCond = 0;

        while(loopCond!=5){
            System.out.println("What do you want to do:\n1. Print Menu\n2. Add Restaurant\n3. Add a dish\n4. Order\n5. Exit");
            loopCond=scan.nextInt();
            if(loopCond==1){
                System.out.print("\n");
                methods.printMenu(username, password);
                System.out.print("\n");
            }
            if(loopCond==2){
                methods.addRestaurant(username,password);
            }
            if(loopCond==3){
                methods.addDish(username, password);
            }
            if(loopCond==4){
                
            }
        }
        
        


    }
}
