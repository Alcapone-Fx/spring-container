package com.fx.springcontainer.rest;

import com.fx.springcontainer.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    /* Constructor injection
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }*/

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @Autowired
    public void setCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }
}
