package com.ustglobal.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.Order;

import org.springframework.stereotype.Repository;

import com.ustglobal.product.dto.Admin;
import com.ustglobal.product.dto.OrderInfo;
import com.ustglobal.product.dto.Product;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	
	
	@Override
	public Admin adminlogin(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		String jpql = "from Admin where id=:id and password=:password";
		TypedQuery<Admin> query = manager.createQuery(jpql,Admin.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			Admin bean = query.getSingleResult();
			return bean;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		

	}


	@Override
	public boolean addAdmin(Admin admin) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			
			transaction.begin();
			manager.persist(admin);
			transaction.commit();
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}

	}
	
	@Override
	public boolean addProduct(Product product) {
			EntityManager manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			try {
				
				transaction.begin();
				manager.persist(product);
				transaction.commit();
				return true;
				
				
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
				return false;
			}
	
	}

	@Override
	public boolean deleteProduct(int pid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Product pro = manager.find(Product.class, pid);
		manager.remove(pro);
		transaction.commit();
		return true;
	}

	@Override
	public Product searchProduct(String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		String jpql = "from Product where name=:name";
		TypedQuery<Product> query = manager.createQuery(jpql,Product.class);
		query.setParameter("name", name);
		try {
			Product bean = query.getSingleResult();
			return bean;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean modifyProduct(Product bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Product pro = manager.find(Product.class, bean.getPid());
		
			pro.setCategory(bean.getCategory());
		pro.setCompany(bean.getCompany());
		pro.setPrice(bean.getPrice());
		pro.setQuantity(bean.getQuantity());
		pro.setName(bean.getName());
	
		
		transaction.commit();
		return true;
	}
	

	@Override
	public List<Product> getAllProducts() {
		String jpql = "from Product";
		
		EntityManager manager= factory.createEntityManager();
		TypedQuery<Product> query = manager.createQuery(jpql,Product.class);
		List<Product> products = query.getResultList();
	
		return products;
	}

	@Override
	public boolean addOrder(OrderInfo order) {
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
	public boolean updateOrder(OrderInfo order) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		OrderInfo order1=manager.find(OrderInfo.class, order.getOid());
		order1.setTotal_price(order.getTotal_price()); 
		order1.setTotal_price_gst(order.getTotal_price_gst());

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