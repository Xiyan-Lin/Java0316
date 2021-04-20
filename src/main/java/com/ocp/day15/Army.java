
package com.ocp.day15;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;


public class Army {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        Car [] cars = {tank, truck};
        Weapon[] weapons = {fighter, tank};
        
        Stream.of(cars).forEach(c -> c.move());
        Stream.of(weapons).forEach(Weapon :: shoot);
        
        // 請問Fighter, tank, truck 總油耗= ?
        Oil[] oils = {fighter, tank, truck};
        IntSummaryStatistics stat = Stream.of(oils)
                            .mapToInt(Oil :: spend)
                            .summaryStatistics();
        System.out.println(stat.getSum());
                }
}
