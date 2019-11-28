package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//Step 1: Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2: Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3: Issue Sql Query
			String sql = "update employee_info set name='Akii',sal=777000 where id=1";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4: Read the ResultSet
			System.out.println(count + " Row(s) Updated");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	
		
		//Step 5 Close all the JDBC Object
		finally {
			try {
			if(conn != null) {
				conn.close();
			}
			if(stmt != null) {
				stmt.close();
			}
		
	}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
