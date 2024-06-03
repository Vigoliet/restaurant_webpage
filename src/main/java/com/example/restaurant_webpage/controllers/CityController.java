package com.example.restaurant_webpage.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/cities")
    public City addCity(@RequestBody City city) {
        return cityService.addCity(city);
    }

    @PutMapping("/cities/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City city) {
        city.setId(id);
        return cityService.updateCity(city);
    }
    @GetMapping("/cities")
    public Iterable<City> getAllCities() {
        return cityService.getAllCities();
    }

    @DeleteMapping("/cities/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }


}
