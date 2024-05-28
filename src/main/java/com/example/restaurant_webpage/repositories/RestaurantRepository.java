package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findByCityOrderByCityAsc(String city);
}
