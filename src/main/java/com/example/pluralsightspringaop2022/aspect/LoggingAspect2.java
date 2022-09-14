package com.example.pluralsightspringaop2022.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;
@Aspect
public class LoggingAspect2 {
    private final Logger logger = Logger.getLogger(LoggingAspect2.class.getName());

    @Before("execution(* com.example.pluralsightspringaop2022.*.*.*Passenger(..))")
    public void before() {
        logger.info("Entering method");
    }

    @After("execution(* com.example.pluralsightspringaop2022.*.*.*Passenger(..))")
    public void after() {
        logger.info("Existing method");
    }
}
