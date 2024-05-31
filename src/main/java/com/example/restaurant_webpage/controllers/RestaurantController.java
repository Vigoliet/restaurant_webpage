package com.example.restaurant_webpage.controllers;

import com.example.restaurant_webpage.models.Resturant;
import com.example.restaurant_webpage.services.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestaurantController {

    @Autowired
    private ResturantService resturantService;

    @GetMapping("/")
    public String getHome() {
        return "Hello!";
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return resturantService.getRestaurants().toString();
    }

    @PostMapping("/restaurants")
    public Resturant addRestaurant(@RequestBody Resturant restaurant) {
        return resturantService.addRestaurant(restaurant);
    }

}
