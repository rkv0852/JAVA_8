package com.rv.JAVA8;

import java.util.stream.Stream;

/**
 * Write Program to - Create Stream of String - in java 8
 */
public class CreateStreamOfStringExample {
 
    public static void main(String[] args) {
 
           System.out.println("1. Create Stream of String");
 
           System.out.println("1. Create Stream of String");
           
           System.out.println("1.1 Create Stream of Integer using - of() method of Stream and passing the integers");
           Stream<String> streamOfString = Stream.of("a", "b");
 
           System.out.println("1.2 Create Stream of Integer using - of() method of Stream and passing Integer array");
           Stream<String> streamOfString2 = Stream.of(new String[]{"a", "b"});
 
           
           System.out.println("2. Display Stream of String");
           streamOfString.forEach(System.out::println);
           //Or
           //streamOfString2.forEach(System.out::println);
    }
 
}
 
/* OUTPUT
 
1. Create list of String
2. Convert list (ArrayList) of String to stream
3. Display Stream of String
a
b
 
*/

