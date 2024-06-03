package com.example.restaurant_webpage.repositories;

import com.example.restaurant_webpage.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
