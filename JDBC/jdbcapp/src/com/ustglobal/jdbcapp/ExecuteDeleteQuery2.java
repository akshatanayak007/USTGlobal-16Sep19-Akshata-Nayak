package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery2 {
	
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
			String sql = prop.getProperty("delete-query");
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
				if(reader != null) {
					reader.close();
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}


}
