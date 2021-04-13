package com.ocp.day11;

import java.util.stream.Stream;

public class ExtendsDemo {

    public static void main(String[] args) {
        // 操作 eemployee ，manager，Director
        Employee e1 = new Employee();
        e1.setSalary(30000);
        Employee e2 = new Employee();
        e2.setSalary(40000);
        Employee e3 = new Employee();
        e3.setSalary(50000);
        //---------------------------------
        Manager m1 = new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);
        Manager m2 = new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        //-----------------------------------
        Director d1 = new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockOption(300_0000);
        //--------------------------------------------
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //------------------------------------
        // 請問總薪資是多少
        System.out.println("請問總薪資為多少:");
        Employee[] employees = {e1, e2, e3, m1, m2, d1};
        // java 7 
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            //System.out.println(employees[i]);
            sum += employees[i].getSalary();
        }
        System.out.printf("總薪資: %,d\n", sum);

        //java 7 (for-each)
        int sum2 = 0;
        for (Employee e : employees) {
            //System.out.println(e);
            sum2 += e.getSalary();
        }

        // java 8 
       int sum3 = Stream.of(employees)
               .mapToInt(e -> e.getSalary())
               .sum();
        System.out.printf("總薪資: %,d\n", sum3);
        // java 8 {使用方法參考 ::}
        int sum4 = Stream.of(employees)
                .mapToInt(Employee :: getSalary)
                .sum();
        System.out.printf("總薪資: %,d\n", sum4);
        // 請問manager 的總薪資是多少
        System.out.println("請問manager總薪資為多少:"); 
        // java 7
        int sum5 = 0;
        for(Employee e : employees){
            //System.out.println(e.getClass().getSimpleName());
            if(e.getClass().getSimpleName().equals("Manager")) {
            sum5 += e.getSalary();
            }
            if(e.getClass().getSimpleName().equals("Director")) {
            sum5 += e.getSalary();
            }
   
        }
        System.out.printf("Manager總薪資: %,d\n", sum5);
        // Java 8 
        int sum6= Stream.of(employees)
                .filter(e -> e.getClass().getSimpleName().equals("Manager") ||
                             e.getClass().getSimpleName().equals("Director"))
                .mapToInt(Employee :: getSalary)
                .sum();
        System.out.printf("Manager 新薪資: %,d\n", sum6);
        // 請問manager 的總薪資是多少  PART II
        System.out.println("請問 Manager 總薪資(salary)是多少");
        // 利用instanceof 運算子
        for(Employee e : employees){
        System.out.println(e instanceof Manager);
    }               
        int sum7 = Stream.of(employees)
                .filter(e -> e instanceof Manager)
                .peek(e -> System.out.println(e)) //顯示串流目前的樣子
                .mapToInt(Employee :: getSalary)
                .sum();
        System.out.printf("Manager 總薪資: %,d\n", sum7);
        
    
    }
}
