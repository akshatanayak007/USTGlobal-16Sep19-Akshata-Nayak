package com.ustglobal.product.dao;

import java.util.List;

import javax.persistence.criteria.Order;

import com.ustglobal.product.dto.Admin;
import com.ustglobal.product.dto.OrderInfo;
import com.ustglobal.product.dto.Product;

public interface AdminDao {
	
	public Admin adminlogin(int id, String password);
	
	public boolean addAdmin(Admin admin);
	
	public boolean addProduct(Product product);
	
	public boolean deleteProduct(int pid);
	
	public Product searchProduct(String name);
	
	public boolean modifyProduct(Product product);
	
	public boolean addOrder(OrderInfo order);
	
	public boolean updateOrder(OrderInfo order);
	
	public boolean deleteOrder(int order_id);
	
	public List<Order> getOrderbyId(int order_id);
	public List<Order> getAllOrder();
	
//	public boolean orderProduct(Order order);
	
	public List<Product> getAllProducts();

}
