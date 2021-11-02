package com.example.firstlist;

public class CityData {
    private String city;
    private String country;
    private int cityPopulation;
    private int metroPopulation;

    // Constructor

    public CityData(String city, String country, int cityPopulation, int metroPopulation) {
        this.city = city;
        this.country = country;
        this.cityPopulation = cityPopulation;
        this.metroPopulation = metroPopulation;
    }

    // Get and Set

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public int getMetroPopulation() {
        return metroPopulation;
    }

    public void setMetroPopulation(int metroPopulation) {
        this.metroPopulation = metroPopulation;
    }
}
