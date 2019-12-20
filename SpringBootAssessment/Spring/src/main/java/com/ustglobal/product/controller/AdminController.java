package com.ustglobal.product.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ustglobal.product.dto.Admin;
import com.ustglobal.product.dto.AdminResponse;
import com.ustglobal.product.dto.Product;
import com.ustglobal.product.service.AdminService;


@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	private int successCode=201;

	private int failureCode=401;

	private String success ="Success";

	private String failure = "Failed";
	
	
	
	@PostMapping(path="/adminlogin/{id}/{password}",consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse login(@PathVariable("id") int id,
			@PathVariable("password") String password,  HttpServletRequest request) {
		AdminResponse response = new AdminResponse();
		Admin bean = service.adminlogin(id, password);
		if(bean != null) {
			HttpSession session = request.getSession();
			session.setAttribute("admin", bean);
			response.setAdmin(Arrays.asList(bean));
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Login Success");
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Not Logged In");
		}
		return response;
	}
	
	
	
	@PostMapping(path="/add-product",consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse addAdmin(@RequestBody Product bean) {
		AdminResponse response = new AdminResponse();
		if(service.addProduct(bean)) {
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Product added Successfully");
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Product not added");

		}
		return response;
	}
	
	
	@PostMapping(path="/add-admin",consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse addAdmin(@RequestBody Admin bean) {
		AdminResponse response = new AdminResponse();
		if(service.addAdmin(bean)) {
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Admin added Successfully");
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Admin not added");

		}
		return response;
	}
	
	@PostMapping(path="/modify-product", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse modifyProduct(@RequestBody Product bean) {
		AdminResponse response = new AdminResponse();
		if(service.modifyProduct(bean)) {
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Product Modified");
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Product not added");

		}
		return response;
}

	@DeleteMapping(path="/delete-product/{pid}",produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse deleteProduct(@PathVariable("pid")int pid) {
		AdminResponse response = new AdminResponse();
		if(service.deleteProduct(pid)) {
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Product Deleted");
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Product not found");

		}
		return response;
	}

	@GetMapping(path="/get-product/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse getProduct(@PathVariable("name")String name) {
		Product bean = service.searchProduct(name);
		AdminResponse response = new AdminResponse();
		if(bean != null) {
			response.setStatuscode(successCode);
			response.setMessage(success);
			response.setDescription("Product Found");
			response.setProduct(Arrays.asList(bean));
			System.out.println(bean.getName());
		}else {
			response.setStatuscode(failureCode);
			response.setMessage(failure);
			response.setDescription("Product not Found");

		}
		return response;

	}
	
	@GetMapping(path="/get-all-products",produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse getAllProducts() {
		List<Product> bean = service.getAllProducts();
		AdminResponse resp = new AdminResponse();
		
		if(bean != null) {
			resp.setStatuscode(successCode);
			resp.setMessage(success);
			resp.setDescription("Found Successfully");
			resp.setProduct(bean);
			
			return resp;
		}else {
			resp.setStatuscode(failureCode);
			resp.setMessage(failure);
			resp.setDescription("Librarian not found");
			return resp;
		}
		
	}


}
