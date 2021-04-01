/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][] m = {{100 , 90 ,80} , {70, 60 , 50}};
      //int[][] m = new [][]{{100 , 90 ,80} , {70, 60 , 50}};
        System.out.println(m[0]);
        System.out.println(m[1]);
        // 求總分= ? 
        
        int sum = 0; 
         for (int[] x : m) {
            for (int y : x) {
               sum += y;
                
            }
        }
         System.out.println(sum);
    }
}
