package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
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
