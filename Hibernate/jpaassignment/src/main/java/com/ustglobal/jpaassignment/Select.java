package com.ustglobal.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpassignment.dto.ProductInfo;

public class Select {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityMangerFactory.createEntityManager();
		
		ProductInfo product = 	entityManager.find(ProductInfo.class, 101);
	
		System.out.println("Pid is--> "+product.getPid());
		System.out.println("Pname is--> "+product.getPname());
		System.out.println("Quantity is-->"+product.getQuantity());
		
		entityManager.close();
		
	}

}
