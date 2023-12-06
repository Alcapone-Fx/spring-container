package com.fx.springcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.fx.springcontainer",
                            "com.fx.util"})
public class SpringcontainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcontainerApplication.class, args);
    }

}
