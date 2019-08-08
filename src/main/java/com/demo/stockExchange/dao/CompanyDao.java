package com.demo.stockExchange.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchange.model.Company;


public interface CompanyDao {
	
		public int insertCompany(Company company) throws SQLException;
		public boolean updateCompany(Company company);
		public List<Company> getCompanyList() throws Exception;
}
