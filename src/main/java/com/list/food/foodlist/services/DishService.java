package com.list.food.foodlist.services;

import com.list.food.foodlist.model.Dish;
import com.list.food.foodlist.model.Food;
import com.list.food.foodlist.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class DishService{
    private Logger logger = Logger.getLogger("finding all people");

    @Autowired
    DishRepository repository;

    public Dish findById(Long id) {
        logger.info("finding all people");
        return repository.findById(id).orElseThrow();
    }

    public List<Dish> findAll() {
        return repository.findAll();
    }

    public Dish create(Dish dish) {
        return repository.save(dish);
    }

    public Dish update(Dish dish) {
        var entity = repository.findById(dish.getId()).orElseThrow();
        entity.setDescription(dish.getDescription());
        entity.setTimeToPrepare(dish.getTimeToPrepare());

        return repository.save(dish);
    }

    public void delete(Long id) {
        var entity = repository.findById(id).orElseThrow();
        repository.delete(entity);
    }
}
