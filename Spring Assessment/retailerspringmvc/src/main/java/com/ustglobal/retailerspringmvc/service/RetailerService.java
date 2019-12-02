package com.ustglobal.retailerspringmvc.service;

import com.ustglobal.retailerspringmvc.dto.RetailerBean;

public interface RetailerService {
	public RetailerBean login(int retailer_id, String password);
	
	public int createProfile(RetailerBean bean);
		
	public boolean deleteRetailer(int retailer_id);
		
	public RetailerBean searchretailerById(int retailer_id);
		
	public boolean updateRetailer(RetailerBean bean);
		
	public boolean changePassword(int retailer_id, String password);
}
