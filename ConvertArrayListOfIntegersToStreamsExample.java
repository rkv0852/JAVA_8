package com.rv.JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Write Program to - Convert ArrayList of Integers to Streams - in java 8
 */
public class ConvertArrayListOfIntegersToStreamsExample {
 
    public static void main(String[] args) {
 
           //Stream<Integer> stream = Stream.of(1,2,3,4);
 
           System.out.println("1. Create list of Integer");
           List<Integer> listOfIntegers = new ArrayList<>();
           listOfIntegers.add(11);  
           listOfIntegers.add(12);
           
           System.out.println("2. Convert list (ArrayList) of Integer to stream");
           Stream<Integer> streamOfInteger = listOfIntegers.stream();
                        
           System.out.println("3. Display Stream of Integer");
           streamOfInteger.forEach(System.out::println);
    }
 
}
 
/* OUTPUT
 
1. Create list of Integer
2. Convert list (ArrayList) of Integer to stream
3. Display Stream of Integer
11
12
 
*/
