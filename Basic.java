package com.rv.JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Basic {

	public static void main(String[] args) {
		
		// create a list and filter all even numbers from list.
		// this list can't be modified or can't add new value
		List<Integer>  list1= List.of(2,3,50,21,22,67);
		//list1.add(20);  >>>> this can't be add as List.of() is immutable.
		System.out.println("the value of list 1 "+list1);
		
		// we can add many values.
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		System.out.println("the value of list 2 "+list2);
		
		List<Integer> list3 = Arrays.asList(23,567,12,677,24);
		//list3.add(20); >> here also can't add it is unsupported exception and immutable.
		System.out.println("the value of list 3 "+list3);
		
		// fetch even number from list1
		// old method to fetch without stream
		List<Integer> evenlist = new ArrayList<>();
		for (Integer i : list1) {
			if (i%2==0) {
				evenlist.add(i);
			}
		}
		System.out.println("even number from list1 "+evenlist);
		
		// fetch the even number with stream Api.
		List<Integer> evenlist1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("even list with stream api "+evenlist1);
		
		
		// fetch the value which is greater than 10.
		List<Integer> list = list1.stream().filter(i-> i>10).collect(Collectors.toList());
		System.out.println("print the value from list1 which is greater than 10 "+list);
		
		//List<Integer> reverseList = list1.stream().filter(i->i.reverse(i)).collect(Collectors.toList());
		//System.out.println(reverseList);

		
	}
}
