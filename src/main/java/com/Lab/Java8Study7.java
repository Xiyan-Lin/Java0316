
package com.lab;

import java.util.stream.Stream;


public class Java8Study7 {
    public static void main(String[] args) {
        String[][] names = {{"Jo", "Mary"}, {"John", "Helen"}, {"Bob"}};
        // 求所有字母總和
        int sum1 = 0;
        for(String[] i : names){
            for(String k : i){
                sum1 += k.length();
            }
        }
        System.out.println(sum1);
        // 串流式
        int sum = Stream.of(names)
                .flatMap(s -> Stream.of(s)) //String[] 轉 Stream
                .mapToInt(s -> s.length())
                .sum();
        System.out.print(sum);
    }
}
