package com.example.country_service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.country_service.dto.CountryComparisonDTO;
import com.example.country_service.service.CountryService;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{name}")
    public ResponseEntity<?> getCountryByName(@PathVariable String name) {
        return ResponseEntity.ok(service.getCountryByName(name));
    }

    @GetMapping
    public ResponseEntity<?> getAllCountries() {
        return ResponseEntity.ok(service.getAllCountries());
    }
    
    
    @GetMapping("/compare")
    public Map<String, CountryComparisonDTO> compare(
            @RequestParam String c1,
            @RequestParam String c2) {

        return service.compareCountries(c1, c2);
    }

    
}