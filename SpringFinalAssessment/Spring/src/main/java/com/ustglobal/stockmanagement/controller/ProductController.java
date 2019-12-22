package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.Product;
import com.ustglobal.stockmanagement.dto.ProductResponse;
import com.ustglobal.stockmanagement.service.ProductService;


@RestController
@RequestMapping("/product")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  ProductResponse addproduct(@RequestBody Product product)
	{	ProductResponse response=new ProductResponse();
	if(service.addProduct(product)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setProduct(Arrays.asList(product));
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}

	@PostMapping(path="/update",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  ProductResponse updateProduct(@RequestBody Product product)
	{	ProductResponse response=new ProductResponse();
	if(service.updateProduct(product)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setProduct(Arrays.asList(product));
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}
	@DeleteMapping(path="/deletebyid/{product_id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteproduct4(@PathVariable("product_id")int product_id)
	{
		ProductResponse response=new ProductResponse();
		if(service.deleteProduct(product_id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("product deleted in the db");

		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("product not deleted in the db");	
		}
		return response;
	}
	@DeleteMapping(path="/deletebyname/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteproduct1(@PathVariable("name")String name)
	{
		ProductResponse response=new ProductResponse();
		if(service.deleteProductByName(name)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");		
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not deleted in the db");	
		}
		return response;
	}
	@DeleteMapping(path="/deletebycategory/{category}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteproduct2(@PathVariable("category")String category)
	{
		ProductResponse response=new ProductResponse();
		if(service.deleteProductByCategory(category)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");

		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not deleted in the db");	
		}
		return response;
	}
	@GetMapping(path="/getbyid/{product_id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getproduct(@PathVariable("product_id")int product_id) {

		ProductResponse response=new ProductResponse();
		Product bean=service.getProductbyId(product_id);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}
	@GetMapping(path="/getbyname/{name}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getproduct1(@PathVariable("name")String name) {

		ProductResponse response=new ProductResponse();
		Product bean=service.getProductbyName(name);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct(Arrays.asList(bean));
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}
	@GetMapping(path="/getbycategory/{category}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getproduct2(@PathVariable("category")String category) {

		ProductResponse response=new ProductResponse();
		List<Product> bean=service.getProductbyCategory(category);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct(bean);
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}
	@GetMapping(path="/getbycompany/{company}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getproduct3(@PathVariable("company")String company) {

		ProductResponse response=new ProductResponse();
		List<Product> bean=service.getProductbyCompany(company);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct(bean);
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}
	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts() {
		return service.getAllProduct();
	}
	@GetMapping(path="/exce" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i=1/0;

	}
}
