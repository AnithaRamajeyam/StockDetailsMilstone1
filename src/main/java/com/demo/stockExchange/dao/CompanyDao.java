package com.demo.stockExchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchange.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {
	
}
