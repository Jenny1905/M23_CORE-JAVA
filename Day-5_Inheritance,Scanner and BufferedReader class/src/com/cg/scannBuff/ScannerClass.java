package com.cg.scannBuff;

import java.util.Scanner;
//Example on Scanner class
public class ScannerClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		//String str=s.nextLine();
		int a=s.nextInt();
		System.out.println(a);
	}

}
