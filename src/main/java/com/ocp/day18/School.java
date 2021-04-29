
package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class School {
    public static void main(String[] args) {
            Arrays.stream(DataCenter.getPeople())
                .peek(e -> System.out.println(e.getClass()))
                .forEach(System.out::println);
        // 請問考試的總分與平均 = ?
        IntSummaryStatistics state = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                //.map(x -> (Student)x).mapToInt(x -> x.getscore()) // 由Person 轉成 Student
                .mapToInt(x -> ((Student)x).getScore()) // 由Person 轉成 Student
                .summaryStatistics();
        System.out.println(state.getSum());
        System.out.println(state.getAverage());
        // 請問老師薪資總和與平均
        IntSummaryStatistics stats = Arrays.stream(DataCenter.getPeople())
                .filter(s -> s instanceof Teacher)
                .mapToInt(s -> ((Teacher)s).getSalary())
                .summaryStatistics();
       System.out.println(stats.getSum());
       System.out.println(stats.getAverage());
       // 印出不及格的 學生姓名，分數，老師姓名，以及不及格的總平均
        Consumer<Student> v = p -> System.out.printf("學生: %s, 分數:%d, 老師: %s\n",p.getName(), p.getScore(), p.getTeacher().getName());
        Predicate<Student> notPass = p -> p.getScore() < 60;
        
        double avg = Arrays.stream(DataCenter.getPeople())
               .filter(p -> p instanceof Student)
               .map(p -> (Student)p)
               .filter(notPass)
               .peek(v)
               .mapToInt(Student :: getScore)
               .average()
               .getAsDouble();
        System.out.println("不及格平均: " + avg);
               //.peek(e -> System.out.println(e.getClass()))
               //.forEach(System.out::println);
       
}
}