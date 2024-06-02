package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.Resturant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<Resturant, Long> {

}

