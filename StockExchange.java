package com.cognizant.stockexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "stock_exchange")
public class StockExchange {
	
	@Id
	
	@Column(name="ex_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ex_stock_exchange")
	
	@Size(min = 2,max=10 , message = "Sector name should be between 2 and 10 characters")
	private String stockExchange;
	
	@Column(name="ex_brief")
	
	private String brief;
	
	@Column ( name = "ex_address")
	
	private String address;
	
	@Column(name = "ex_remarks")
	
	private String remarks;
	
	@Column(name = "ex_image")
	
	private String image;

	public StockExchange() {
		super();
	}

	public StockExchange( int id,
			 @Size(min = 2, max = 10, message = "Sector name should be between 2 and 10 characters") String stockExchange,
			 String brief,  String address,  String remarks,  String image) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockExchange=" + stockExchange + ", brief=" + brief + ", address="
				+ address + ", remarks=" + remarks + ", image=" + image + "]";
	}

	
}
