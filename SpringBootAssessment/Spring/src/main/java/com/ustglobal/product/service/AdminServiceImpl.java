package com.ustglobal.product.service;

import java.util.List;

import javax.persistence.criteria.Order;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.product.dao.AdminDao;
import com.ustglobal.product.dto.Admin;
import com.ustglobal.product.dto.OrderInfo;
import com.ustglobal.product.dto.Product;


@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao dao;

	@Override
	public Admin adminlogin(int id, String password) {
		if(id<=0 || password==null) {
			return null;
		}else if(password.length()<8){
			return null;
		}
		return dao.adminlogin(id,password);
	}

	@Override
	public boolean addAdmin(Admin bean) {
		if(bean.getPassword()==null) {
			return false;
		}else if(bean.getPassword().length()<8){
			return false;
		}
		return dao.addAdmin(bean);
	}

	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean deleteProduct(int pid) {
		return dao.deleteProduct(pid);
	}

	@Override
	public Product searchProduct(String name) {
		return dao.searchProduct(name);
	}

	@Override
	public boolean modifyProduct(Product product) {
		return dao.modifyProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public boolean addOrder(OrderInfo order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(OrderInfo order) {
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
		
		return dao.getOrderbyId(order_id);
	}

	@Override
	public List<Order> getAllOrder() {
		return dao.getAllOrder();
	}

	

}
