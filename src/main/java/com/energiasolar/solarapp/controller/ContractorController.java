package com.energiasolar.solarapp.controller;

import com.energiasolar.solarapp.domain.Contractor;
import com.energiasolar.solarapp.service.ContractorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contractors")
public class ContractorController {

    private final ContractorService service;

    public ContractorController(ContractorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contractor> getAllContractors() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Contractor> getContractorById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Contractor createContractor(@RequestBody Contractor contractor) {
        return service.save(contractor);
    }

    @PutMapping("/{id}")
    public Contractor updateContractor(@PathVariable Long id, @RequestBody Contractor contractor) {
        contractor.setId(id);
        return service.save(contractor);
    }

    @DeleteMapping("/{id}")
    public void deleteContractor(@PathVariable Long id) {
        service.deleteById(id);
    }
}
