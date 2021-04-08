
package com.ocp.day10;


public class Person {
    // 物件屬性
    private String names;
    private int age;
    private double height;
    private double weight;
    // 建構子
    public Person(int age, double height, double weight){
   }
    // 建構子
    public Person(String names, int age, double height, double weight) {
        this.names = names;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    // 物件方法(封裝)
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
