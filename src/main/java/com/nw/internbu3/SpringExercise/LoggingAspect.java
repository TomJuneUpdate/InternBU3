package com.nw.internbu3.SpringExercise;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    @Before("execution(* com.nw.internbu3.SpringExercise.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Before: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.nw.internbu3.SpringExercise.*.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("After: " + joinPoint.getSignature().getName() + " | Result: " + result);
    }
}
