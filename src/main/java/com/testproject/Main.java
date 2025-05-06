package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private Connection get_Db_connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","");
            System.out.println("Database is connected.");
        }
        catch (ClassNotFoundException ce){
            System.out.println(ce.getMessage());
        }
        catch (SQLException se){
            se.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//            }
//        int i = 10;
//        if(i > 0){
//            System.out.println("i>10");
//        }
//        else {
//            System.out.println("i");
//        }
//
//        for (int j = 0; j< 5; j++){
//
//        }
//
//        int [] k = new int[10];
//        for(int a:k){
//
//        }
// 1. Connection
// 2. Statement (statement mhr data swl htoke yin no3 shi ml, insert, delete, update so yon no3 ma shi pr)
// 3. Resultset
// 4. Close
    Main m = new Main();
    Connection con = m.get_Db_connection();
    try{
        con.close();
        System.out.println("Connection is closed.");
    }
    catch (Exception ex){
        ex.printStackTrace();
    }
    }
}