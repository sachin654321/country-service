package com.example.country_service.dto;

public class CountryComparisonDTO {
	
	
	private String name;
    private long population;
    private double area;
    private double density;
    private String flag;


    // FIXED CONSTRUCTOR
    public CountryComparisonDTO(Country c) {
        this.name = c.getName().getCommon();
        this.population = c.getPopulation();
        this.area = c.getArea();
        this.density = (c.getArea() > 0) ? (c.getPopulation() / c.getArea()) : 0;
        this.flag = (c.getFlags() != null) ? c.getFlags().get("png") : null;
    }

}
