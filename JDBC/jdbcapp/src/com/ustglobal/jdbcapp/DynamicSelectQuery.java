package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	
	public static void main(String[] args) {
		
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet re = null;
		try {
			//Step 1 Load the Driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Step 2 Get the connection
		conn = DriverManager.getConnection(url);
		
		//Step 3 Issue sql query
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		re = pstmt.executeQuery();
		
		//Step4 Read the Result Set
		if(re.next()) {
			
			int emp_id = re.getInt("id");
			String name = re.getString("name");
			int sal = re.getInt("sal");
			String gender = re.getString("gender");
			
			System.out.println("Id is "+emp_id);
			System.out.println("Name is "+name);
			System.out.println("Salary is "+sal);
			System.out.println("Gender is "+gender);
			
			
			
		}
		
		
		
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(re != null) {
					re.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
