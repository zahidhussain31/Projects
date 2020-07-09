package com.Catch.ArrayOOB.Exception;

public class TryCatchRunner {
	
	public static void main(String[] args) {
		method1();
		System.out.println("main ended");
	}

	private static void method1() {
		method2();
		System.out.println("method1 ended");
	}

	private static void method2() {
		try {
			int[] i = {1,2};
			int number = i[3];
			System.out.println("method2 ended");
			}catch (ArrayIndexOutOfBoundsException aex){
				System.out.println("Matched ArrayOOBException");
				aex.printStackTrace();
			}catch (Exception ex){
				System.out.println("Matched Exception");
				ex.printStackTrace();
			}
	}
}
