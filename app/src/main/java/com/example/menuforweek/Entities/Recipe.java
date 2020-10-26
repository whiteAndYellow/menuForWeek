package com.example.menuforweek.Entities;

import com.example.menuforweek.Interface.Period;
import com.example.menuforweek.Interface.Product;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recipe implements Serializable, Period {

    private int id;
    private String name;
    private ArrayList<Product> details;
    private ArrayList<String> category;
    private String text;

    public Recipe(){    };

    public Recipe(String name, ArrayList<Product> details, String text) {
        this.name = name;
        this.details = details;
        this.text = text;
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

    public ArrayList<Product> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Product> details) {
        this.details = details;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addProduct(Product product){
        details.add(product);
    }

    public ArrayList<String> getCategories() {
        return category;
    }

    public void addCategory(String category) {
        this.category.add(category);
    }
}
