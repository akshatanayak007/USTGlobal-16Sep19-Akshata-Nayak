package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ustglobal.stockmanagement.dao.OrderDao;
import com.ustglobal.stockmanagement.dto.Order;


@Service
@Transactional
public class OrderServiceImpl  implements OrderService{

	@Autowired
	private OrderDao dao;
	
	@Override
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.addOrder(order);
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.updateOrder(order);
	}

	@Override
	public boolean deleteOrder(int order_id) {
		// TODO Auto-generated method stub
		return dao.deleteOrder(order_id);
	}

	@Override
	public List<Order> getOrderbyId(int order_id) {
		// TODO Auto-generated method stub
		return dao.getOrderbyId(order_id);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return dao.getAllOrder();
	}

}
