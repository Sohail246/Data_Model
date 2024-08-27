package com.datamodel.client;

import com.datamodel.advisor.FinancialAdvisor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Client 
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String contactInformation;
  
  @ManyToOne
  @JoinColumn(name="financial_advisor_id")
  private FinancialAdvisor financialAdvisor;
  
  
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
public String getContactInformation() {
	return contactInformation;
}
public void setContactInformation(String contactInformation) {
	this.contactInformation = contactInformation;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}
public Client(Long id, String name, String contactInformation) {
	super();
	this.id = id;
	this.name = name;
	this.contactInformation = contactInformation;
}
  
  
}
