package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.Resturant;
import org.springframework.data.repository.CrudRepository;


public interface RestaurantRepository extends CrudRepository<Resturant, Long>{
}
