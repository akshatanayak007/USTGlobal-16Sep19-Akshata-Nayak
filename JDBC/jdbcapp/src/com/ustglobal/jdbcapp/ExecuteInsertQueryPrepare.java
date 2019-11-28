package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQueryPrepare{

	public static void main(String[] args) {

		Connection conn = null;
																															//Statement stmt = null;//
		PreparedStatement pstmt = null;

		try {

			//Step 1 Load the Driver.
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);

			//Step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL Query
			
			//stmt = conn.createStatement();
			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String salary = args[2];
			int sal =Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the Result.
			System.out.println(count + " Row(s) Inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Step 5 Close the JDBC Objects
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
//				if(stmt != null) {
//					stmt.close();
//				}
				
				if(pstmt != null) {
					pstmt.close();
				}
			}
			catch(SQLException e){
					
				e.printStackTrace();
				
			}
		}

	}	//end of main()

} 	//end of ExeccuteInsertQuery
