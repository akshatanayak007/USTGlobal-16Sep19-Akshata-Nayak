package com.ustglobal.stockmanagement.service;

import java.util.List;

import com.ustglobal.stockmanagement.dto.Product;


public interface ProductService {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int product_id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCategory(String category);
	public Product getProductbyId(int product_id);
	public Product getProductbyName(String name);
	public List<Product> getProductbyCategory(String category);
	public List<Product> getProductbyCompany(String company);
	public List<Product> getAllProduct();
}
