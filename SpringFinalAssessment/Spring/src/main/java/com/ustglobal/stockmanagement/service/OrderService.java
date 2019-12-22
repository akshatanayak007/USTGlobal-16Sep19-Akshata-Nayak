package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Order;



public interface OrderService {
	public boolean addOrder(Order order);
	public boolean updateOrder(Order order);
	public boolean deleteOrder(int order_id);
	public List<Order> getOrderbyId(int order_id);
	public List<Order> getAllOrder();

}
