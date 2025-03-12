package com.nidus.Fridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidus.Fridge.model.Food;

/**
 * This is repository class for food.
 * 
 * @author João Gustavo Soares Bispo
 * @date 2025-03-12
 * @version 1.0.0
 */

public interface FoodRepository extends JpaRepository<Food, Long> {

}
