package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Press 1 to get all the employee details");
		System.out.println("Press 2 to insert the employee data ");
		System.out.println("Press 3 to update the employee data ");
		System.out.println("Press 4 to delete the employee data ");
		System.out.println("Press 5 to search the employee data ");
		
	
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		
		
		switch(ch) {
		
		case 1:
					EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
					List<EmployeeBean> result = dao.getAllEmployeeData();
					
					for(EmployeeBean bean : result) {
						System.out.println("name: "+bean.getName());
						System.out.println("Id : "+bean.getId());
						System.out.println("Gender : "+bean.getGender());
						System.out.println("Salary : "+bean.getSal());
					}
					
					break;
					
		case 2:
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			bean2.setId(scn.nextInt());
			bean2.setName(scn.next());
			bean2.setSal(scn.nextInt());
			bean2.setGender(scn.next());
			
			int count = dao2.insertEmployeeData(bean2);
			System.out.println(count + " Row(s) Inserted");
			break;
	
		case 3:
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean3 = new EmployeeBean();
			
			bean3.setName(scn.next());
			bean3.setSal(scn.nextInt());
			bean3.setGender(scn.next());
			
			int id1 = scn.nextInt();
			
			int count1 = dao3.updateEmployeeData(bean3, id1);
			System.out.println(count1 + " Row(s) Updated");
			break;
			
		case 4:
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			int id2 = scn.nextInt();
			int count2 = dao4.deleteEmployeeData(id2);
			System.out.println(count2 + " Row(s) Updated");
			break;
			
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id4 = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id4);
			if(bean != null) {
				System.out.println("Name: "+bean.getName());
				System.out.println("Id : "+bean.getId());
				System.out.println("Gender : "+bean.getGender());
				System.out.println("Salary : "+bean.getSal());
			}else {
				System.out.println("No data found");
			}
			break;
		}

	}//end of main

}//end of class
