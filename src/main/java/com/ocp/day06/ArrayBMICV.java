package com.ocp.day06;

import java.util.Arrays;


public class ArrayBMICV {
    public static void main(String[] args) {
       String[] names = {"A", "B", "C", "D", "E"}; 
       double[] h = {172, 168, 164, 170, 176};
       double[] w = {62, 57, 58, 64, 64}; 
       Person[] persons = new Person[5];
       
       for(int i=0 ; i<persons.length ; i++ ){
        
       // 先建立一個 PERSON 物件 P       
       Person p = new Person(names[i], h[i], w[i]);
       // 將PERSON 物件 P 放入 PERSON[0]中
       persons[i] = p; 
       // 將資料印出
        System.out.println(persons[i]);
       }
       // 印出 BMI 值 
       for(Person p : persons){
           System.out.printf("bmi: %.1f\n", p.bmi);
       }
       // 並建立 double[] bmis 用來存放 BMI的資料
       double[] bmis = new double[5];
       for(int i=0 ; i< persons.length ; i++){
         bmis[i] = persons[i].bmi; 
    }
       // 印出bmis的資料
       System.out.println(Arrays.toString(bmis)); 
      
       // 計算 BMI CV
       double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI C.V: %.2f%%\n", bmi_cv*100);
    }   
    
}
