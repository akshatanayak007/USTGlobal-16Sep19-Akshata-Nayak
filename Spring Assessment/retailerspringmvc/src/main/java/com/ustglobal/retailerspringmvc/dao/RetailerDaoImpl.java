package com.ustglobal.retailerspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.retailerspringmvc.dto.RetailerBean;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public RetailerBean login(int retailer_id, String password) {
		String jpql="from RetailerBean where id=:id and password=:password";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<RetailerBean> query=manager.createQuery(jpql,RetailerBean.class);
		query.setParameter("retailer_id", retailer_id);
		query.setParameter("password", password);
		try {
			RetailerBean bean=query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	@Override
	public int createProfile(RetailerBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getRetailer_id();
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public boolean deleteRetailer(int retailer_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		RetailerBean bean=manager.find(RetailerBean.class, retailer_id);
		manager.remove(bean);
		transaction.commit();
		return true;
	}
	

	@Override
	public RetailerBean searchretailerById(int retailer_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		return manager.find(RetailerBean.class, retailer_id);
	}

	@Override
	public boolean updateRetailer(RetailerBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		RetailerBean bean1=manager.find(RetailerBean.class, bean.getRetailer_id());
		bean1.setName(bean.getName());
		bean1.setEmail(bean.getEmail());
		bean1.setPassword(bean.getPassword());
		transaction.commit();
		return true;
	}

	@Override
	public boolean changePassword(int retailer_id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		RetailerBean bean=manager.find(RetailerBean.class, retailer_id);
		bean.setPassword(password);
		transaction.commit();
		return true;

}
}