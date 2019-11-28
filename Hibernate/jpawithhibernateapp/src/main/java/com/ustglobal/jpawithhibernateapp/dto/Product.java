package com.ustglobal.jpawithhibernateapp.dto;


import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@Column
	private int quantity;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
