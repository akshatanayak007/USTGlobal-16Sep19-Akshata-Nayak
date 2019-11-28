package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManger = entityManagerfactory.createEntityManager();
		Product productDetail = entityManger.find(Product.class, 101);
	
		System.out.println("ID---"+productDetail.getPid());
		System.out.println("Name---"+productDetail.getName());
		System.out.println("Quantity---"+productDetail.getQuantity());
		
		entityManger.close();
	}

}
