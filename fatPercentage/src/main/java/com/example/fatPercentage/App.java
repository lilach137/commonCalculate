package com.example.fatPercentage;

import com.example.common.App_Parent;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return "API_FOR_FAT_PERCENTAGE";
    }

    @Override
    public void onCreate() {
        super.onCreate();

        statsClass = Activity_Stats.class;

    }
}
