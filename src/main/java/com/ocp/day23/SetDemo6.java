
package com.ocp.day23;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetDemo6 {
    public static void main(String[] args) {
        // 利用HASHSET 加入資料
        Set<Integer> data = new HashSet<>();
        data.add(100);
        data.add(80);
        data.add(90);
        // 利用TREESET 查詢資料
        // 將HASHSET 轉 TREESET
        data = new TreeSet<>(data);
        System.out.println(data);
    }
}
