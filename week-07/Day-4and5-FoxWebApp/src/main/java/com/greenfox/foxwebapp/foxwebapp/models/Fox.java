package com.greenfox.foxwebapp.foxwebapp.models;

import java.util.ArrayList;
import java.util.List;


public class Fox {
    private String name;
    private List<String> tricks;
    private List<String> food;
    private List<String> drink;


    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = new ArrayList<>();
        this.drink = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public List<String> getFood() {
        return food;
    }

    public List<String> getDrink() {
        return drink;
    }
}
