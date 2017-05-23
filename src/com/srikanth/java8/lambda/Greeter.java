package com.srikanth.java8.lambda;

public class Greeter {
	
	public void greet(MyLambdaPrint lambdaPrint){
		lambdaPrint.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g = new Greeter();
		MyLambdaPrint lambdaGreeting = () -> System.out.println("My first lambda expression program");
		
		MyLambdaAdd addLamdaFunction = (int a,int b) -> a+b;
		
		g.greet(lambdaGreeting);
	}
	
	
}

interface MyLambdaPrint{
	void print();
}

interface MyLambdaAdd{
	int add(int a,int b);
}
