package com.ustglobal.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpassignment.dto.ProductInfo;

public class Update {
	public static void main(String[] args) {
		
	
	EntityTransaction entityTransaction = null;
	EntityManager entityManager = null;

	
	try {
		
		EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityFactory.createEntityManager();
		
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo product = entityManager.find(ProductInfo.class, 101);
		product.setPname("Phones");
		product.setQuantity(123);
		entityTransaction.commit();
		System.out.println("Product Table is Updated");
	
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
	}

}
