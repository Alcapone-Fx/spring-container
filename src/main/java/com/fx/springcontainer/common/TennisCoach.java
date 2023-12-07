package com.fx.springcontainer.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "This is the excercise for Tennis!";
    }
}
