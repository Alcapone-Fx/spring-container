package com.fx.springcontainer.rest;

import com.fx.springcontainer.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/workout/tennis")
    public String getDailyWorkoutTennis() {
        return myCoach.getDailyWorkout();
    }
}
