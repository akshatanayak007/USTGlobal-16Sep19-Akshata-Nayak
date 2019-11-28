package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery2{

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try {

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//*************STEP 1 : LOAD THE DRIVER*************************

			Class.forName(prop.getProperty("driver-class-name"));

			String url = prop.getProperty("url");        //NoSuitableDriver Exception : URL
			conn = DriverManager.getConnection(url,prop);	


			//Step 3 Issue SQL Query
			String sql = prop.getProperty("insert-query");
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
		}catch(Exception e) {
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
				
				if(reader != null) {
					reader.close();
				}
			}
			catch(Exception e){
					
				e.printStackTrace();
				
			}
		}

	}	//end of main()

} 	//end of ExeccuteInsertQuery
