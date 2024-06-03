package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.City;
import com.example.restaurant_webpage.models.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RestaurantRepository extends CrudRepository<Restaurant, Long>{

    List<Restaurant> findByCity(City city);
}
