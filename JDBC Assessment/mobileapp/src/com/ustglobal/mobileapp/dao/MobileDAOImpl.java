package com.ustglobal.mobileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;


public class MobileDAOImpl {
	String url="jdbc:mysql://localhost:3306/ContactFile?user=root&password=root";
	
	
	public void showAllContacts() {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			String sql="select * from contact";
			try(Connection con=DriverManager.getConnection(url);
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(sql)) {
					while (rs.next()) {
						System.out.println("Name="+rs.getString("name"));
						System.out.println("Number="+rs.getInt("number"));
						System.out.println("Groups="+rs.getString("groups"));
						System.out.println("*******************************");
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void search(String name) {
		String sql="select * from contact where name=?";
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url);
					PreparedStatement st=con.prepareStatement(sql) ){
					st.setString(1, name);					
					try(ResultSet rs=st.executeQuery()) {
						Scanner sc=new Scanner(System.in);
						if(rs.next()) {
							String name1=rs.getString("name");
							System.out.println("Press 1 to Call "+name1);
							System.out.println("Press 2 to Message "+name1);
							System.out.println("Press 3 to go back Main Menu");
							int i=sc.nextInt();
							switch (i) {
							case 1:
								System.out.println("Calling to "+name+" ......");
								System.out.println("Press any key to end the call");
								try {
									System.in.read();
								} catch (Exception e) {
									e.printStackTrace();
								}
								break;
							case 2:
								Scanner scn = new Scanner(System.in);
								System.out.println("Print any Message");
								String msg = scn.next();
								System.out.println("Messaging to "+name);
								System.out.println("Your Message is ");
								System.out.println(msg);
								System.out.println("Message sent to "+name);
								break;
							case 3:
								break;
							default:
								System.out.println("invalid choice");
								break;
							}
						}else {
							System.out.println("name not found");
						}
					} catch (Exception e) {

						e.printStackTrace();
					}
				
					}catch (Exception e) {
						e.printStackTrace();
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	public void operateOnContacts() {
		String Insert_Sql="insert into contact values(?,?,?)";
		String Delete_Sql="delete from contact where name=?";
		String Update_Sql="update contact number=?, groups=? where name=?";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url)) {
					System.out.println("press 1 add contact");
					System.out.println("press 2 delete contact");
					System.out.println("press 3 edit contact");
					Scanner sc=new Scanner(System.in);
					int ch=sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter Name");
						String name=sc.next();
						System.out.println("Enter Number");
						long num=sc.nextLong();
						System.out.println("Enter Gorup");
						String group=sc.next();
						try(PreparedStatement pstmt=con.prepareStatement(Insert_Sql)) {
							pstmt.setString(3, name);
							pstmt.setLong(1, num);
							pstmt.setString(2, group);
							int count=pstmt.executeUpdate();
							System.out.println(count+" rows inserted");
						} catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 2:
						System.out.println("enter name to delete from contact");
						
						String name2=sc.next();
						try(PreparedStatement pst=con.prepareStatement(Delete_Sql)){
							pst.setString(1, name2);
							int delete=pst.executeUpdate();
							System.out.println(delete+" rows deleted");
						}catch (Exception e) {
							e.printStackTrace();
						}
						break;
					case 3:
						
						
						System.out.println("enter name for update");
						String name3=sc.next();
						System.out.println("enter number for change existing number");
						long number=sc.nextInt();
						System.out.println("Enter group name for change existing group");
						String groups=sc.next();
						try(PreparedStatement pst=con.prepareStatement(Update_Sql)){
							pst.setLong(1, number);
							pst.setString(2, groups);
							pst.setString(3, name3);
							
							int update = pst.executeUpdate();
							System.out.println(update+" rows updated");
						}catch (Exception e) {
						e.printStackTrace();
						}
					default:
						System.out.println("invalid choice");
						break;
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
