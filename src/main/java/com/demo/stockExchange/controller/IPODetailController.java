package com.demo.stockExchange.controller;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.IPODetail;


public interface IPODetailController {
	
	public int insertIPODetail(IPODetail ipodetail) throws SQLException;
	public List<IPODetail> getAllIPOPLanned() throws Exception;
}
