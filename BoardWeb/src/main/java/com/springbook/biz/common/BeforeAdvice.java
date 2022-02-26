package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {}
	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {		
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[»çÀü Ã³¸®] " + method + "() ¸Þ¼Òµå ARGS Á¤º¸ : " + args[0].toString());
	}
}