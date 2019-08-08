package com.demo.stockExchange.controller;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.StockExchange;


public interface StockExchangeController {
	public int insertStockExchangeDetails(StockExchange stock) throws SQLException;
	public List<StockExchange> getAllStockExchangedetails() throws Exception;
}
