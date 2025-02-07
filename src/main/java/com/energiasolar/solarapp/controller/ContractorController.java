package com.energiasolar.solarapp.controller;

import com.energiasolar.solarapp.domain.Contractor;
import com.energiasolar.solarapp.service.ContractorService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contractors")
public class ContractorController {

    private final ContractorService service;

    public ContractorController(ContractorService service) {
        this.service = service;
    }

    @Operation(summary = "Obtener todos los contratistas", description = "Lista paginada de contratistas")
    @GetMapping
    public Page<Contractor> getAllContractors(@RequestParam int page, @RequestParam int size) {
        return service.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/{id}")
    public Contractor getContractorById(@PathVariable Long id) {
        return service.findById(id).orElseThrow(() -> new RuntimeException("Contratista no encontrado"));
    }

    @PostMapping
    public Contractor createContractor(@Valid @RequestBody Contractor contractor) {
        return service.save(contractor);
    }

    @PutMapping("/{id}")
    public Contractor updateContractor(@PathVariable Long id, @Valid @RequestBody Contractor contractor) {
        contractor.setId(id);
        return service.save(contractor);
    }

    @DeleteMapping("/{id}")
    public void deleteContractor(@PathVariable Long id) {
        service.deleteById(id);
    }
}

