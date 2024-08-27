package com.datamodel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datamodel.advisor.FinancialAdvisor;
@Repository
public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long>
{

}
