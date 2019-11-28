package com.ustglobal.assignmentapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;



public class DeleteWithTryResource {

	public static void main(String[] args) {

		try (FileReader reader = new FileReader("db.properties")){

			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("delete-query");

			try(Connection conn = DriverManager.getConnection(url,prop);
				
			PreparedStatement stmt = conn.prepareStatement(sql)){
				
				String empid = args[0];
				int id = Integer.parseInt(empid);
				stmt.setInt(1, id);
				
				int count = stmt.executeUpdate();
				System.out.println(count + " Row(s) Updated");
					
				}
			}


		catch(Exception e){
			e.printStackTrace();
		}
	}
}
