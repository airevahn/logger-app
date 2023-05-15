package com.example.loggerapp;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    Logger logger = LoggerFactory.getLogger(HomeResource.class);

    @RequestMapping("/")
    public String home() {
        logger.error("Error Happened");
        return "Hello from Springboot!";
    }
}