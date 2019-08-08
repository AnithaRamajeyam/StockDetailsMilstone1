package com.demo.stockExchange.model;

import java.util.Date;

public class IPODetail {
	
	private int id;
	private int companyCode;
	private int stockExchange;
	private double pricePerShare;
	private int totalShares;
	private String openDateTime;
	private String remarks;
	
	public IPODetail(int companyCode, int stockExchange, double pricePerShare, int totalShares, String openDateTime, String remarks) {
		super();
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.openDateTime = openDateTime;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public int getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(int stockExchange) {
		this.stockExchange = stockExchange;
	}
	public double getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public String getOpenDateTime() {
		return  openDateTime;
	}
	public void setOpenDateTime(String openDateTime) {
		this.openDateTime = openDateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
