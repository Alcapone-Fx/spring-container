package com.fx.springcontainer.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("Constructor from: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim and swim";
    }
}