package com.nidus.Fridge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidus.Fridge.model.Food;
import com.nidus.Fridge.repository.FoodRepository;

/**
 * This is service class for food.
 * 
 * @author João Gustavo Soares Bispo
 * @date 2025-03-12
 * @version 1.0.0
 */

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
}
