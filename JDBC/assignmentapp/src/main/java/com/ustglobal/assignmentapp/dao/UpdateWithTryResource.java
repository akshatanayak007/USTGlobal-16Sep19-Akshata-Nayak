package com.ustglobal.assignmentapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class UpdateWithTryResource {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("db.properties")){

			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");

			try(Connection conn = DriverManager.getConnection(url,prop);
				
			PreparedStatement stmt = conn.prepareStatement(sql)){
				
				String empid = args[4];
				int id = Integer.parseInt(empid);
				stmt.setInt(1, id);
				
				String name = args[1];
				stmt.setString(2, name);
				
				stmt.setInt(3, Integer.parseInt(args[2]));
				
				stmt.setString(4, args[3]);
				
				int count = stmt.executeUpdate();
				System.out.println(count + " Row(s) Updated");
					
				}
			}


		catch(Exception e){
			e.printStackTrace();
		}
	}
}
