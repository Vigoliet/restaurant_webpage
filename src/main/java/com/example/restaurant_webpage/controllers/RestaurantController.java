package com.example.restaurant_webpage.controllers;
import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.services.CityService;
import org.springframework.web.bind.annotation.RestController;
import com.example.restaurant_webpage.models.Restaurant;
import com.example.restaurant_webpage.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private CityService cityService;

    @GetMapping("/restaurants/{cityId}")
    public List<Restaurant> getRestaurantsByCity(@PathVariable Long cityId) {
        City city = cityService.getCity(cityId);
        return restaurantService.getRestaurantsByCity(city);
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return restaurantService.getRestaurants().toString();
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @DeleteMapping("restaurant/{id}")
    public ResponseEntity<?> deleteRestaurant(@PathVariable Long id) {
        boolean deleted = restaurantService.deleteRestaurant(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("restaurant/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updateRestaurant) {
        Restaurant restaurant = restaurantService.updateRestaurant(id, updateRestaurant);
        if (restaurant != null) {
            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
