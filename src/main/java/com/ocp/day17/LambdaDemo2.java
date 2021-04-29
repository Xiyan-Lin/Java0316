
package com.ocp.day17;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //求總分與平均=?
        DoubleSummaryStatistics stat = Stream.of("國文" ,100.0, "英文",90.5, "數學",70.5 ,"座號",7)
                .filter(x -> x instanceof Double) // 從串流中取出 物件 Double
                .mapToDouble(x -> (double)x ) // 物件 Double 轉 基本 double 才會變成 DoubleStream
                //.peek(x -> System.out.println(x.getClass().getTypeName()))
                //.forEach(System.out::println);
                .summaryStatistics();
                
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
