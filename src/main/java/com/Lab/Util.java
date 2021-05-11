/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab;
import java.util.Random;
/**
 *
 * @author MB-study
 */
public class Util {
    // 取得 int[] 答案陣列
    public static int[] getAnsArray() {
        Random r = new Random();
        int[] ans = {0, 0, 0, 0,}; //new int[4];
        for(int i =0; i<ans.length;) {
            
        // 隨機取一個n值 (1~9)
        int n = r.nextInt(9) +1 ;
        boolean exist = isExist(ans, n);
        if (!exist) {
            ans[i] = n;
            i++;
        }
        }
       return ans;
        
    }
    // 判斷n值是否在 ans[] int陣列中
    public static boolean isExist( int[] ans, int n) {
        for(int i=0; i<ans.length; i++) {
            if( ans[i] == n){
            return true;
        }
    }
    return false;
}
}