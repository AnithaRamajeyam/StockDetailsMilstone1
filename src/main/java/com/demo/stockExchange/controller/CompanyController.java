package com.demo.stockExchange.controller;

import java.sql.SQLException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchange.model.Company;

public interface CompanyController {
	public String insertCompany(Company company,BindingResult result,Model model) throws SQLException;
	public boolean updateCompany(Company company);
	public ModelAndView getCompanyList() throws Exception;

}
