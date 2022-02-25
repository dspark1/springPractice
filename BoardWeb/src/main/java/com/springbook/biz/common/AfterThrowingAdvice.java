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
		System.out.println(method + "() �޼ҵ� ���� �� ���� �߻�!");
		
		if(expectObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		} else if(expectObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		} else if(expectObj instanceof Exception) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
	}
}
