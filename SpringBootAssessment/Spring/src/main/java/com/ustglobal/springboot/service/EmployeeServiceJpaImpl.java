package com.ustglobal.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.repo.EmployeeRepo;

@Service
public class EmployeeServiceJpaImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public boolean addEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		repo.save(bean);
		return true;
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		
		repo.update(bean.getName(), bean.getPassword(), bean.getDoj(), bean.getGender(),bean.getId());
	
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		//EmployeeBean bean = repo.findById(id).get();
		//repo.delete(bean);
		repo.deleteById(id);
		return false;
	}

	@Override
	public EmployeeBean getEmployee(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
