package com.energiasolar.solarapp.service;

import org.springframework.stereotype.Service;

import com.energiasolar.solarapp.domain.Contractor;
import com.energiasolar.solarapp.repository.ContractorRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Service
public class ContractorService {

    private final ContractorRepository repository;

    public ContractorService(ContractorRepository repository) {
        this.repository = repository;
    }

    public Page<Contractor> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Optional<Contractor> findById(Long id) {
        return repository.findById(id);
    }

    public Contractor save(Contractor contractor) {
        return repository.save(contractor);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}