package com.example.greeting.models;

public class Greeting {

    private String name;
    private String TimeOfDay;

    public Greeting(String name){
        this.name = name;
        this.TimeOfDay = TimeOfDay;

    }

    public Greeting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return TimeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        TimeOfDay = timeOfDay;
    }
}
