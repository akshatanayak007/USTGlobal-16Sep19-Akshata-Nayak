package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class DeleteDemo {
	public static void main(String[] args) {
		
		EntityManager entitymanager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entitymanager = entityManagerFactory.createEntityManager();
			entityTransaction = entitymanager.getTransaction();
			entityTransaction.begin();
			Product product = entitymanager.find(Product.class,101);
			entitymanager.remove(product);
			System.out.println("Record Deleted");
			entityTransaction.commit();
		
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entitymanager.close();
		
	}

}
