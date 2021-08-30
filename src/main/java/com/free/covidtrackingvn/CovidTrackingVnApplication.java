package com.free.covidtrackingvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.free.covidtrackingvn"})
public class CovidTrackingVnApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidTrackingVnApplication.class, args);
    }

}
