package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.dto.Order;
import com.ustglobal.stockmanagement.dto.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Product products=manager.find(Product.class,product.getProduct_id());
		products.setProduct_id(product.getProduct_id());
		products.setName(product.getName());
		products.setPrice(product.getPrice());
		products.setQuantity(product.getQuantity());
		products.setCategory(product.getCategory());
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteProduct(int product_id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			Product product=manager.find(Product.class,product_id);
			manager.remove(product);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProductByName(String name) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			String jpql="from Product";
			TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
			List<Product> products=query.getResultList();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			String jpql="from Product where category=:category";
			TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
			query.setParameter("category", category);
			List<Product> products=query.getResultList();
			for(Product product:products) {
				manager.remove(product);
			}
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Product getProductbyId(int product_id) {
		EntityManager manager=factory.createEntityManager();
		return manager.find(Product.class, product_id);
	}

	@Override
	public Product getProductbyName(String name) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product where name=:name";
		TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
		query.setParameter("name", name);
		List<Product> products=query.getResultList();
		return query.getSingleResult();

	}

	@Override
	public List<Product> getProductbyCategory(String category) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product where category=:category";
		TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
		query.setParameter("category", category);
		return query.getResultList();
	}

	@Override
	public List<Product> getAllProduct() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product";
		TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
		return query.getResultList();
	}

	@Override
	public List<Product> getProductbyCompany(String company) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Product where company=:company";
		TypedQuery<Product> query=manager.createQuery(jpql, Product.class);
		query.setParameter("company", company);
		return query.getResultList();
	}
}
