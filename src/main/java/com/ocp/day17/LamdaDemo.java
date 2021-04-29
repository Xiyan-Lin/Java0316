
package com.ocp.day17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LamdaDemo {
    public static void main(String[] args) {
        Stream.of(100,50,70,80,90)
                .peek(x -> System.out.println(x.getClass().getTypeName())) // Consumer 
                .forEach(x -> System.out.println(x)); // Consumer
       
        Stream.of(100,50,70,80,90)
               .filter(x -> x > 60) // Predicate
               .forEach(System.out::println ); // Consumer

        Stream.of("Mary", "John","Bob","Helen")
                .mapToInt(x -> x.length()) // Function
                .forEach(System.out::println); //Consumer
    
    }
}