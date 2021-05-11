
package com.lab;

import java.util.Arrays;
import java.util.stream.IntStream;



public class Java8Study {
    public static void main(String[] args) {
        int[] scores = {80, 50, 70, 90, 40};
        // 請印出所有成績
        // JAVA 7 寫法
        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
        for (int s : scores){
            System.out.println(s);
        }
        // JAVA8 (利用Stream.of() 來進行資料分析)
        IntStream.of(scores).forEach(s -> System.out.println(s));
        IntStream.of(scores).forEach(System.out::println); // ::(方法參考)
    }
}
