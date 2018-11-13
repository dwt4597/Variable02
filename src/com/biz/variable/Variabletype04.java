package com.biz.variable;

public class Variabletype04 {

	public static void main(String[] args) {
		char charAlpha= 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';
		
		System.out.println(charAlpha);
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		
		// char 문자형 변수값을
		// int형 변수에 복사하면
		// 해당 문자의 ASCII코드가 복사된다.
		
		int intAlpah=charAlpha;
		int intNum = charNum;
		int intSpec = charSpec;
		int intSpace = charSpace;
		
		System.out.println("======== int char =========");
		System.out.println(intAlpah);
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);
		
		System.out.println(intAlpah+ charNum);
		System.out.println(intAlpah+ charSpec);
		System.out.println(intAlpah+ charSpace);
		
		int intSQ= charAlpha + 20;
		System.out.println(intSQ);
		System.out.println((char)intSQ);

		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println((char)intAlpah++);
		System.out.println("============================");
		intAlpah = charAlpha;
		System.out.println((char)intAlpah);
		System.out.println((char)++intAlpah);
		System.out.println((char)++intAlpah);
		System.out.println((char)++intAlpah);
		System.out.println((char)++intAlpah);
		System.out.println((char)++intAlpah);
		System.out.println((char)++intAlpah);
		
		
		
		
		
	}

}
