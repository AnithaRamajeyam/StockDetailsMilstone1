package com.demo.stockExchange.dao;

import java.util.List;

import com.demo.stockExchange.model.IPODetail;


public interface IPODetailDao {

	public int insertIPODetail(IPODetail ipodetail);

	public List<IPODetail> getAllIPOPLanned();

}
