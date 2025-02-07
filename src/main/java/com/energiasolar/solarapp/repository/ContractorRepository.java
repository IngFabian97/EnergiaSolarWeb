package com.energiasolar.solarapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.energiasolar.solarapp.domain.Contractor;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {
    
}
