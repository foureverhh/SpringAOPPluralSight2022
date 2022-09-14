package com.example.pluralsightspringaop2022.aspect;

import java.util.logging.Logger;

public class LoggingAspect1 {
    private final Logger logger = Logger.getLogger(LoggingAspect1.class.getName());

    public void before() {
        logger.info("Entering method");
    }

    public void after() {
        logger.info("Existing method");
    }
}
