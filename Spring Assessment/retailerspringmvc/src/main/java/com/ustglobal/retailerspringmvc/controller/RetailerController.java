package com.ustglobal.retailerspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.retailerspringmvc.dto.RetailerBean;
import com.ustglobal.retailerspringmvc.service.RetailerService;

@Controller
public class RetailerController {
	@Autowired
	private RetailerService service;

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page

	@PostMapping("/login")
	public String login(int retailer_id,String password,HttpServletRequest request) {
		RetailerBean bean=service.login(retailer_id, password);
		if(bean==null) {
			request.setAttribute("msg","invalid credential");
			return "login";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}//end of login()

	@GetMapping("/createprofile")
	public String registerPage() {
		return "createprofile";
	}//end of register page

	@PostMapping("/createprofile")
	public String register(RetailerBean bean,ModelMap map) {
		int check=service.createProfile(bean);
		if(check>0) {
			map.addAttribute("msg", "you are registered and id is"+check);
		}else {
			map.addAttribute("msg", "email is repeated");
		}
		return "login";

	}//end of register();
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean") RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "login First!!!");
			return "login";
		}else {
			return "home";
		}

	}//end of home()
	@PostMapping("/home")
	public String home() {
		return "home";

	}
	@GetMapping("/search")
	public String search(@RequestParam("retailer_id")int retailer_id,ModelMap map) {
		RetailerBean bean=service.searchretailerById(retailer_id);
		if(bean==null) {
			map.addAttribute("msg", "data not found");
		}else {
			map.addAttribute("bean", bean);
			
		}
		return "home";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
	}
	

