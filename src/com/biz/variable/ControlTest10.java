package com.biz.variable;

public class ControlTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		/*
		 * for(int count=0; count<100; count++) { System.out.println("count:"+
		 * (count+1)); intSum += (count+1);
		 * 
		 * } System.out.println("intSum:" + intSum);
		 */
		/*
		 * intSum = 0; for (int count = 1; count <= 100; count++) {
		 * System.out.println(count); intSum += count; }
		 * 
		 * System.out.println(intSum);
		 */
		
		int intEven = 0;
		int intOdd = 0;
/*
		
		for (int count = 1; count <= 100; count++) {
			if ((count % 2) == 0)
				intEven++;
			else
				intOdd++;
		}
		System.out.println("Even:" + intEven);
		System.out.println("ODD:" + intOdd);
		
		*/
		
		// 1부터 100까지 짝수와 홀수의 합 구하기
		/*
		int intEvenSum = 0;
		int intOddSum = 0;
		for (int count = 1; count <= 100; count++) { 
			// count : 2,4,6,8,10
			if ((count % 2) == 0) {
				
				intEvenSum += count;
			} else {
				
				intOddSum += count;
			}
		}
		System.out.println("Even:" + intEvenSum);
		System.out.println("ODD:" + intOddSum);
		*/
		
		
		// 1부터 100까지 숫자 중에서 , 3의 배수의 갯수 세기
		
		/*
		int intgasu=0;
		for(int count = 1; count <= 100; count++) {
			if ((count %3) == 0) {
				System.out.println(count);
				intgasu++;
				
			} 
		}
		System.out.println("3의 배수 갯수:" + intgasu);
		
		int a = 3;
		// 정수형 변수 a를 선언하고,
		// clear한 후 3을 저장하라
		
		System.out.println(a);
		// 변수 a에 저장된 값(3)을 console에 보여라
		
		int b = 3;
		// 정수형 변수 b를 선언하고,
		// clear한 후 3을 저장하라
		
		System.out.println(a+b);
		// 변수 a에 저장된 값(3)과
		// 변수 b에 저장된 값(4)를 덧셈하여
		// console에 보여라
		
		*/
	
	
	//1부터 100까지 3의 배수의 합
	int thSum = 0;
	for(int c=1; c<=100; c++) {
		if(c%3==0) 
			thSum += c;
	}
	System.out.println(thSum);
	
		
	}

}
