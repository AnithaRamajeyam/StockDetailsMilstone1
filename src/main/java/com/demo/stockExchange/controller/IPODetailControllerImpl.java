package com.demo.stockExchange.controller;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.IPODetail;
import com.demo.stockExchange.service.IPODetailService;
import com.demo.stockExchange.service.IPODetailServiceImpl;


public class IPODetailControllerImpl implements IPODetailController {

		IPODetailService service=new IPODetailServiceImpl();
	@Override
	public int insertIPODetail(IPODetail ipodetail) throws SQLException {
		int result=service.insertIPODetail(ipodetail);
		return result;
	}

	@Override
	public List<IPODetail> getAllIPOPLanned() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
