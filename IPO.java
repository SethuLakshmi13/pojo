package com.cognizant.stockexchangeservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ipo")
public class IPO {
	
	@Id
	
	@Column(name="ipo_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="ipo_ex_id")
	
	private StockExchange StockExchangeId;
	
	
	@Column(name="ipo_share_price",
			columnDefinition = "BIGINT")
	private double sharePrice;
	
	
	@Column(name="ipo_total_shares",
			columnDefinition = "BIGINT")
	private double totalShares;
	
	
	@Column(name = "ipo_date",
			columnDefinition = "DATETIME")
	private Date date;
	
	
	@Column(name = "ipo_remarks")
	private String remarks;
	
	
	
	public IPO() {
		super();
	}

	public IPO( int id,  StockExchange stockExchangeId,  double sharePrice,
			 double totalShares,  Date date,  String remarks) {
		super();
		this.id = id;
		StockExchangeId = stockExchangeId;
		this.sharePrice = sharePrice;
		this.totalShares = totalShares;
		this.date = date;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StockExchange getStockExchangeId() {
		return StockExchangeId;
	}

	public void setStockExchangeId(StockExchange stockExchangeId) {
		StockExchangeId = stockExchangeId;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(double totalShares) {
		this.totalShares = totalShares;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "IPO [id=" + id + ", StockExchangeId=" + StockExchangeId + ", sharePrice=" + sharePrice
				+ ", totalShares=" + totalShares + ", date=" + date + ", remarks=" + remarks + "]";
	}
}