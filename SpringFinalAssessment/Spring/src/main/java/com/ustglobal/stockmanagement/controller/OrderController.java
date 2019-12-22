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

import com.ustglobal.stockmanagement.dto.Order;
import com.ustglobal.stockmanagement.dto.OrderResponse;
import com.ustglobal.stockmanagement.service.OrderService;


@RestController
@RequestMapping("/order")
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  OrderResponse addOrder(@RequestBody Order order)
	{	OrderResponse response=new OrderResponse();
	if(service.addOrder(order)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setOrder(Arrays.asList(order));
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}

	@PostMapping(path="/update",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public  OrderResponse updateOrder(@RequestBody Order order)
	{	OrderResponse response=new OrderResponse();
	if(service.updateOrder(order)) {
		response.setStatuscode(201);
		response.setMessage("success");
		response.setDescription("Data added to the db");
		response.setOrder(Arrays.asList(order));;
	}else {
		response.setStatuscode(401);
		response.setMessage("failure");
		response.setDescription("Data not added to the db");	
	}
	return response;
	}
	@DeleteMapping(path="/delete/{order_id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse deleteOrder(@PathVariable("order_id")int order_id)
	{
		OrderResponse response=new OrderResponse();
		if(service.deleteOrder(order_id)) {
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

	@GetMapping(path="/get/{order_id}" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getorder(@PathVariable("order_id")int order_id) {

		OrderResponse response=new OrderResponse();
		List<Order> bean=service.getOrderbyId(order_id);
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setOrder(bean);
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");	
		}
		return response;
	}

	@GetMapping(path="/get-all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> getAllorders() {
		return service.getAllOrder();
	}
	@GetMapping(path="/exce" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i=1/0;

	}
}



