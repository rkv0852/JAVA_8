package com.rv.JAVA8;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OperationBetweenTwoNumber {
	public static void main(String[] args) {
		// In Java 8 - Find all even numbers between 1 to 20
		// Use streams
		System.out.println("=========even number between 1 ot 20==========");
		IntStream.range(1, 20)  //Numbers between 1 to 20
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
		
		System.out.println("========even number between 1 ot 5 ===========");
        IntStream.of(1, 2, 3, 4, 5)  //Numbers between 1 to 5
      .filter(n -> n % 2 == 0) //Filter - all even numbers
      .forEach(System.out::println); //display
        
        System.out.println("========number greater than 2 in between 0 to 5 ===========");
      //In Java 8 - Find all numbers greater than 2
        //Use streams
        IntStream.range(0, 5)
        .filter(n ->n>2)
        .forEach(System.out::println);
        
      //In Java 8 - Find all even numbers greater than 2
        //Use streams
        System.out.println("Find all even numbers greater than 4");
        IntStream.range(1, 9)
        .filter(n -> n>4)
        .filter(n -> n%2 == 0)
        .forEach(System.out::println);
        
      //In Java 8 - Find all odd numbers between 1 to 5
        //Use streams
        System.out.println("Find all odd numbers between 1 to 5");
        IntStream.range(1, 5)
        .filter(n -> n%2 == 1)
        .forEach(System.out::println);
        

      //In Java 8 - Find sum of all between 1 to 5
      //Use streams
        System.out.println("Find sum of all between 1 to 5");
        int sum = IntStream.range(1, 5).sum();
        System.out.println(sum);
        
      //In Java 8 - Find sum of all even numbers between 1 to 5
        System.out.println("Find sum of all even numbers between 1 to 5");
        int evensum = IntStream.of(1,2,3,4,5)
        .filter(n -> n%2 == 0).sum();
        System.out.println(evensum);
        
      //In Java 8 - Find maximum of all numbers in IntStream
        System.out.println("In Java 8 - Find maximum of all numbers in IntStream");
        OptionalInt max = IntStream.of(10,5,40,55,20,25).max();
        System.out.println(max.getAsInt());
        
      //In Java 8 - Find minimum of all numbers in IntStream
        System.out.println("Find minimum of all numbers in IntStream");
        OptionalInt min = IntStream.of(10,5,40,55,20,25).min();
        System.out.println(min.getAsInt());
        
      //In Java 8 - count number of elements in IntStream
        System.out.println("count number of elements in IntStream");
        long count = IntStream.of(9, 5, 3, 12, 4).count();
        System.out.println("count = "+count);
        
      //In Java 8 - Find average of all between 1 to 5
        //Use streams
        System.out.println("Find average of all between 1 to 5");
        OptionalDouble average = IntStream.of(1, 2, 3).average();  //n.e. 1 + 2 + 3 + 4 + 5
        System.out.println("average = "+average.getAsDouble());
        
     // Count number of records greater than 2
        //In Java 8 - count number of elements in IntStream
        System.out.println("count number of elements in IntStream");
     long countRecordsGreaterThan = IntStream.of(1, 2, 3, 4, 5).filter((n) -> n > 2 ).count();
     System.out.println("Count number of records greater than 2 = "+countRecordsGreaterThan);
     
   //In Java 8 - Find sum of all between 1 to 5  and add 10 to that
     //using reduce method of IntStream
      System.out.println("Find sum of all between 1 to 5  and add 10 to that");
      int reduced2 =
                IntStream.of(1, 2, 3, 4, 5)
           .reduce(10, (x, y) -> x + y);   //n.e. 10 + 1 + 2 + 3 + 4 + 5 
      System.out.println(reduced2);
      
    //findFirst() method - returns first element in the stream
      System.out.println("findFirst() method - returns first element in the stream");
      OptionalInt optionalInt = IntStream.of(1, 2, 3, 4, 5).findFirst();
      System.out.println(optionalInt.getAsInt());
      
    //findAny() method - returns any element in the stream
      System.out.println("findAny() method - returns any element in the stream");
      OptionalInt optionalInt1 = IntStream.of(1, 2, 3, 4, 5).findAny();
      System.out.println(optionalInt1.getAsInt());
      
   // Find whether any record greater than 2
      System.out.println("Find whether any record greater than 2");
      boolean anyRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).anyMatch((n) -> n > 2 );
      System.out.println(anyRecordGreaterThan); //true
      
   // Find whether ALL records greater than 2
      System.out.println("Find whether ALL records greater than 2");
      boolean allRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).allMatch((n) -> n > 2 );
      System.out.println(allRecordGreaterThan); //false
      

      // Find whether NONE of the record greater than 6
      System.out.println("Find whether NONE of the record greater than 6");
      boolean noneRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).noneMatch((n) -> n > 6 );
      System.out.println(noneRecordGreaterThan); //true
	}
}
