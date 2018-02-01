package com.example.restaraunt.provider;

import com.example.restaraunt.model.Category;
import com.example.restaraunt.model.Meal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tijana on 2/1/2018.
 */

public class MealProvider {


    public static List<Meal> getMeals() {

        Category breakfast = new Category(0, "Breakfast");
        Category lunch = new Category(1, "Lunch");
        Category dinner = new Category(2, "Dinner");

        List<Meal> meals = new ArrayList<>();

        meals.add(new Meal(0, "eggs.jpg", "Eggs", "The eggs ...", 5.0f, breakfast ));
        meals.add(new Meal(1, "beefsteak.jpg", "Beefsteak", "The beeefsteak is ...", 5.0f, lunch));
        meals.add(new Meal(2, "carbonara.jpg", "Pasta Carbonara", "The carbora is pasta...", 5.0f, dinner));
        return meals;
    }


    public static List<String > getMealNames(){
        List<String> names = new ArrayList<>();
        names.add("Eggs");
        names.add("Beefsteak");
        names.add("Carbonara");
        return names;
    }


    public static Meal getMealById (int id){
        Category breakfast = new Category(0, "Breakfast");
        Category lunch = new Category(1, "Lunch");
        Category dinner = new Category(2, "Dinner");


        switch (id){
            case 0:
                return new Meal(0, "eggs.jpg", "Eggs", "The eggs ...", 5.0f, breakfast );
            case 1:
                return new Meal(1, "beefsteak.jpg", "Beefsteak", "The beeefsteak is ...", 5.0f, lunch);
            case 2:
                return new Meal(2, "carbonara.jpg", "Pasta Carbonara", "The carbora is pasta...", 5.0f, dinner);
                default:
                    return null;
        }

    }




}
