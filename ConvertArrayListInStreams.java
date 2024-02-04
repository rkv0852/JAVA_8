package com.rv.JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write Program to - Convert ArrayList in Streams - in java 8.
 */
public class ConvertArrayListInStreams {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Ravindra");
		nameList.add("Sopy");
		nameList.add("Vineet");
		nameList.add("akshra");
		nameList.add("soni");
		nameList.add("Anup");
		nameList.add("raj");
		
		// In one line display all records that start with 'a' in stringList
		System.out.println("===In one line display all records that start with 'a' in stringList===");
		nameList.stream()                             // Convert list (ArrayList) to Stream
		.filter(name -> name.startsWith("A"))       // Filter all record which starts with "A"
		.forEach(System.out::println);                // Displays records which starts with "A"
		
		System.out.println("=========this will print name start with both a or A ==========================");
		nameList.stream()
		.filter(name -> name.substring(0, 1).equalsIgnoreCase("a"))
		.forEach(System.out::println);
		
		List<String> nameList1 = Arrays.asList("Ravindra","Sopy","Vineet","anup","soni","akshra","raj");
		
		System.out.println("====this will print the name start with letter r only===");
		nameList1.stream()
		.filter(name -> name.startsWith("r"))
		.forEach(System.out::println);
		
		System.out.println("=========this will print name start with both a or A ==========================");
		List<String> list = nameList.stream()
		.filter(name -> name.substring(0, 1).equalsIgnoreCase("a"))
		.collect(Collectors.toList());
		System.out.println(list);
		
		// In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList
		System.out.println("In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList");
		List<String> list1 = nameList1.stream()
				.filter(name -> name.substring(0, 1).equalsIgnoreCase("a"))
				.sorted()                      //SORT the list (ASCENDING order)
				.collect(Collectors.toList());
		System.out.println(list1);
		
		// In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
		System.out.println("In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList");
		
		nameList1.stream()
		.filter(name -> name.substring(0, 1).equalsIgnoreCase("a"))
		.sorted((a,b) -> b.compareTo(a))     //SORT the list (DESCENDING order)
		.forEach(System.out::println);
		
		// In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
		System.out.println("In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList");
		
		nameList1.stream()
		.filter(name -> name.startsWith("a"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		// In one line find whether any record start with 'a' in stringList
		System.out.println("In one line find whether any record start with 'a' in stringList");
		boolean b = nameList1.stream()
		.anyMatch(name -> name.startsWith("a"));
		System.out.println("any record start with letter a: "+b);
		
		// In one line find whether all records start with 'a' in stringList
		System.out.println("In one line find whether all records start with 'a' in stringList");
		boolean c = nameList1.stream()
				.allMatch(name -> name.startsWith("a"));
		System.out.println("all records start with 'a': "+c);

		//In one line find whether none of the records start with 'b' in stringList
		System.out.println("In one line find whether none of the records start with 'b' in stringList");
		
		boolean d = nameList.stream()
				.noneMatch(name -> name.startsWith("b"));
		System.out.println("one of the records start with 'b': "+d);
		
		// In one line count records start with 'a' in stringList
		System.out.println("In one line count records start with 'a' in stringList");
		long n = nameList.stream()
				.filter(name -> name.startsWith("a"))
				.count();
		System.out.println("count records start with 'a' "+n);
		
		//print all the name which contains letter a
		System.out.println("print all the name which contains letter a");
		nameList1.stream()
		.filter(name -> name.contains("a"))
		.forEach(System.out::println);
		
		//print all the name which had letter a at the end
		System.out.println("print all the name which had letter a at the end");
		nameList.stream()
		.filter(name -> name.endsWith("a"))
		.forEach(System.out::println);
		
		// print the name which is equal to Ravindra
		System.out.println("print the name which is equal to Ravindra");
        nameList.stream()
		.filter(name -> name.equals("Ravindra"))
		.forEach(System.out::println);
        
        // print the name which is equal to Ravindra but paasing as ravindra
        System.out.println("print the name which is equal to Ravindra but paasing as ravindra");
        nameList.stream()
		.filter(name -> name.equalsIgnoreCase("ravindra"))
		.forEach(System.out::println);
	}
}


// *****************   OUTPUT  **********************

/*
 In one line display all records that start with 'a' in stringList
Anup
=========this will print name start with both a or A ==========================
akshra
Anup
====this will print the name start with letter r only===
raj
=========this will print name start with both a or A ==========================
[akshra, Anup]
In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList
[akshra, anup]
In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
anup
akshra
In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stringList
AKSHRA
ANUP
In one line find whether any record start with 'a' in stringList
any record start with letter a: true
In one line find whether all records start with 'a' in stringList
all records start with 'a': false
In one line find whether none of the records start with 'b' in stringList
one of the records start with 'b': true
In one line count records start with 'a' in stringList
count records start with 'a' 1
print all the name which contains letter a
Ravindra
anup
akshra
raj
print all the name which had letter a at the end
Ravindra
akshra
print the name which is equal to Ravindra
Ravindra
print the name which is equal to Ravindra but paasing as ravindra
Ravindra

*/