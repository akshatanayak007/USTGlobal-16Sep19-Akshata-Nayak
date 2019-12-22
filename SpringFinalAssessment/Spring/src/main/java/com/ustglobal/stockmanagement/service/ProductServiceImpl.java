package com.ustglobal.stockmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDao;
import com.ustglobal.stockmanagement.dto.Product;


@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(int product_id) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(product_id);
	}

	@Override
	public boolean deleteProductByName(String name) {
		// TODO Auto-generated method stub
		return dao.deleteProductByName(name);
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.deleteProductByCategory(category);
	}

	@Override
	public Product getProductbyId(int product_id) {
		// TODO Auto-generated method stub
		return dao.getProductbyId(product_id);
	}

	@Override
	public Product getProductbyName(String name) {
		// TODO Auto-generated method stub
		return dao.getProductbyName(name);
	}

	@Override
	public List<Product> getProductbyCategory(String category) {
		// TODO Auto-generated method stub
		return dao.getProductbyCategory(category);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

	@Override
	public List<Product> getProductbyCompany(String company) {
		// TODO Auto-generated method stub
		return dao.getProductbyCompany(company);
	}

}
