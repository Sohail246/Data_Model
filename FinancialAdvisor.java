package com.datamodel.advisor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FinancialAdvisor
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	  private String name;
	  private String contactInformation;
	
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
	public FinancialAdvisor() {
		super();
		
		
	}
	public FinancialAdvisor(Long id, String name, String contactInformation) {
		super();
		this.id = id;
		this.name = name;
		this.contactInformation = contactInformation;
	}

}
