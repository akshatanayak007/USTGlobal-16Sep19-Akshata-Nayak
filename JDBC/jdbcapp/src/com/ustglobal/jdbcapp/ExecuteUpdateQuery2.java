package com.ustglobal.jdbcapp;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery2 {

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
			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);


			String empid = args[0];
			int id = Integer.parseInt(empid);

			String name = args[1];

			String empsal = args[2];
			int sal = Integer.parseInt(empsal);

			String gender = args[3];

			pstmt.setInt(4,id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);

			int count = pstmt.executeUpdate();
			//Step 4: Read the ResultSet
			System.out.println(count + " Row(s) Updated");

		}
		catch(Exception e) {
			e.printStackTrace();
		}


		//Step 5 Close all the JDBC Object
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



