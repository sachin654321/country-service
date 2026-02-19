package com.example.country_service.dto;

import java.util.List;
import java.util.Map;

public class Country {

    private Name name;
    private Map<String, String> flags;
    private long population;
    private double area;
    private List<String> capital;
    private String region;
    private String subregion;
    private List<Double> latlng;
    private Map<String, String> maps;

    // GETTERS & SETTERS
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }

    public Map<String, String> getFlags() {
        return flags;
    }
    public void setFlags(Map<String, String> flags) {
        this.flags = flags;
    }

    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public List<String> getCapital() {
        return capital;
    }
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public List<Double> getLatlng() {
        return latlng;
    }
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Map<String, String> getMaps() {
        return maps;
    }
    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    // INNER CLASS: name
    public static class Name {
        private String common;
        private String official;

        public String getCommon() {
            return common;
        }
        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }
        public void setOfficial(String official) {
            this.official = official;
        }
    }
}
