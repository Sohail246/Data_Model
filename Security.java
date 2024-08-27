package com.datamodel.security;

import java.time.LocalDate;

import com.datamodel.portfolio.Portfolio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security 
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String category;
  private LocalDate purchase;
  private double purchasePrice;
  private int quantity;
  
  
  @ManyToOne
  @JoinColumn(name="portfolio_id")
  private Portfolio portfolio;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public LocalDate getPurchase() {
	return purchase;
}

public void setPurchase(LocalDate purchase) {
	this.purchase = purchase;
}

public double getPurchasePrice() {
	return purchasePrice;
}

public void setPurchasePrice(double purchasePrice) {
	this.purchasePrice = purchasePrice;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Portfolio getPortfolio() {
	return portfolio;
}

public void setPortfolio(Portfolio portfolio) {
	this.portfolio = portfolio;
}

public Security(Long id, String name, String category, LocalDate purchase, double purchasePrice, int quantity,
		Portfolio portfolio) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.purchase = purchase;
	this.purchasePrice = purchasePrice;
	this.quantity = quantity;
	this.portfolio = portfolio;
}

public Security() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
