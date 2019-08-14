package com.demo.stockExchange.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.stockExchange.dao.StockExchangeDao;
import com.demo.stockExchange.model.StockExchange;

@Controller
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	StockExchangeDao stockdao;
	@Override
	public StockExchange insertStockExchangeDetails(StockExchange stock) throws SQLException {
		StockExchange result=stockdao.save(stock);
		return result;
	}

	@Override
	public List<StockExchange> getAllStockExchangedetails() throws Exception {
		List<StockExchange> list=stockdao.findAll();
		return list;
	}

}
