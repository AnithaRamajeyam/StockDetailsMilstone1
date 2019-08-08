package com.demo.stockExchange.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.IPODetail;


public interface IPODetailService {
	public int insertIPODetail(IPODetail ipodetail) throws SQLException;
	public List<IPODetail> getAllIPOPLanned() throws Exception;
}
