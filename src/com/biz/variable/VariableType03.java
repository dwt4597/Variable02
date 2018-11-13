package com.biz.variable;

public class VariableType03 {

	public static void main(String[] args) {
		//boolean형에 대해 고찰
		int intNum1 = 30;
		int intNum2 = 40;
		
		boolean bNum;
		
		bNum = intNum1 < intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 > intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 == intNum2;
		System.out.println(bNum);
		
		bNum = (intNum1 <= intNum2);
		System.out.println(bNum);
		
		bNum = (intNum1 >= intNum2);
		System.out.println(bNum);
		
	}

}
