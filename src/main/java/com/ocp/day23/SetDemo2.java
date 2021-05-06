
package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetDemo2 {
    public static void main(String[] args) {
        // 國英數的分數是介於0-100之間
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);
        scores.add(true);
        System.out.println(scores);
        // 過濾資料
        Iterator iter = scores.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if (next instanceof Integer){
                if((int)next > 100 | (int)next < 0){ 
                    iter.remove();
                    continue;            
                }
            }
            if (next instanceof Double || next instanceof Boolean){
                iter.remove();
            }
            System.out.println(scores);
            // 球總分
            int sum = 0;
            Iterator iter1 = scores.iterator();
            while (iter.hasNext()) {
                Object next1 = iter.next();
                if (next instanceof Integer){
                    sum += (Integer)next;
                    
                }
            }
            System.out.println(sum);
        }
    }
}
