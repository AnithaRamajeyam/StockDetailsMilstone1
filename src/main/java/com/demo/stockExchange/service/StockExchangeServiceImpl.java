package com.demo.stockExchange.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.dao.StockExchangeDao;
import com.demo.stockExchange.dao.StockExchangeDaoImpl;
import com.demo.stockExchange.model.StockExchange;


public class StockExchangeServiceImpl implements StockExchangeService {

	StockExchangeDao stockdao;
	@Override
	public int insertStockExchangeDetails(StockExchange stock) throws SQLException {
		stockdao=new StockExchangeDaoImpl();
		int result=stockdao.insertStockExchangeDetails(stock);
		return result;
	}

	@Override
	public List<StockExchange> getAllStockExchangedetails() throws Exception {
		stockdao=new StockExchangeDaoImpl();
		List<StockExchange> list=stockdao.getAllStockExchangedetails();
		return list;
	}

}
