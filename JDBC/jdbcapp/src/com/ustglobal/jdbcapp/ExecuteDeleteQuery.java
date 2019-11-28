package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			//Step 1 Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL Query
			String sql = "delete from employee_info where id=1";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the Result Set
			System.out.println(count + " Row(s) Affected");
			
			
			
			
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
//Step 5 Close all the JDBC Objetcs
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
