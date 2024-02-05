package com.rv.JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
 
/**
 * Write Program to - Sequential vs ParallelStreams Example- in java 8
 */
public class SequentialVsParallelStreams {
    public static void main(String[] args) {
 
           long startNanoSec=0;
           long endNanoSec=0;
           int maxElements = 9992999;
           
           List<Integer> numberAr= new ArrayList<Integer>();
           for(int i=0;i<maxElements;i++){
                  numberAr.add(i);
           }
           
           System.out.println("No of elements to be counted using streams " + maxElements);
           
           
           //stream() method - Returns sequential Stream with this collection
           startNanoSec=System.nanoTime();
           Stream<Integer> sequentialStream = numberAr.stream();
           System.out.println("\n1. No of elements counted using sequential streams " + sequentialStream.count());
           endNanoSec=System.nanoTime();
           
           System.out.println("Time taken to count elements using sequential streams "+     (endNanoSec-startNanoSec)+" nanoSeconds");
 
           
           //sequential() method - Returns sequential Stream with this collection
           /*
            May return itself, either because
            the stream was already sequential, or
            the underlying stream state was modified to be sequential.
            
            */
           //Stream<Integer> sequentialStream1 = numberAr.stream().sequential();
           
           
           
           Stream<Integer> parallelStream = numberAr.parallelStream();
           //parallelStream() method - Returns parallel Stream with this collection
           startNanoSec=System.nanoTime();
           System.out.println("\n2. No of elements counted using PARALLEL streams " + parallelStream.count());
        endNanoSec=System.nanoTime();
 
           System.out.print("Time taken to count elements using PARALLEL streams "+   (endNanoSec-startNanoSec)+" nanoSeconds");
 
           //parallel() method - Returns an equivalent stream that is parallel.
           /*
           Method May return itself, either because
           the stream was already parallel, or
           because the underlying stream state was modified to be parallel.
           */
           //Stream<Integer> parallelStream1 = numberAr.stream().parallel();
           
           
    }
}
 
 
/*OUTPUT
 
No of elements to be counted using streams 9992999
 
1. No of elements counted using sequential streams 9992999
Time taken to count elements using sequential streams 50535819 nanoSeconds
 
2. No of elements counted using PARALLEL streams 9992999
Time taken to count elements using PARALLEL streams 14420674 nanoSeconds
*/
