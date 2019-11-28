package com.ustglobal.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpassignment.dto.ProductInfo;

public class Delete {
	public static void main(String[] args) {
		
	
	EntityManager entityM = null;
	EntityTransaction entityT = null;
	
	try {
		
		EntityManagerFactory entityMF = Persistence.createEntityManagerFactory("TestPersistence");
		entityM = entityMF.createEntityManager();
		entityT = entityM.getTransaction();
		entityT.begin();
		ProductInfo product = entityM.find(ProductInfo.class, 101);
		entityM.remove(product);
		System.out.println("The Product is been removed successfully");
		entityT.commit();
		
	}catch(Exception e) {
		e.printStackTrace();
		entityT.rollback();
	}
	entityM.close();

}
}
