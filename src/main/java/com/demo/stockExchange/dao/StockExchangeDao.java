package com.demo.stockExchange.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchange.model.StockExchange;

public interface StockExchangeDao  extends JpaRepository<StockExchange, Integer>{
	
}
