package com.rv.JAVA8;

import java.util.stream.Stream;

public class CreateStreamOfIntegerExample {
	public static void main(String[] args) {
		System.out.println("1. Create Stream of Integer");
        System.out.println("1.1 Create Stream of Integer using - of() method of Stream and passing the integers");
		Stream<Integer> streamInteger = Stream.of(10,20,30);
		System.out.println("1.2 Create Stream of Integer using - of() method of Stream and passing Integer array");
		Stream<Integer> streamInteger2 = Stream.of(new Integer[]{40,50,60});
		
		System.out.println("2. Display Stream of Integer");
		streamInteger.forEach(System.out::println);
		System.out.println("=========");
		streamInteger2.forEach(System.out::println);
	} 

}
