package com.list.food.foodlist.controllers;

import com.list.food.foodlist.model.Dish;
import com.list.food.foodlist.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/dishes")
public class DishController {
    @Autowired
    private DishService service;

//    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Dish> findAll(){
//        return service.findAll();
//    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Dish findById() {
        return service.findById(1);
    }
}
