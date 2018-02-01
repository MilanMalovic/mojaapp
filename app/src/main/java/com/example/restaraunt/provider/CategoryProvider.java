package com.example.restaraunt.provider;

import com.example.restaraunt.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tijana on 2/1/2018.
 */

public class CategoryProvider {

    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Breakfast"));
        categories.add(new Category(1, "Lunch"));
        categories.add(new Category(2, "Dinner"));
        return categories;

    }


    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Breakfast");
        names.add("Lunch");
        names.add("Dinner");
        return names;
    }


    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Breakfast");
            case 1:
                return new Category(1, "Lunch");
            case 2:
                return new Category(2, "Dinner");
            default:
                return null;
        }
    }
}