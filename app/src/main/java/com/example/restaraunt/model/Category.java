package com.example.restaraunt.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tijana on 2/1/2018.
 */

public class Category {


    private int id;
    private String name;
    private List<Meal> meals;

    public Category() {

        meals = new ArrayList<>();
    }

    public Category(int id, String name) {

        this.id = id;
        this.name = name;

        meals = new ArrayList<>();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void addMeal(Meal meal) {

        meals.add(meal);
    }

    public void removeMeal(Meal meal) {

        meals.remove(meal);
    }

    public Meal getMeal(int position) {

        return meals.get(position);
    }

    public List<Meal> getMeals() {

        return meals;
    }

    public void setMeals(List<Meal> meals) {

        this.meals = meals;
    }

}
