package com.example.pluralsightspringaop2022.aspect;

import java.util.logging.Logger;

public class LoggingAspect {
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public void before() {
        logger.info("Entering method");
    }

    public void after() {
        logger.info("Existing method");
    }
}
