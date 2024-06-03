package com.example.restaurant_webpage.services;

import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.models.Restaurant;
import com.example.restaurant_webpage.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Iterable<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    public List<Restaurant> getRestaurantsByCity(City city) {
        return restaurantRepository.findByCity(city);
    }



}
