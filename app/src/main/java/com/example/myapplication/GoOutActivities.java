package com.example.myapplication;

import androidx.annotation.NonNull;

public class GoOutActivities {
    private final String name;
    private final String description;
    private GoOutActivities (String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final GoOutActivities[] goOut = new GoOutActivities[]{
            new GoOutActivities("Летний поход в горы на сутки", ""),
            new GoOutActivities("Бассейн", ""),
            new GoOutActivities("Велопрогулка", ""),
            new GoOutActivities("Поездка на море", ""),
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @NonNull
    public String toString() {
        return this.name;
    }
}
