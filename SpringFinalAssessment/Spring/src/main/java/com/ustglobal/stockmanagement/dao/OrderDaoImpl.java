package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Order;



@Repository
public class OrderDaoImpl implements OrderDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addOrder(Order order) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean updateOrder(Order order) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Order order1=manager.find(Order.class, order.getOrder_id());
		order1.setOrder_id(order.getOrder_id());
		order1.setTotal_price(order.getTotal_price());
		order1.setTotal_price_with_gst(order.getTotal_price_with_gst());
		transaction.commit();
		return true;

	}

	@Override
	public boolean deleteOrder(int order_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			Order order=manager.find(Order.class,order_id);
			manager.remove(order);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;

		}
	}
	@Override
	public List<Order> getOrderbyId(int order_id) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Order where order_id=:order_id";
		TypedQuery<Order> query=manager.createQuery(jpql, Order.class);
		query.setParameter("order_id", order_id);
		return query.getResultList();
	}


	@Override
	public List<Order> getAllOrder() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Order";
		TypedQuery<Order> query=manager.createQuery(jpql, Order.class);
		return query.getResultList();
	}

}
