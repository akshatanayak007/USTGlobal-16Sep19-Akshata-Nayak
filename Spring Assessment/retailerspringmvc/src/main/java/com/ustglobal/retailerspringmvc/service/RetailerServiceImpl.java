package com.ustglobal.retailerspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailerspringmvc.dao.RetailerDao;
import com.ustglobal.retailerspringmvc.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService {
	
	@Autowired
	private RetailerDao dao;
	
	@Override
	public RetailerBean login(int retailer_id, String password) {
		return dao.login(retailer_id, password);
	}

	@Override
	public int createProfile(RetailerBean bean) {
		return dao.createProfile(bean);
	}

	@Override
	public boolean deleteRetailer(int retailer_id) {
		return dao.deleteRetailer(retailer_id);
	}

	@Override
	public RetailerBean searchretailerById(int retailer_id) {
		return dao.searchretailerById(retailer_id);
	}

	@Override
	public boolean updateRetailer(RetailerBean bean) {
		return dao.updateRetailer(bean);
	}

	@Override
	public boolean changePassword(int retailer_id, String password) {
		return dao.changePassword(retailer_id, password);
	}

}
