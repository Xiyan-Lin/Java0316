
package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;


public class SetDemo4 {
    public static void main(String[] args) {
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(-150);
        scores.add(90);
        scores.add(80);
        System.out.println(scores);
        //請用 JAVA8 計算國.英.數的總數
        int sum = scores.stream()
                      .mapToInt(Integer::intValue)
                      .filter(Score :: isValid)
                      .sum();
        System.out.println(sum);
    }
}
