package com.example.restaurant_webpage.controllers;

import com.example.restaurant_webpage.models.Resturant;
import com.example.restaurant_webpage.services.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private final ResturantService restaurantService;

    @Autowired
    public RestaurantController(ResturantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public Resturant addRestaurant(@RequestBody Resturant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/{id}")
    public Resturant updateResturant(@PathVariable Long id, @RequestBody Resturant resturant) {
        resturant.setId(Math.toIntExact(id));
        return restaurantService.updateRestaurant(resturant);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    @GetMapping
    public List<Resturant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Optional<Resturant> getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    @PutMapping("/{id}/city")
    public Resturant updateCity(@PathVariable Long id, @RequestBody String newCity) {
        return restaurantService.updateCity(id, newCity);
    }

}

