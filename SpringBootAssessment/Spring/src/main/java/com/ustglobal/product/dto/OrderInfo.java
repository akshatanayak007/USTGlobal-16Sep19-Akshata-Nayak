package com.ustglobal.product.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="order_info")
public class OrderInfo {
	
	@Id
	@Column
	@GeneratedValue
	private int oid;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	@Column
	private double total_price;
	
	@Column
	private double total_price_gst;
	
	@JsonIgnore
	@Exclude
	@ManyToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<Product>  product;
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_price_gst() {
		return total_price_gst;
	}
	public void setTotal_price_gst(double total_price_gst) {
		this.total_price_gst = total_price_gst;
	}
	

}
