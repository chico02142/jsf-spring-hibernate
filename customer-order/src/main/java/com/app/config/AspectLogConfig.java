package com.app.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AspectLogConfig {
	
	private static final Logger LOG = LogManager.getLogger(AspectLogConfig.class);
	
	@Around("within(com.app.service.impl.*")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		LOG.debug("#%s(%s): %s in %[msec]s", 
				MethodSignature.class.cast(joinPoint.getSignature()).getMethod().getName(),
				joinPoint.getArgs(),
				result,
				System.currentTimeMillis() - start);
	}
	

}
