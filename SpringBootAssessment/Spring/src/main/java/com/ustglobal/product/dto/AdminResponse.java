package com.ustglobal.product.dto;

import java.util.List;





public class AdminResponse {
	
	private int statuscode;
	private String message;
	private String description;
	private List<Product> product;
	private List<OrderInfo> order;
	private List<Admin> admin;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<OrderInfo> getOrder() {
		return order;
	}
	public void setOrder(List<OrderInfo> order) {
		this.order = order;
	}
	public List<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}
	

}
