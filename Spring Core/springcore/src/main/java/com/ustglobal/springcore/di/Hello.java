package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component("hello")
public class Hello {
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Map<String, Integer> map;
	
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method executing from Hello");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method executing from hellos");
	}
	

}
