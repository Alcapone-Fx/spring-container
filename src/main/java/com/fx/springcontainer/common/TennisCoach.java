package com.fx.springcontainer.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("Tennis constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartUpStuff() {
        System.out.println("StartUp stuff: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanUpStuff() {
        System.out.println("CleanUp stuff" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "This is the excercise for Tennis!";
    }
}
