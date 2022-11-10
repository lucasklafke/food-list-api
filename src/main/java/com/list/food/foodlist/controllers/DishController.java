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

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dish> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Dish findById(@PathVariable(value = "id") String id) throws Exception{
        return service.findById(Long.parseLong(id));
    }

    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Dish create(@RequestBody Dish dish) {
        return service.create(dish);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public Dish update(@RequestBody Dish dish) {
        return service.update(dish);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") String id){
        service.delete(Long.parseLong(id));
    }

}
