package com.rv.JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayListOfStringToStreamsExample {
	public static void main(String[] args) {
		System.out.println("1. Create list of String");
		List<String> stringList = Arrays.asList("ravi","sopy","soni","vineet");
		System.out.println("2. Convert list (ArrayList) of Integer to stream");
		Stream<String> streamStringList = stringList.stream();
		System.out.println("3. Display Stream of Integer");
		streamStringList.forEach(System.out::println);
		
	}

}
