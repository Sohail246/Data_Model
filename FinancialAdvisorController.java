package com.datamodel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datamodel.advisor.FinancialAdvisor;
import com.datamodel.service.FinancialAdvisorService;

@RestController
@RequestMapping("/advisors")
public class FinancialAdvisorController 
{
	@Autowired
  private FinancialAdvisorService financialAdvisorService;
	
  @GetMapping
  public List<FinancialAdvisor> getAllAdvisors()
  {
	  return financialAdvisorService.getAllAdvisors();
  }
  
  @GetMapping("/{id}")
  public Optional<FinancialAdvisor> getAdvisorById(@PathVariable Long id)
  {
	  return financialAdvisorService.getAdvisorById(id);
  }
  
  @PostMapping
  public FinancialAdvisor createAdvisor(@RequestBody FinancialAdvisor advisor)
  {
	  return financialAdvisorService.saveAdvisor(advisor);
  }
    
  public void deleteAdvisor(@PathVariable Long id)
  {
	  financialAdvisorService.deleteAdvisor(id);
  }
}
