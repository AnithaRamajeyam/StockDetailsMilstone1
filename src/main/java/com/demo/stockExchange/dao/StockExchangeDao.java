package com.demo.stockExchange.dao;

import java.util.List;

import com.demo.stockExchange.model.StockExchange;

public interface StockExchangeDao {
	
	public int insertStockExchangeDetails(StockExchange stock);

	public List<StockExchange> getAllStockExchangedetails();

}
