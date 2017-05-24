package com.srikanth.java8.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthLambda myLambda = (String s) -> s.length();
		System.out.println(myLambda.getLenght("Srikanth"));
	}
	
	interface StringLengthLambda{
		int getLenght(String str);
	}

}
