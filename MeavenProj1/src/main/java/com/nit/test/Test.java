package com.nit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test 
{
    public static void main( String[] args )
    {
        try(Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","c##biswajit","2538");
        		PreparedStatement ps=con.prepareStatement("Select * from student");
        		ResultSet rs=ps.executeQuery()){
        	while(rs.next()) {
        		System.out.println(rs.getString(1)+""+rs.getString(2)+"  "+rs.getString(1));
        		
        	}
        	
        	
        }
        catch(SQLException se) {
        	se.printStackTrace();
        }
    }
}
