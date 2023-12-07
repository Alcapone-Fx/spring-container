package com.fx.springcontainer.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("Tennis constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is the excercise for Tennis!";
    }
}
