package com.ustglobal.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//Step 1 Load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL Query
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);
			
			
	
	
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			//Step 4 Read the Result Set
			System.out.println(count + " Row(s) Affected");
			
			
			
			
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
//Step 5 Close all the JDBC Objetcs
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
