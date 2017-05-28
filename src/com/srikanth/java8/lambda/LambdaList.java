package com.srikanth.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//internal iterators
		//Type Inference
		list.forEach(value -> System.out.println(value));
		
		list.forEach(System.out::println);
	}

}
