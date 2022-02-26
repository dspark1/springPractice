package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {}
	
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "expectObj")
	public void exceptionLog(JoinPoint jp, Exception expectObj) {
		String method = jp.getSignature().getName();
		System.out.println(method + "() 메소드 수행 중 예외 발생!");
		
		if(expectObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값이 입력되었습니다.");
		} else if(expectObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if(expectObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}