package com.list.food.foodlist.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "dish")
public class Dish implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @Column(nullable = true)
//    private List<Food> ingredients;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private double timeToPrepare;

    public static int counter = 0;

    public Dish(){}

//    public List<Food> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<Food> ingredients) {
//        this.ingredients = ingredients;
//    }

    public Long getId() { return this.id; }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeToPrepare() {
        return timeToPrepare;
    }

    public void setTimeToPrepare(double timeToPrepare) {
        this.timeToPrepare = timeToPrepare;
    }
}
