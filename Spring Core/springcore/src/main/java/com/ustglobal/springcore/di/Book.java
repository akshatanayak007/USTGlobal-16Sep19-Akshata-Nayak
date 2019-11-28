package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	
	@Autowired
	 private Author author;
	 private String name;
	 private String price;
	 
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}
