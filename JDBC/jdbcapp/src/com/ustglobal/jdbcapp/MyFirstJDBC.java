package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//*************STEP 1 : LOAD THE DRIVER*************************
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			
			//*************STEP 2 : GET THE CONNECTION*********************//
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";        //NoSuitableDriver Exception : URL
			conn = DriverManager.getConnection(url);																		// Port no:  Communication Failure, Access Denied, Could not Create Connection
			
																																						//			String url = "jdbc:mysql://localhost:3306/ust_ty_db";    
																																						//			conn = DriverManager.getConnection(url, "root", "root");
			
			//************************STEP 3 : ISSUE SQL QUERY************************//
			stmt = conn.createStatement();
			String sql = "select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			
			//***********************STEP 4 : READ THE RESULT************************//
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id :" +id);
				System.out.println("Name : "+name);
				System.out.println("Salaary : "+sal);
				System.out.println("Gender : "+gender);
				System.out.println("************************");
				
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
		//*****************STEP 5 : CLOSE ALL JDBC OBJECT******************//
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}    //end of main

}    //end of MyFirstJDBC
