package com.energiasolar.solarapp.service;

import org.springframework.stereotype.Service;

import com.energiasolar.solarapp.domain.Contractor;
import com.energiasolar.solarapp.repository.ContractorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContractorService {

    private final ContractorRepository repository;

    public ContractorService(ContractorRepository repository) {
        this.repository = repository;
    }

    public List<Contractor> findAll() {
        return repository.findAll();
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

