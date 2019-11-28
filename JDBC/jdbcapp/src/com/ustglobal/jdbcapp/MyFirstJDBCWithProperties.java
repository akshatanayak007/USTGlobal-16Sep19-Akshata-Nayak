package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;

		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//*************STEP 1 : LOAD THE DRIVER*************************
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			
			//*************STEP 2 : GET THE CONNECTION*********************//
			
			String url = prop.getProperty("url");        //NoSuitableDriver Exception : URL
			conn = DriverManager.getConnection(url,prop);																		// Port no:  Communication Failure, Access Denied, Could not Create Connection
			
																																						//			String url = "jdbc:mysql://localhost:3306/ust_ty_db";    
																																						//			conn = DriverManager.getConnection(url, "root", "root");
			
			//************************STEP 3 : ISSUE SQL QUERY************************//
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
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
		catch(Exception e){
			
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
				if(reader != null) {
					reader.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}    //end of main

}    //end of MyFirstJDBC
