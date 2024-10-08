package com.datamodel.portfolio;

import java.security.Security;
import java.util.Set;

import com.datamodel.client.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
	@OneToOne
	@JoinColumn(name="client_id")
    private Client client;
    
	@OneToMany(mappedBy="portfolio")
    private Set<Security> securities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Security> getSecurities() {
		return securities;
	}

	public void setSecurities(Set<Security> securities) {
		this.securities = securities;
	}

	public Portfolio(Long id, Client client, Set<Security> securities) {
		super();
		this.id = id;
		this.client = client;
		this.securities = securities;
	}

	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
