
package com.Lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;


public class Java8Study6 {
    public static void main(String[] args) {
        String[] names = {"banana", "watermelon", "apple", "orange", "mango"};
        // 請求出字母總和
        int sumw = 0;
        for(String s : names){
            sumw += s.length();
        }
        System.out.print(sumw);
        
        // 請求出NAMES長度是偶數的總和 ?
        int sum = Stream.of(names)
                .mapToInt(s -> s.length()) // .mapToInt(String::length)
                .filter(s -> s % 2 == 0)
                .sum();
        System.out.println(sum);       
    }
    }

