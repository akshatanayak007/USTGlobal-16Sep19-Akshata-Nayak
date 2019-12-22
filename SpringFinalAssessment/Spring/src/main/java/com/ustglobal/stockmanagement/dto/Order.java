package com.ustglobal.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column
	private int order_id;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="Order")
	private List<Product> Product;
	public List<Product> getProduct() {
		return Product;
	}
	public void setProduct(List<Product> product) {
		Product = product;
	}

	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}
	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}

}
