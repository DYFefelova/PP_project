package com.example.myapplication.screens.main.rests;

import androidx.annotation.NonNull;

public class GoOutActivities {
    private final String name;
    private final String description;
    private GoOutActivities (String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final GoOutActivities[] goOut = new GoOutActivities[]{
            new GoOutActivities("Велопрогулка", "На 1-го человека потребуется:\n 1л воды\n головной убор\nмитенки(перчатки для велосипедов\n ..."),
            new GoOutActivities("Летний поход на сутки", "На 1-го человека потребуется:\n 1,5л воды\n головной убор\nспальный мешок\n ..."),
            new GoOutActivities("Катание на роликах", "На 1-го человека потребуется:\n 1,5л воды\n головной убор\nспальный мешок\n ..."),
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
