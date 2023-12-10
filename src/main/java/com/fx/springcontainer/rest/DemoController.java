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
//    public DemoController(@Qualifier("createSwimCoach") Coach myCoach) {
    public DemoController(@Qualifier("customBeanId") Coach myCoach) {
        System.out.println("Demo Controler constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
