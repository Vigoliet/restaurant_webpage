package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {


}



