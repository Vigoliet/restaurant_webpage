package com.example.restaurant_webpage.controllers;

import com.example.restaurant_webpage.models.Restaurant;
import com.example.restaurant_webpage.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String getHome() {
        return "Hello!";
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return restaurantService.getRestaurants().toString();
    }

    @PostMapping("/restaurants")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

}
