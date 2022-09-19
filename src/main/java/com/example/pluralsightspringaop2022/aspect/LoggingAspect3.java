package com.example.pluralsightspringaop2022.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect3 {
    private final Logger logger = Logger.getLogger(LoggingAspect3.class.getName());

    @Around("execution(* com.example.pluralsightspringaop2022.*.*.*Passenger(..))")
    public Object log(ProceedingJoinPoint thisJoinPoint) throws Throwable{
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();
        logger.info("Call method " + methodName + " with first arg " + methodArgs[0]);
        /*
        Object result = "result";
        // if condition blocks the jointPoint to run
        if(methodArgs[0] != (Integer)1) {
            result = thisJoinPoint.proceed();
        }
         */
        Object result = thisJoinPoint.proceed();
        logger.info("Method " + methodName + " returns " + result);
        return result;
    }

}
