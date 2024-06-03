package com.example.restaurant_webpage.controllers;

import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City city) {
        city.setId(id);
        return cityService.updateCity(city);
    }
    @GetMapping
    public List<City> getAllCities() {
        return (List<City>) cityService.getAllCities();
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }


}
