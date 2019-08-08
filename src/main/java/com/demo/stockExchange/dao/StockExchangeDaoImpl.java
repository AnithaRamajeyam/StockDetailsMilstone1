package com.demo.stockExchange.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;

import com.demo.stockExchange.model.StockExchange;


public class StockExchangeDaoImpl implements StockExchangeDao {

	@Override
	public int insertStockExchangeDetails(StockExchange stock) {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			ps=con.prepareStatement("insert into stockexchange(stockexchange_id,stockexchange_name,brief,contact_address,remarks) values(?,?,?,?,?)");
			ps.setInt(1,stock.getStockExchangeId());
			ps.setString(2, stock.getStockExchangeName());
			ps.setString(3, stock.getBrief());
			ps.setString(4, stock.getContactAddress());
			ps.setString(5, stock.getRemarks());
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}

	@Override
	public List<StockExchange> getAllStockExchangedetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
