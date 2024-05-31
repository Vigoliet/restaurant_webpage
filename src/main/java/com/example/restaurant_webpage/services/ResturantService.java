package com.example.restaurant_webpage.services;

import com.example.restaurant_webpage.models.Resturant;
import com.example.restaurant_webpage.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// Refactor the name later on model and on service class
public class ResturantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Resturant addRestaurant(Resturant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Iterable<Resturant> getRestaurants() {
        return restaurantRepository.findAll();
    }



}
