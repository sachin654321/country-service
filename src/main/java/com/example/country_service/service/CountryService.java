package com.example.country_service.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.country_service.dto.Country;
import com.example.country_service.dto.CountryComparisonDTO;

@Service
public class CountryService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<Map<String, Object>> getAllCountries() {
        return restTemplate.getForObject("https://restcountries.com/v3.1/all", List.class);
    }
    
    
    public Country getCountryByName(String name) {
        try {
            Country[] response = restTemplate.getForObject(
                "https://restcountries.com/v3.1/name/" + name,
                Country[].class
            );

            return response[0]; // API returns array
        } catch (HttpClientErrorException e) {
            throw new RuntimeException("Country not found: " + name);
        }
    }

    
    public Map<String, CountryComparisonDTO> compareCountries(String c1, String c2) {
        Country country1 = getCountryByName(c1);
        Country country2 = getCountryByName(c2);

        Map<String, CountryComparisonDTO> map = new HashMap<>();
        map.put("country1", new CountryComparisonDTO(country1));
        map.put("country2", new CountryComparisonDTO(country2));
        
        
        return map;
    }
}