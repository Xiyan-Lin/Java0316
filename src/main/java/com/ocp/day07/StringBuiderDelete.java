/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day07;

/**
 *
 * @author MB-study
 */
public class StringBuiderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jave course");
        System.out.println("sb= "+sb);
        //刪除全部資料 
        sb.delete(0, sb.length()); //(0, 11)從零開始到<11的資料全部刪除
        System.out.println("sb=" +sb);  
    }
    
}
