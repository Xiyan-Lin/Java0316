
package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[] persons = {
           new Person("John" , 17, 170, 60.5),
           new Person("Mary" , 18, 160, 50.5),
           new Person("Jo"   , 19, 155, 42.5), 
           new Person("Helen", 16, 185, 75.5),
           new Person("Tom"  , 21, 190, 120.5),
        };
        // 建立計算BMI的計算邏輯，使用function<T,R>
        // T 代表 傳入參數型別 在這邊指的就是Person 物件也就是 p
        // R 代表 回傳資料型別 在這邊指的就是 Double 也就是 bmi 的計算結果
        Function<Person, Double> getBMI = p -> p.getWeight() / Math.pow(p.getHeight()/100, 2);
        //正常BMI的過濾器 Predicate<Person>
        //getBMI.apply(p) 取得 getBMI 的計算結果
        Predicate<Person> normalBmi = p -> getBMI.apply(p) > 18 && getBMI.apply(p)<= 23;
        //印出人名
        Consumer<Person> printName = p -> System.out.println(p.getNames()); 
        // 印出正確BMI的人名
        Stream.of(persons)
                .filter(normalBmi).forEach(p -> System.out.println(p.getNames()) );
    }
}
