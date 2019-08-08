package com.demo.stockExchange.controller;

import java.sql.SQLException;

import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchange.model.Company;

public interface CompanyController {
	
	public int insertCompany(Company company) throws SQLException;
	public boolean updateCompany(Company company);
	public ModelAndView getCompanyList() throws Exception;

}
