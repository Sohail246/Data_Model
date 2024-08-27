package com.datamodel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datamodel.advisor.FinancialAdvisor;
import com.datamodel.repository.FinancialAdvisorRepository;

@Service
public class FinancialAdvisorService 
{
   @Autowired
   private FinancialAdvisorRepository AdvisorRepository;
   
   public List<FinancialAdvisor> getAllAdvisors()
   {
	   return AdvisorRepository.findAll();
   }
   
   public Optional<FinancialAdvisor> getAdvisorById(Long id)
   {
	return AdvisorRepository.findById(id);   
   }
   public FinancialAdvisor saveAdvisor(FinancialAdvisor advisor)
   {
	   return AdvisorRepository.save(advisor);
   } 
   public void deleteAdvisor(Long id)
   {
	   AdvisorRepository.deleteById(id);
   }
}

