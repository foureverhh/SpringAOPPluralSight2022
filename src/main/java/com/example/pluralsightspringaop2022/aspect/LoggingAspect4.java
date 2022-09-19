package com.example.pluralsightspringaop2022.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect4 {
    private final Logger logger = Logger.getLogger(LoggingAspect4.class.getName());

    @Around("@annotation(com.example.pluralsightspringaop2022.log.Log)")
    public Object log(ProceedingJoinPoint thisJoinPoint)  throws  Throwable{
        String methodName = thisJoinPoint.getSignature().getName();
        Object[] methodArgs = thisJoinPoint.getArgs();
        logger.info("Call method " + methodName + " with first args " + methodArgs[0]);
        Object result = thisJoinPoint.proceed();
        logger.info("Method " + methodName + " returns " + result);
        return result;
    }
}
