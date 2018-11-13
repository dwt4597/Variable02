package com.biz.variable;

public class ControlTest09 {

	public static void main(String[] args) {
		int intNum1 = 100;
		intNum1 = 200;
		// {}안에서 선언된 변수는
		// {}가 끝나면 소멸되어서
		// 더이상 읽고 쓰기가 불가능하다.
		/*
		 * if(intNum1 == 200) { int intNum2 = 500; intNum1 = 300;
		 * System.out.println(intNum2); }
		 */
		// if() {}안에서 같은이름의 intNum2를
		// 선언하고 사용했지만
		// {}박의 intNum2와는 완전히 다른 변수이다.
		/*
		 * int intNum2 = 500; System.out.println(intNum2); System.out.println(intNum1);
		 */
		// for()안에서 선언된 i는
		// for(){} 끝나면
		// 소멸된다.
		// for(){}가 끝난 후에 i 변수를
		// 참조(읽거나 쓰기)를 하면
		// 없는 변수라고 오류가 난다.
		/*
		 * for(int i = 0; i<10; i++) { System.out.println(i); }
		 */

		// ii변수는 for(){} 밖에서 선언된 변수이다
		// for(){} 밖에서 선언된 변수는
		// for(){} 끝난 후에도 변화된채로
		// 값을 유지하고 있다.
		int ii;
		for (ii = 0; ii < 10; ii++) {
			System.out.println(ii);
		}
		System.out.println("============");
		System.out.println(ii);

		for (ii = 0; ii < 10; ii++) {
			System.out.println(ii);
			ii = 100;
		}
		System.out.println(ii);

	}

}
