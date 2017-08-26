package com.srikanth.java8.lambda.threads;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->System.out.println("In new Thread"));
		t1.start();
		
		System.out.println("In main Thread example");
	}

}
