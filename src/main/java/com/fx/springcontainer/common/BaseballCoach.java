package com.fx.springcontainer.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "This is the exercise for Baseball!";
    }
}
