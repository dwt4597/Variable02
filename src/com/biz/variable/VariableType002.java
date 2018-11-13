package com.biz.variable;

public class VariableType002 {

	public static void main(String[] args) {
		
		//int형과 float형은 같은 크기(4byte)이다.
		int intNum1 = 0;
		float floatNum1 = 0.0f;
		
		floatNum1 = intNum1;
		// intNum1 = floatNum1;
		floatNum1 = 123.456f;
		System.out.println("floatNum1:"+ floatNum1);
		
		intNum1= 123456;
		floatNum1 = intNum1; //자동 형변환
		System.out.println("floatNum1:"+ floatNum1);
		
		floatNum1 = 123.456f;
		intNum1 = (int)floatNum1; // 강제 형변환
		//cascading
		System.out.println("intNum1:"+ intNum1);

	}

}
