package com.list.food.foodlist.services;

import com.list.food.foodlist.model.Dish;
import com.list.food.foodlist.model.Food;
import com.list.food.foodlist.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class DishService{
    private Logger logger = Logger.getLogger("finding all people");

    @Autowired
    DishRepository repository;

    public Dish findById(int id) {
        logger.info("finding all people");
//        return new Dish(new ArrayList<>(), "you can eat", 50);
        return new Dish();
    }

//    public List<Dish> findAll() {
//
//    }
}