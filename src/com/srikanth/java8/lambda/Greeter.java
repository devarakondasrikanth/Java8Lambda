package com.srikanth.java8.lambda;

public class Greeter {
	
	public void greet(){
		System.out.println("Welocme to java8 Programming with lambdas");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g = new Greeter();
		g.greet();
	}
	
	lambdaGreeting = () -> {
		System.out.println("My first lambda expression");
	}
}
