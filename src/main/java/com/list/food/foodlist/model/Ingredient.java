package com.list.food.foodlist.model;


import javax.persistence.*;

@Entity
@Table(name = "food")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;

    public Ingredient(){}
}
