
package com.ocp.day17;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;


public class FunctionDemo {
    public static void main(String[] args) {
        // 利用function 來做園面積
        // 半徑 r 是整數， 面積area是浮點數
        Function<Integer, Double> f1 = (Integer r) -> Math.pow(r, 2) * Math.PI;
        System.out.println(f1.apply(10));
        // 利用function 來球體體積
        // 半徑 r 是整數， 體積 是浮點數
        Function<Integer, Double> f2 = (Integer r) -> 4.0/3.0 * Math.pow(r, 3);
        System.out.println(f2.apply(10));
        // 利用BiFunction 來做矩形面積
        BiFunction<Integer, Integer, Integer> f3 =(h, w) -> h*w;
        System.out.println(f3.apply(10, 20));
        // 利用BinaryOperator 來求矩形面積
        BinaryOperator<Integer> f4 =(h, w) -> h*w;
        System.out.println(f4.apply(10, 20));
        // 
        ObjDoubleConsumer <String> f5 = (name, value) -> System.out.println(name +":" + value);        
        f5.accept("小明", 100.0); 
        f5.accept("園面積", f1.apply(10));
        f5.accept("球體積", f2.apply(20));
    }
    

}