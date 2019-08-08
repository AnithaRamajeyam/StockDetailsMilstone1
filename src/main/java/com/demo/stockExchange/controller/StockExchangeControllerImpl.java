package com.demo.stockExchange.controller;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.StockExchange;
import com.demo.stockExchange.service.StockExchangeService;
import com.demo.stockExchange.service.StockExchangeServiceImpl;


public class StockExchangeControllerImpl implements StockExchangeController {
	
	StockExchangeService service=new StockExchangeServiceImpl();
	@Override
	public int insertStockExchangeDetails(StockExchange stock) throws SQLException {
		int result=service.insertStockExchangeDetails(stock);
		return result;
	}

	@Override
	public List<StockExchange> getAllStockExchangedetails() throws Exception {
		List<StockExchange> list=service.getAllStockExchangedetails();
		return list;
	}

}
