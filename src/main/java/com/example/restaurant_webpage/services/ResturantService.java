package com.example.restaurant_webpage.services;

import com.example.restaurant_webpage.models.Resturant;
import com.example.restaurant_webpage.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
    public class ResturantService {
        private RestaurantRepository restaurantRepository;

        @Autowired
        public void RestaurantService(RestaurantRepository restaurantRepository) {
            this.restaurantRepository = restaurantRepository;
        }



        public Resturant addRestaurant(Resturant restaurant) {
            return restaurantRepository.save(restaurant);
        }

        public Resturant updateRestaurant(Resturant restaurant) {
            return restaurantRepository.save(restaurant);
        }

        public void deleteRestaurant(Long id) {
            restaurantRepository.deleteById(id);
        }

        public List<Resturant> getAllRestaurants() {
            return (List<Resturant>) restaurantRepository.findAll();
        }

        public Optional<Resturant> getRestaurantById(Long id) {
            return restaurantRepository.findById(id);
        }
    public Resturant updateCity(Long id, String newCity) {
        Resturant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid restaurant Id:" + id));
        restaurant.setCity(newCity);
        return restaurantRepository.save(restaurant);
    }
    }



