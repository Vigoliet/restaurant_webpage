package com.example.restaurant_webpage.services;

import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.models.Restaurant;
import com.example.restaurant_webpage.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Restaurant updateRestaurant(Long id, Restaurant updatedRestaurant) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
        if (restaurantOptional.isPresent()) {
            Restaurant restaurant = restaurantOptional.get();
            restaurant.setName(updatedRestaurant.getName());
            restaurant.setAddress(updatedRestaurant.getAddress());
            restaurant.setZipCode(updatedRestaurant.getZipCode());
            restaurant.setPhoneNumber(updatedRestaurant.getPhoneNumber());
            restaurant.setWebsiteUrl(updatedRestaurant.getWebsiteUrl());
            return restaurantRepository.save(restaurant);
        } else {
            return null;
        }
    }

    public boolean deleteRestaurant(Long id) {
        if (restaurantRepository.existsById(id)) {
            restaurantRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
