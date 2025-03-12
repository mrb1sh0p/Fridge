package com.nidus.Fridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nidus.Fridge.model.Food;
import com.nidus.Fridge.service.FoodService;

/**
 * This is controller class for food.
 * 
 * @author João Gustavo Soares Bispo
 * @date 2025-03-12
 * @version 1.0.0
 */

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping("/all")
    public List<Food> getAllFood() {
        return foodService.getAllFood();
    }

    @GetMapping("/{id}")
    public Food getFoodById(@RequestParam Long id) {
        return foodService.getFoodById(id);
    }

    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFood(@RequestParam Long id) {
        foodService.deleteFood(id);
    }
}
