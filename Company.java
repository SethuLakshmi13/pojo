package com.cognizant.stockexchangeservice.model;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "company")
public class Company {
	

	@Id
	@Column(name="cp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "cp_name")
	private String name;
	
	
	@Column(name = "cp_turnover",columnDefinition = "BIGINT")
	private long turnover;
	
	
	@Column(name = "cp_ceo")
	private String ceo;
	
	
	@Column(name = "cp_listed")
	private boolean listed;
	
	
	@Column(name = "cp_board_of_directors")
	private String boardOfDirectors;
	
	
	@Column(name = "cp_brief")
	private String brief;
	
	
	@Column(name = "cp_image")
	private String image;

	
	@ManyToOne
	@JoinColumn(name = "cp_se_id")
	private Sector sector;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "company_stock", joinColumns = @JoinColumn(name = "cs_cp_id"), inverseJoinColumns = @JoinColumn(name = "cs_ex_id"))
	private Set<StockExchange> stockExchange;

	public Company() {
		super();
	}

	public Company(int id, String name, long turnover, String ceo, boolean listed, String boardOfDirectors,
			String brief, String image, Sector sector, Set<StockExchange> stockExchange) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.listed = listed;
		this.boardOfDirectors = boardOfDirectors;
		this.brief = brief;
		this.image = image;
		this.sector = sector;
		this.stockExchange = stockExchange;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTurnover() {
		return turnover;
	}

	public void setTurnover(long turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public boolean isListed() {
		return listed;
	}

	public void setListed(boolean listed) {
		this.listed = listed;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Set<StockExchange> getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(Set<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", turnover=" + turnover + ", ceo=" + ceo + ", listed=" + listed
				+ ", boardOfDirectors=" + boardOfDirectors + ", brief=" + brief + ", image=" + image + ", sector="
				+ sector + ", stockExchange=" + stockExchange + "]";
	}

	
	
}
