package com.ustglobal.empapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	public ArrayList<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			ArrayList <EmployeeBean> result = new ArrayList <EmployeeBean>();



			while(rs.next()) {

				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				result.add(bean);
				//				System.out.println("Id : "+rs.getInt("id"));
				//				System.out.println("Name : "+rs.getString("name"));
				//				System.out.println("Salary : "+rs.getInt("sal"));
				//				System.out.println("Gender : "+rs.getString("gender"));
			}
			return result;

		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {

			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}


	}//end of method

	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			rs= pstmt.executeQuery();

			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));

				return bean;
			}
			else {
				return null;
			}


		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		finally{
			try{
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public int insertEmployeeData(EmployeeBean bean) {
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

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getSal());
			pstmt.setString(4, bean.getGender());

			int count = pstmt.executeUpdate();

			//Step 4 Read the Result.

			return count;
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}

		//Step 5 Close the JDBC Objects
		finally {
			try {
				if(conn != null) {
					conn.close();
				}
				//if(stmt != null) {
				//stmt.close();
				//}

				if(pstmt != null) {
					pstmt.close();
				}
			}
			catch(SQLException e){

				e.printStackTrace();

			}
		}

	}	

	public int updateEmployeeData(EmployeeBean bean1, int id) {
		Connection conn = null;
		//		Statement stmt = null;

		PreparedStatement pstmt = null;

		try {

			//Step 1: Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2: Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3: Issue Sql Query
			String sql = "update employee_info set name=?, sal=?, gender=?  where id=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(4,id);
			pstmt.setString(1,bean1.getName());
			pstmt.setInt(2, bean1.getSal());
			pstmt.setString(3, bean1.getGender());

			int count = pstmt.executeUpdate();
			//Step 4: Read the ResultSet

			return count;
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
				if(pstmt != null) {
					pstmt.close();
				}
				

			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}
	public int deleteEmployeeData(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;


		try {
			//Step 1 Load the Driver
			//		Driver driver = new Driver();
			//		DriverManager.registerDriver(driver);

			Class.forName("com.mysql.jdbc.Driver");

			//Step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL Query
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);




			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();
			//Step 4 Read the Result Set




			return count;


		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
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

} 	//end of ExeccuteInsertQuery
//end of class



