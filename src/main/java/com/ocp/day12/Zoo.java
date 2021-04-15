
package com.ocp.day12;


public class Zoo{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        //cat.hunter(); // 因為 Cat 裡面沒有hunter()
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        // 多型宣告
        Cat cat2 = new Tiger();
        //cat2.hunter(); // 因為 Cat 裡面沒有hunter()
         
    }
}
